import java.util.Scanner;
public class pereza2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Inserte el numero a");
        double a = sc.nextDouble();
        System.out.println("Inserte el numero n");
        int n = sc.nextInt();
        System.out.println("El resultado es: " + segunda(a,n));

    }
    public static double segunda(double a, int n){
        if (n == 0) {
            return 1.0;
        } else if (n > 0) {
            return a * segunda(a, n - 1);
        } else {
            // Manejo de exponentes negativos
            return 1.0 / (a * segunda(a, -n - 1));
        }

    }
}
