import java.util.Scanner;

public class prueba {
    public static void main(String[] args) {
        double numero1;
        double numero2;
        double resultado;
        String respuesta;
        String si = "SI";
        Scanner sc = new Scanner(System.in);

        System.out.println("<Quieres sumar?>\n SI/NO");
        respuesta = sc.next();
        //Inicio bucle
        while (respuesta.equalsIgnoreCase(si)) {
            // Pido números
            System.out.println("Dime un número:");
            numero1 = sc.nextDouble();
            System.out.println("Dime el número que quieres sumarle:");
            numero2 = sc.nextDouble();

            // Sumo
            resultado = numero1 + numero2;
            System.out.println("El resultado es: " + resultado);

            // Pregunto si quiere volver
            System.out.print("¿Deseas volver a sumar?\n SI/NO: ");
            respuesta = sc.next();

        }


    }
}
