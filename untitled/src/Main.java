
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        double numero1;
        double numero2;
        double resultado;
        String respuesta;
        String si;
        Scanner numer1 =new Scanner(System.in);
        Scanner numer2 =new Scanner(System.in);
        Scanner resp =new Scanner(System.in);
        si = "SI";
            System.out.println("<Quieres sumar?>\n SI/NO");
            respuesta = resp.next();
            while (respuesta == si) {

                //Pido numeros
                System.out.println("Dime un numero:");
                numero1 = numer1.nextDouble();
                System.out.println("Dime el numero quieres sumarle:");
                numero2 = numer2.nextDouble();
                //sumo
                resultado = numero1 + numero2;
                System.out.println("El resultado es: " + resultado);
                //pregunto si quiere volver
                System.out.print("¿Deseas volver a sumar?\n Si/No");
                respuesta = resp.next();

            }

            }




        }

