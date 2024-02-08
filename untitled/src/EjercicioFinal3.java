import java.util.Scanner;

public class EjercicioFinal3 {
    public static void main(String[] args) {
        System.out.println("tu primera cifra de resolucion");
        Scanner sc = new Scanner(System.in);
        int resol1 = sc.nextInt();
        System.out.println("tu primera cifra de resolucion");
        int resol2 = sc.nextInt();
        int resolF = resol2;
        int resolF2 = resolF;
        int herz = 60;
        for (int i = 0; i < resol1 -1; i++) {
            resolF +=  resol2;



        }
        
        for (int i = 0; i < herz; i++){
            resolF2+=resolF;
        }
            resolF2-=resol2;
        System.out.println("el resultado es: " + resolF2);
    }
}
