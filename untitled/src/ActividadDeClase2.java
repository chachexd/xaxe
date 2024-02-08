import java.lang.String;
import java.util.Scanner;
public class ActividadDeClase2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Dime un numero: ");
        int n = scanner.nextInt();
        int [] array = new int[n];
        double mediaP;
        double mediaN;
        int contadorP = 0;
        int contadorN = 0;
        double sumaP = 0;
        double sumaN = 0;
        int ceros = 0;
        System.out.println("Dime " + n + " numeros: ");
        for (int i = 0; i < n; i++){

            array[i] = scanner.nextInt();
            if (array[i] < 0) {
                sumaN += array[i];
                contadorN ++;
            }
            else if (array[i] > 0){
                sumaP += array[i];
                contadorP ++;
            }
            else ceros ++;

        }
        mediaP = sumaP / contadorN;
        mediaN = sumaN / contadorP;
        System.out.println("Media de Positivos: " + mediaP);
        System.out.println("Media de Negativos: " + mediaN);
        System.out.println("Cantidad de ceros: " + ceros);



    }
}

