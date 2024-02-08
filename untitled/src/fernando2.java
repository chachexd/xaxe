import java.util.Arrays;
import java.util.Scanner;

public class fernando2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String[] a = {"e","i","k","m","p","q","r","s","t","u","v"};
        String[] b = {"p","v","i","u","m","t","e","r","k","q","s"};
        System.out.println("Dime una palabra");
        String palabra = scanner.nextLine();
        palabra = palabra.toLowerCase();
        codificar(a, b, palabra);

    }

    public static void codificar(String[] a, String[] b, String palabra) {
        String[] palabraBuena = palabra.split("");
        int contador = 0;
        for (int i = 0; i < palabraBuena.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (palabraBuena[i].equals(a[j])){
                    palabraBuena[i] = b[j];
                    System.out.println("He cambiado a " + a[j] + " por " + b[j] );
                    break;
                }

            }
        }
        System.out.println(Arrays.toString(palabraBuena));
        System.out.println("Su palabra codificada es:");
        for (int i = 0; i < palabraBuena.length; i++) {
            System.out.print(palabraBuena[i]);
        }

    }


}