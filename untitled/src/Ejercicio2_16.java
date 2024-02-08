import java.util.Scanner;
public class Ejercicio2_16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa un número: ");
        double numero = sc.nextDouble();
        numero = (numero < 0) ? -numero : numero;
        System.out.println("El numero absoluto es: " + numero);
    }
}