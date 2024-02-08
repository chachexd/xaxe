import java.util.Scanner;
import java.util.Arrays;
public class Entornos1 {
    public static void main(String[] args){
        int[] positivos = new int[0];
        int[] negativos = new int[0];
        int countP = 0;
        int countN = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Cuantos numeros vas a meter?");
        int numero = scanner.nextInt();
        for(int i = 0; i < numero; i++){
            System.out.println("dime un numero ");
            int n = scanner.nextInt();
            if (n < 0){
                negativos = (Arrays.copyOf(negativos, negativos.length + 1));
                negativos[countN] = n;
                countN++;
            }
            if (n > 0){
                positivos = (Arrays.copyOf(positivos, positivos.length + 1));
                positivos[countP] = n;
                countP++;
            }

        }
        System.out.println("La media de positivos es: " + media(positivos));
        System.out.println("La media de negativos es: " +media(negativos));

    }

    private static double media(int[] a) {
        double media = 0;
        for (int i = 0; i < a.length; i++) {
            media += a[i];
        }
        media /= a.length;
        return media;
    }

}
