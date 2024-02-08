import java.util.Scanner;
public class Ejercicio4T2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double numeroRandom = Math.random() * (1000) + 0;
        double dineros;
        System.out.println("<1> [Retirar Dinero] ");
        System.out.println("<2> [Verificar Saldo] ");
        System.out.println("<3> [Depositar Dinero] ");
        System.out.println("<0> [Salir] ");
        int nota = sc.nextInt();
        while(nota != 0){
            switch (nota) {
                case 1 -> {
                    System.out.println("Cuanto deseas Retirar:");
                    double retirar = sc.nextDouble();
                    if (retirar<numeroRandom){
                        dineros = numeroRandom - retirar;
                        System.out.println("Te has quedado con: "+ dineros +" Euros." );
                    } else if (retirar == numeroRandom) {
                        dineros = numeroRandom - retirar;
                        System.out.println("Te has quedado con menos dinero que el monedero de un catalan");
                    }
                    else{
                        System.out.println("estas pelaoloco no tienes pasta suficiente ;)");
                    }

                }
                case 2 -> {
                    System.out.println("Tienes: " + numeroRandom +" Euros");
                    System.out.println("<1> [Retirar Dinero] ");
                    System.out.println("<2> [Verificar Saldo] ");
                    System.out.println("<3> [Depositar Dinero] ");
                    System.out.println("<0> [Salir] ");
                    nota = sc.nextInt();
                }
                case 3 -> {
                    System.out.println("Cuanto deseas Ingresar:");
                    double ingresar = sc.nextDouble();
                    dineros = numeroRandom + ingresar;
                    System.out.println("Te has quedado con: "+ dineros +" Euros." );
                }
                default ->
                        System.out.println("Shouting Down");

            }

        }

    }
}