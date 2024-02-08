package clases;

import java.util.Scanner;

public class ejer8 {
    public static void main(String[] args){
        boolean encendido = true;
        int n=0;
        System.out.println("Dime tu Tweet: OJO MAXIMO 40 CARACTERES");
        Scanner scanner = new Scanner(System.in);
        String textillo = scanner.nextLine();
        texto textoNuevo = new texto(textillo);
        if(texto.text == null){
            System.out.println("Error");
        }
        while(encendido){
            System.out.println(texto.text);
            System.out.println("--------------------------------");
            System.out.println("1-Añadir caracter");
            System.out.println("2-Añadir cadena");
            System.out.println("3-Numero de Vocales");
            System.out.println("4-Info");
            int i = scanner.nextInt();
            switch(i){
                case 1: aniadirCaracter(scanner, textoNuevo, textillo);
                case 2: aniadirCadena(scanner, textoNuevo, textillo);
            }
        }
    }

    private static void aniadirCadena(Scanner scanner, texto textoNuevo, String textillo) {
        System.out.println("Dime tu cadena a añadir:");
        String caracter = scanner.next();
        System.out.println("Donde los quieres añadir? \n 1-princio \n 2-final");
        int opcion = scanner.nextInt();
        switch (opcion){
            case 1: textillo = caracter+textillo;break;
            case 2: textillo+=caracter;break;
            default:
                System.out.println("argumento no valido");
        }
        textoNuevo = new texto(textillo);

    }

    public static void aniadirCaracter(Scanner scanner, texto textoNuevo, String textillo ) {
        System.out.println("Dime tu caracter a añadir:");
        String caracter = scanner.next();
        if(caracter.length() > 1){
            System.out.println("esto es una cadena no un caracter");
        }else{
            System.out.println("Donde los quieres añadir? \n 1-princio \n 2-final");
            int opcion = scanner.nextInt();
            switch (opcion){
                case 1: textillo = caracter+textillo;break;
                case 2: textillo+=caracter;break;
                default:
                    System.out.println("argumento no valido");
            }
            textoNuevo = new texto(textillo);
        }

    }
}
