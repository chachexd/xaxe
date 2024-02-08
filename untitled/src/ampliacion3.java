
import java.util.Scanner;

public class ampliacion3 {
    public static void main(String[] args) {
        //Declaro variables
        int hormigas;
        int aranas;
        int cochinillas;
        int total;
        Scanner sc = new Scanner(System.in);

        // Pido los segundos
        System.out.print("¿Cuantas hormigas hay?: ");
        hormigas = sc.nextInt();

        System.out.print("¿Cuantas arañas hay?: ");
        aranas = sc.nextInt();


        System.out.print("¿Cuantas cochinillas hay?: ");
        cochinillas = sc.nextInt();


        // Calculpatitas
        hormigas *= 6;
        aranas *= 8;
        cochinillas *= 14;
        total = hormigas + aranas + cochinillas;
        // Imprimo el resultado
        System.out.println("hay un total de " + total + " patas");


    }
}