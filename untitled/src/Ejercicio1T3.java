import java.util.Scanner;
public class Ejercicio1T3 {

    public static void main(String[] args) {
        double numero;
        boolean yes = true;
        Scanner sc = new Scanner(System.in);

        System.out.println("Dime un numero");
        numero = sc.nextDouble();
        while (numero != 0) {
            if ((numero % 2) == 0) {
                System.out.println("El Numero es Par");

            } else {
                System.out.println("El Numero es Inpar");
            }
            if (numero >= 0) {
                System.out.println("El Numero es Positivo");

            } else {
                System.out.println("El Numero es Negativo");

            }
            numero = Math.pow(numero, 2);
            System.out.println("Su cuadrado es: " + numero);
            System.out.println("Dime un numero");
            numero = sc.nextDouble();
        }
        System.out.println("JEJE ADIOS");



    }
}