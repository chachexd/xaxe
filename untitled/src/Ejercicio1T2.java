import java.util.Calendar;
import java.util.Scanner;

public class Ejercicio1T2 {
    public static void main(String[] args) {
        
        Calendar cal= Calendar.getInstance();
        int year= cal.get(Calendar.YEAR);
        double tributo;
        final double minimo = 67.5;
        final int edad;
        int ano;
        Scanner sc = new Scanner(System.in);

        //Pido el peso del tributo y lo recojo por teclado, luego muestro si el individuo podria pasar o no
        System.out.println( "Peso del tributo: ");
        tributo = sc.nextDouble();
        if(tributo >= minimo){
            System.out.println( "PUEDE PASAR" );
            System.out.println( "Dime tu año de nacimiento:" );
            ano = sc.nextInt();
            edad = year - ano;
            if(edad <= 50){
            System.out.println( "<Estarías en la Zona1>" );

            }
            else if (edad <= 100){
                System.out.println( "<Estarías en la Zona2>" );

            }
            else if (edad <= 1000){
                System.out.println( "<Estarías en la Zona3>" );

            }
            else{
                System.out.println( "<Illo muerete ya no? ;)>");

            }
        }                   
        else{
            System.out.println( "NO PUEDE PASAR" );
        }
        
    }
}