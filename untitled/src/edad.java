import java.util.Scanner;

public class edad {
    public static void main(String[] args) {

        boolean mayorDeEdad;
        int edad;
        int MAYORDEEDAD = 18;
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime tu edad: ");

        edad = sc.nextInt();

        System.out.println((edad >= MAYORDEEDAD) ? "ES MAYOR DE EDAD" : "ES MENOR DE EDAD");
        
    }
}
