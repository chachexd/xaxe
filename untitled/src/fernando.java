import java.lang.String;
import java.util.Arrays;
import java.util.Scanner;
import static java.lang.Math.*;
public class fernando {
    public static void main(String[] args){
        boolean programa = true;

        while(programa){

            System.out.println("---------------------------------------------------------");
            System.out.println("Introduce el nº correspondiente del ejercicio a realizar.");
            System.out.println("1 - version 1.");
            System.out.println("2 - version 2.");
            System.out.println("0 - Salir del programa");
            System.out.println("---------------------------------------------------------");

            Scanner sc = new Scanner(System.in);
            int opcion = sc.nextInt();

            switch (opcion){
                case 1: version1(); break;
                case 2: version2(); break;
                case 0: programa = false; break;
                default:
                    System.out.println("Has introducido de forma incorrecta el nº del ejercicio, por favor prueba de nuevo.");
            }


        }

    }
    public static void version2(){
        boolean acertado = false;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Jugador1, dime una contraseña: ");
        String c1 = scanner.nextLine();
        System.out.println("Jugador1, tiene una contraseña de: " + c1.length());
        while (!acertado){

            System.out.println("Jugador2, dime una contraseña: ");
            String c2 = scanner.nextLine();
            acertado= comprobar(c1, c2,  acertado);
            pistas(c1, c2);
        }
        System.out.println("Felicidades has acertado!");
    }

    private static void pistas(String c1, String c2) {
        int n = Math.max(c1.length(), c2.length());
        String[] array1;
        String[] array2;
        String[] acertados = new String[n];
        array1 = c1.split("|");
        array2 = c2.split("|");

        for (int i = 0; i < c1.length(); i++){
            if(array1[i].equals(array2[i])) acertados[i] = array1[i];
            else acertados[i] = "*";
        }
        for (int i = acertados.length -1; i > 0; i--){
            if(acertados[i] == null) acertados= Arrays.copyOf(acertados, acertados.length -1);
            else break;
        }
        System.out.println(Arrays.toString(acertados));

    }

    public static void version1(){
        boolean acertado = false;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Jugador1, dime una contraseña: ");
        String c1 = scanner.nextLine();
        while (!acertado){

            System.out.println("Jugador2, dime una contraseña: ");
            String c2 = scanner.nextLine();
            acertado= comprobar(c1, c2,  acertado);
            noAcertado(c1, c2);
        }
        System.out.println("Felicidades has acertado!");
    }

    private static void noAcertado(String c1, String c2) {
        if(c1.length()>c2.length()) System.out.println("La contraseña del Jugador1 es mayor");
        else if (c1.length() == (c2.length())) System.out.println("La contraseña de los jugadores tienen la mismam longitud");
        else System.out.println("La contraseña del Jugador1 es menor");
    }

    public static boolean comprobar(String c1, String c2, boolean acertado) {
        if(c1.equals(c2)){
            acertado = true;
        }
        return acertado;
    }
}