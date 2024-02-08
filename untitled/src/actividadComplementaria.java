import java.util.Scanner;
import java.util.Arrays;
public class actividadComplementaria {
    public static void main(String[] args) {
        System.out.println("Dime la longitud: ");
        Scanner scanner = new Scanner(System.in);
        int longitud = scanner.nextInt();
        System.out.println("Dime el fin: ");
        int fin = scanner.nextInt();

        int[] rellenaPares = new int[longitud];

        for (int i = 0; i < rellenaPares.length; i++) {
            int par = (int) (Math.random()* (fin+1));
            if (par%2 == 0) {
                rellenaPares[i] = par;
            }
            else{
                i--;
            }


        }
        Arrays.sort(rellenaPares);
        System.out.println(Arrays.toString(rellenaPares));
    }
}
