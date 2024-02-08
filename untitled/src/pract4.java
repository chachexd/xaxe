
import java.util.Scanner;

public class pract4 {
    public static void main(String[] args){
        double primer;
        double segundo;
        double tercero;
        double aprobado = 5;
        double media;

        Scanner sc = new Scanner(System.in);

        System.out.println("Dime la nota del primer trimestre: ");
        primer = sc.nextDouble();
        System.out.println("Dime la nota del segundo trimestre: ");
        segundo = sc.nextDouble();
        System.out.println("Dime la nota del tercero trimestre: ");
        tercero = sc.nextDouble();

        media = (primer + segundo + tercero) / 3;
        System.out.println("Tu media es: " +media);
        media = Math.round(media);
        System.out.println("Es decir un:  " +media);
        System.out.println((media >= aprobado) ? "Has aprobado" : "Has suspendido");
    }
}




