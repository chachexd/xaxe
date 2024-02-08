import java.util.Scanner;

public class ActividadDeClase3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dime el tamaño del array: ");
        int n = scanner.nextInt();

        double mayor = 0;
        double [] numeros = new double[n];
        System.out.println("Dime " + n + " numeros: ");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = scanner.nextDouble();
            if (numeros[i] > mayor){
                mayor=  numeros[i];

            }
        }
        for (int i = numeros.length; i > 0; i--){
            System.out.println(numeros[i-1]);

        }

        System.out.println("El mayor es: " + mayor);

    }

}
