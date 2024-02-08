import java.util.Scanner;
import java.util.Arrays;
public class Actividad9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contador = 0;
        System.out.println("Dime las 5 notas del primer participante: ");
        int [] notas1 = new int[5];
        int participante1 = participante(notas(notas1), contador);
        System.out.println(participante1);
        contador++;

        System.out.println("Dime las 5 notas del segundo participante: ");
        int [] notas2 = new int[5];
        int participante2 = participante(notas(notas2), contador);
        System.out.println(participante2);
        contador++;

        System.out.println("Dime las 5 notas del tercer participante: ");
        int [] notas3 = new int[5];
        int participante3 = participante(notas(notas3), contador);
        System.out.println(participante3);
        contador++;

        System.out.println("Dime las 5 notas del cuarto participante: ");
        int [] notas4 = new int[5];
        int participante4 = participante(notas(notas4), contador);
        System.out.println(participante4);
        contador++;

        System.out.println("Dime las 5 notas del quinto participante: ");
        int [] notas5 = new int[5];
        int participante5 = participante(notas(notas5), contador);
        System.out.println(participante5);
        contador++;

        int[] notasT = { participante1, participante2, participante3, participante4, participante5};
        Arrays.sort(notasT);

        boolean extra = true;

        while (extra){

            System.out.println("hay algun extra mas?: ");
            System.out.println("1:SI\n -1:NO");

            int n = sc.nextInt();
            if (n == 1){
                contador++;
                System.out.println("Dime las notas de este participante extra: ");
                notasT = Arrays.copyOf(notasT, notasT.length+1);
                int [] notasE = new int[5];
                int participanteE = participante(notas(notasE), contador);
                notasT[contador-1] = participanteE;
                System.out.println(participanteE);
            }
            else if (n == -1){
                extra = false;
            }
        }
        System.out.println(Arrays.toString(notasT));



    }
    public static int participante(int[] notas, int contador){
        int a = 0;
        for (int i = 0; i < notas.length; i++) a += notas[i];
        return a;
    }
    public static int[] notas(int[] notas){
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < notas.length; i++) {
            notas[i] = sc.nextInt();
        }
        return notas;
    }

}
