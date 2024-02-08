import java.util.Arrays;
import java.util.Scanner;
public class ActividadDeClase5 {
    public static void main(String[] args) {
        System.out.println("Dime la longitud: ");
        Scanner scanner = new Scanner(System.in);
        int longitud = scanner.nextInt();
        System.out.println("Dime un fin: ");
        int fin = scanner.nextInt();
        int [] numbers = new int[longitud];
        encontrarNumero(numbers, fin);

    }
    public static void encontrarNumero(int[] numbers, int fin) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random()* (fin+1));
        }
        System.out.println("Dime el numero que deseas encontrar: ");
        int encontrar = scanner.nextInt();

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] != encontrar) {
                System.out.println("Estoy en la posicion " + i + " del array y no he encontrado nada");
            }
            else {
                System.out.println("Estoy en la posicion " + i + " del array y he encontrado el " + encontrar + " por primera vez");
                break;
            }
        }
        System.out.println(Arrays.toString(numbers));
    }
}
