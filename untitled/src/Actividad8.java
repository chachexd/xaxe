import java.util.Arrays;
import java.util.Scanner;

public class Actividad8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x;
        int [] tablaOriginal;


        System.out.println("Que capacidad tiene la tabla");

        x= sc.nextInt();

        tablaOriginal=new int[x];

        for (int i = 0; i < tablaOriginal.length; i++) {
            tablaOriginal[i]=(int) (Math.random()*50)+1;
            i++;
        }
        System.out.println(Arrays.toString(tablaOriginal));


        int pares = 0;
        int impares = 0;
        for (int j = 0; j <tablaOriginal.length ; j++) {
            if (tablaOriginal[j]%2==0) pares++;
            else impares++;

        }
        int [] tablaPar;
        tablaPar = new int[pares];
        int [] tablaImpar;
        tablaImpar = new int[impares];
        int contador2 = 0;
        int contador3 = 0;
        for (int j = 0; j <tablaOriginal.length ; j++) {
            if (tablaOriginal[j]%2==0){
                tablaPar[contador2] = tablaOriginal[j];
                contador2++;
            }
            else{
                tablaImpar[contador3] = tablaOriginal[j];
                contador3++;
            }
        }
        Arrays.sort(tablaPar);
        Arrays.sort(tablaImpar);
        System.out.println("Tabla de numeros Pares");
        System.out.println(Arrays.toString(tablaPar));
        System.out.println("Tabla de numeros Impares");
        System.out.println(Arrays.toString(tablaImpar));


    }
}