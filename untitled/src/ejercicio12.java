import java.util.Scanner;

public class ejercicio12 {

    public static void main(String[] args) {

        int[][] matriz = new int[5][5]; //matriz de tamaño 5x5

        for (int n = 0; n<matriz.length; n++){
            for (int m = 0; m<matriz.length;m++){
                matriz[n][m] = 10 * (n + m);
                if(matriz[n][m] == 0){
                    System.out.print(matriz[n][m] + "0 ");
                }else {
                    System.out.print(matriz[n][m] + " ");
                }
            }
            System.out.println("");
        }

    }






    //Suponiendo que la dimension de la x y la y es la misma
    public static void recorreMatrizBidimensional(int[][] matriz){
        for (int x = 0; x < matriz.length; x++){
            for (int y = 0; y < matriz.length; y++){
                System.out.print(matriz[x][y] + " ");
            }
            System.out.println("");
        }
    }

    public static void rellenaMatriz(int[][] matriz){
        for (int x = 0; x < matriz.length; x++){
            for (int y = 0; y < matriz.length; y++){
                matriz[x][y] = new Scanner(System.in).nextInt();
            }
        }
    }

    public static void rellenaMatriz(int[][][] matriz){
        for (int x = 0; x < matriz.length; x++){
            for (int y = 0; y < matriz[0].length; y++){
                for (int z = 0; z < matriz[0][0].length; z++) {
                    matriz[x][y][z] = new Scanner(System.in).nextInt();
                }

            }
        }
    }

    public static int[][] generaMatrizBidimensional(){
        System.out.println("Introduce la longitud");
        int x = new Scanner(System.in).nextInt();
        System.out.println("Introduce la anchura");
        int y = new Scanner(System.in).nextInt();

        //Voy a crear un array bidimensional(x e y) 3x3 de enteros
        return new int[x][y];
    }

    public static int[][] generaMatrizBidimensional(int x, int y){
        //Voy a crear un array bidimensional(x e y) 3x3 de enteros
        return new int[x][y];
    }
    public static int[][][] generaMatrizTridimensional(){
        System.out.println("Introduce la longitud");
        int x = new Scanner(System.in).nextInt();
        System.out.println("Introduce la anchura");
        int y = new Scanner(System.in).nextInt();
        System.out.println("Introduce la profundidad");
        int z = new Scanner(System.in).nextInt();

        //Voy a crear un array bidimensional(x e y) 3x3 de enteros
        return new int[x][y][z];
    }
    public static int[][][] generaMatrizTridimensional(int x, int y, int z){
        //Voy a crear un array bidimensional(x e y) 3x3 de enteros
        return new int[x][y][z];
    }

}
