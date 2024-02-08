import java.util.Arrays;
import java.util.Scanner;

public class Actividad10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x;
        int [] tablaOriginal;
        int contador = 0;

        System.out.println("Que capacidad tiene la tabla");

        x= sc.nextInt();

        tablaOriginal=new int[x];

        for (int i = 0; i < tablaOriginal.length; i++) {
            tablaOriginal[i]=(int) (Math.random()*50 )+1;

        }
        Arrays.sort(tablaOriginal);
        System.out.println(Arrays.toString(tablaOriginal));
        System.out.println("Numero: ");
        int numero = sc.nextInt();
        System.out.println(Arrays.toString(numeroMayor(tablaOriginal, numero, contador)));
        System.out.println("🤣🤣");

    }

    public static int[] numeroMayor(int[] tablaOriginal, int numero, int contador){
        boolean encontrado = true;
        while (encontrado){
            for (int i = 0; i < tablaOriginal.length; i++) {
                if (tablaOriginal[i] > numero){
                    encontrado = false;
                }
                else{
                    contador++;
                }
            }
        }

        tablaOriginal = Arrays.copyOf(tablaOriginal, tablaOriginal.length - (tablaOriginal.length - contador));
        return tablaOriginal;
    }


}
