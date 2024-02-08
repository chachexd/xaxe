import java.util.Scanner;
public class Ejercicio2T3 {
    public static void main(String[] args) {
        int numeroSecreto = (int) (Math.random() * 100 + 1);
        int numero;
        Scanner sc = new Scanner(System.in);
        System.out.println("<-El Numero secreto->\n<-Dime un numero:->");
        numero = sc.nextInt();
        while (numero != -1) {
            if (numero != numeroSecreto) {
                if (numero > numeroSecreto) {
                    System.out.println("<-El Numero secreto es menor que eso->");
                } else{
                    System.out.println("<-El Numero secreto es mayor que eso->");
                }
                System.out.println("<-Dime un numero: ->");
                numero = sc.nextInt();
            } else {
                System.out.println("<-¡¡HAS ACERTADO!!->");
                numero = -1;
            }
        }
        System.out.println("<-ADIOS->");
    }
}