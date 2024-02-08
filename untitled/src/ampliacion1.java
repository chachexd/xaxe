
import java.util.Scanner;

public class ampliacion1 {
    public static void main(String[] args) {
        //Declaro variables
        int segundos;
        int minutos;
        int horas;
        Scanner sc = new Scanner(System.in);

        // Pido los segundos
        System.out.print("¿Cuantos segundos deseas calcular?: ");
        segundos = sc.nextInt();

        // Calcular horas, minutos y segundos
        horas = segundos / 3600; 
        minutos = (segundos % 3600) / 60; 
        segundos = segundos % 60;

        // Imprimo el resultado
        System.out.println("Formato||HORA:MINUTOS:SEGUNDOS");
        System.out.println(horas+":"+minutos+":" + segundos);


    }
}