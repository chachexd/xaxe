import java.util.Scanner;

public class pereza1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Inserte el numero a");
        double a = sc.nextDouble();
        System.out.println("Inserte el numero n");
        int n = sc.nextInt();
        System.out.println("El resultado es: " + primera(a,n));
    }
    public static double primera(double a, int n) {
        double result = 1.0;
        for (int i = 0; i < n; i++) {
            result *= a;
        }
        return result;
    }
}
