import java.util.Scanner;

public class parinpar {
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
            if (resultado % 2 == 0)
            {
                System.out.println("Es: Par");
            }
            else{
                System.out.println("Es: Inpar");
            }
            //incrementro
            resultado = resultado + 1;
            System.out.println("Incremento: "+resultado);

            //decremento
            resultado = resultado - 2;
            System.out.println("Decremento: "+resultado);

            // Pregunto si quiere volver
            System.out.print("¿Deseas volver a sumar?\n SI/NO: ");
            respuesta = sc.next();

        }


    }
}
