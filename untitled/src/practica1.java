import java.util.Scanner;

public class practica1 {
    public static void main(String[] args) {

        
        int numero;
        int positivo = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un numero: ");

        numero = sc.nextInt();

        System.out.println((numero >= positivo) ? "ES POSITIVO" : "ES NEGATIVO");
        
    }
}
