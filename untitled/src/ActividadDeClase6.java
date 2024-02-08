import java.util.Arrays;
import java.util.Scanner;

public class ActividadDeClase6 {
    public static void main(String[] args) {

        int [] numbers = new int[6];
        int [] numbers2 = new int[6];
        encontrarNumero(numbers, numbers2);
    }
    public static void encontrarNumero(int[] numbers, int[] numbers2) {
        for (int i = 0 ; i < numbers.length ; i++) {
            numbers[i] = (int) (Math.random()* 9);
            numbers2[i] = (int) (Math.random() * 9);
        }
        int aciertos = 0;
        int fallos = 0;
        Arrays.sort(numbers2);
        for (int i = 0 ; i < numbers.length ; i++) {
            if (numbers[i] == numbers2[i]) aciertos++;
            else fallos++;
        }
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(numbers2));
        System.out.println("Has tenido " + aciertos + " aciertos.");
        System.out.println("Has tenido " + fallos + " fallos.");


    }
}
