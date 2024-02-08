
import java.util.Scanner;

public class ampliacion2 {
    public static void main(String[] args) {
        //Declaro variables
        double milimetros;
        double centimetros;
        double metros;
        double resultado;
        Scanner sc = new Scanner(System.in);

        // Pido los segundos
        System.out.println("RECUERDA USAR COMAS, NO PUNTOS, NO SOMOS GUIRIS ;) ");
        System.out.print("¿Cuantos milimetros tenemos?: ");
        milimetros = sc.nextInt() * 0.1;

        System.out.print("¿Cuantos centimetros tenemos?: ");
        centimetros = sc.nextInt();

        System.out.print("¿Cuantos metros tenemos?: ");
        metros = sc.nextDouble() * 100;

        // Calcular
        resultado = milimetros + centimetros + metros;
        // Imprimo el resultado
        System.out.println("Tu computo total es de:\n" + resultado + " centimetros");
       


    }
}