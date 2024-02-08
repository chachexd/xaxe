import java.util.Scanner;
public class Ejercicio2_17 {
    public static void main(String[] args) {
        int num1 = (int) ((Math.random()*99) + 1);
        int num2= (int) ((Math.random()*99) + 1);
        System.out.println("Suma los numeros: " + num1 + " y " + num2);
        Scanner sc = new Scanner(System.in);
        int resultado = sc.nextInt();
        if (resultado == (num1+num2)) System.out.println("Eso es correcto");
        else System.out.println("Eso es incorrecto, es: " + (num1+num2));
    }
}
