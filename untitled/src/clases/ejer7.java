package clases;

import java.util.Scanner;

public class ejer7 {
    public static void main(String[] args){
        int hora2 = 0;
        int segundos2;
        int minutos2 = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dime la hora:");
        int hora = scanner.nextInt();
        System.out.println("dime los minutos:");
        int minutos = scanner.nextInt();
        System.out.println("dime los segundos:");
        int segundos = scanner.nextInt();

        System.out.println("dime los segundos que desea añadir:");
        segundos2 = scanner.nextInt();

        if(segundos2 >= 60){
            minutos2 = segundos2 / 60;
            segundos %= 60;
            if (minutos2 >= 60){
                hora2 = minutos2 / 60;
                minutos2 %= 60;
            }

        }
        hora += hora2;
        minutos += minutos2;
        segundos += segundos2;
        if(segundos >= 60){
            minutos ++;
            segundos %= 60;
            if (minutos >= 60){
                hora ++;
                minutos %= 60;
                if (hora > 24) {
                    hora =0;
                }
            }

        }
        hora horaNueva = new hora (hora,minutos,segundos);

        System.out.println(horaNueva.hora+":"+horaNueva.minutos+":"+horaNueva.segundos);
    }
}
