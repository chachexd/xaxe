import java.util.Scanner;
public class ejercicio15 {
    public static void main(String[] args){
        int [][] mapa = new int [5] [5];
        for (int i = 0; i < mapa.length; i++) {
            for (int j = 0; j < mapa[i].length; j++) {
                // Llenar la matriz con 0 o 1 de forma aleatoria
                mapa[i][j] = (int) (Math.random() * 2);
            }
        }
        for (int i = 0; i < mapa.length; i++) {
            for (int j = 0; j < mapa[i].length; j++) {
                System.out.print(mapa[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Dime tus coordenadas de inicio X: ");
        Scanner scanner = new Scanner(System.in);
        int xi = scanner.nextInt();
        System.out.println("Dime tus coordenadas de inicio Y: ");
        int yi = scanner.nextInt();
        System.out.println("Dime tus coordenadas de final X: ");
        int xf = scanner.nextInt();
        System.out.println("Dime tus coordenadas de final Y: ");
        int yf = scanner.nextInt();
        comprabar(xi, yi, xf, yf, mapa);
    }

    public static boolean comprabar(int xi, int yi, int xf, int yf, int[][] mapa) {
        int[][] coordenadas = new int[5][5];
        boolean result = false;
        if (xf == xi || yf < yi) {

        }
        return result;
    }
}
