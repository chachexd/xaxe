import java.util.Scanner;
public class Ejercicio3T2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca sus ingresos anueales: ");
        double ingreso;
        ingreso = sc.nextDouble();
        if (ingreso >= 0) {
            if (ingreso <= 10000) {
                ingreso *= 0.1;
                System.out.println("IMPUESTO A PAGAR: " + ingreso);
            }
            else if( ingreso >= 50000){
                ingreso *= 0.3;
                System.out.println("IMPUESTO A PAGAR: " + ingreso);
            }
            else {
                ingreso *= 0.2;
                System.out.println("IMPUESTO A PAGAR: " + ingreso);
            }
        }
        else {
            System.out.println("No es una cantidad valida");
        }
    }
}