import java.util.Scanner;
public class Ejercicio2_18 {
    public static void main(String[] args) {
        int num1 = (int) ((Math.random()*99) + 1);
        int num2= (int) ((Math.random()*99) + 1);
        int operacion= (int) ((Math.random()*3) + 1);
        switch (operacion){
            case 1 -> suma(num1 , num2);
            case 2 -> resta(num1 , num2);
            case 3 -> multiplicacion(num1 , num2);
        }


    }
    public static void suma(int num1 , int num2){
        System.out.println("Suma los numeros: " + num1 + " + " + num2);
        Scanner sc = new Scanner(System.in);
        int resultado = sc.nextInt();
        if (resultado == (num1+num2)) System.out.println("Eso es correcto");
        else System.out.println("Eso es incorrecto, es: " + (num1+num2));
    }
    public static void resta(int num1 , int num2){
        System.out.println("Resta los numeros: " + num1 + " - " + num2);
        Scanner sc = new Scanner(System.in);
        int resultado = sc.nextInt();
        if (resultado == (num1-num2)) System.out.println("Eso es correcto");
        else System.out.println("Eso es incorrecto, es: " + (num1-num2));
    }
    public static void multiplicacion(int num1 , int num2){
        System.out.println("Multiplica los numeros: " + num1 + " * " + num2);
        Scanner sc = new Scanner(System.in);
        int resultado = sc.nextInt();
        if (resultado == (num1*num2)) System.out.println("Eso es correcto");
        else System.out.println("Eso es incorrecto, es: " + (num1*num2));

    }
}
