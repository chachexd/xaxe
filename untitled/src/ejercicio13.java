public class ejercicio13 {
    public static void main(String[] args) {

        int[][] matriz = ejercicio12.generaMatrizBidimensional(2,2);
        ejercicio12.rellenaMatriz(matriz);
        //ejercicio12.recorreMatrizBidimensional(matriz);

//        int[][][] matriz2 = ejercicio12.generaMatrizTridimensional(3,3,3);
//        ejercicio12.rellenaMatriz(matriz2);
        //rotar la matriz
        rotarMatriz(matriz);



    }

    static void rotarMatriz(int[][] matriz){
        int temp, count = 0;
        System.out.println("-------------------------------");
        System.out.println(" Matriz antes  de la rotación  ");
        System.out.println("-------------------------------");
        ejercicio12.recorreMatrizBidimensional(matriz);
        for (int i = 0; i < matriz.length; i++) {
//            count++;
//            System.out.println("Iteración nº" + count);
            for (int j = i; j < matriz[0].length - i - 1; j++) { //La primera iteración sería la i=0 j=i/j=0
                temp = matriz[i][j]; //Creo una variable auxiliar para guardar el valor de mi posicióna actual
                matriz[i][j] = matriz[matriz.length - j - 1][i]; //Cambio el valor actual por el situado en j=1 i=0
                matriz[matriz.length - j - 1][i] = matriz[matriz.length - i - 1][matriz.length - j - 1]; //Cambio el valor situado en j=1 i=0 por i=1 j=1
                matriz[matriz.length - i - 1][matriz.length - j - 1] = matriz[j][matriz.length - i - 1]; //Cambio el valor situado en i=1 j=1 por j=0 i=1
                matriz[j][matriz.length - i - 1] = temp; //En j=0 i=1 pongo mi variable auxiliar guardada

            }
        }
        System.out.println("-------------------------------");
        System.out.println(" Matriz después de la rotación ");
        System.out.println("-------------------------------");
        ejercicio12.recorreMatrizBidimensional(matriz);
        System.out.println("-------------------------------");
    }

//    static void rotarMatriz(int[][][] matriz){
//        int temp, count = 0;
//        System.out.println("-------------------------------");
//        System.out.println(" Matriz antes  de la rotación  ");
//        System.out.println("-------------------------------");
//        ejercicio12.recorreMatrizBidimensional(matriz);
//        for (int i = 0; i < matriz.length; i++) {
////            count++;
////            System.out.println("Iteración nº" + count);
//            for (int j = i; j < matriz.length - i - 1; j++) { //La primera iteración sería la i=0 j=i/j=0
//                temp = matriz[i][j]; //Creo una variable auxiliar para guardar el valor de mi posicióna actual
//                matriz[i][j] = matriz[matriz.length - j - 1][i]; //Cambio el valor actual por el situado en j=1 i=0
//                matriz[matriz.length - j - 1][i] = matriz[matriz.length - i - 1][matriz.length - j - 1]; //Cambio el valor situado en j=1 i=0 por i=1 j=1
//                matriz[matriz.length - i - 1][matriz.length - j - 1] = matriz[j][matriz.length - i - 1]; //Cambio el valor situado en i=1 j=1 por j=0 i=1
//                matriz[j][matriz.length - i - 1] = temp; //En j=0 i=1 pongo mi variable auxiliar guardada
//
//            }
//        }
//        System.out.println("-------------------------------");
//        System.out.println(" Matriz después de la rotación ");
//        System.out.println("-------------------------------");
//        ejercicio12.recorreMatrizBidimensional(matriz);
//        System.out.println("-------------------------------");
//    }


}
