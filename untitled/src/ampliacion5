
import java.util.Scanner;

public class ampliacion4 {
    public static void main(String[] args) {
        //Declaro variables
        double importe;
        double nino;
        double adulto;
        double bono;
        Scanner sc = new Scanner(System.in);

        // Pido Numero de entradas
        System.out.println("¿Cuantos Niños hay?: ");
        nino = sc.nextDouble() * 15.50;

        System.out.println("¿Cuantos Adultos hay?: ");
        adulto = sc.nextDouble() * 20;

        // Calculos
        importe = nino + adulto;
        bono = importe - ((importe * 5) / 100);

        // Imprimo el resultado
        System.out.println( ( importe <= 100 ) ? "Pagame: " + importe +" euros" : "Pagame: " + bono + " euros");


    }
}