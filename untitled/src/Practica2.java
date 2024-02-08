import java.util.Scanner;
import java.lang.Integer;

class Practica2 {

    //-----------------------------------------EJERCICIO 1--------------------------------------------------------------
    static void ejercicio1(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un número entero:");

        //Declaro como Integer para luego poder usar la funcion de pasar a String
        Integer numero = sc.nextInt();
        //Ejecuto la funcion que me deletrara los digitos
        deletrear(cantidadDigitos(numero), numero);
        //Muestro la cantidad de Digitos
        System.out.println("Contiene un total de: " + cantidadDigitos(numero) + " Digitos");

    }
    static void deletrear(int numerosdeletreados, Integer numero){

        //SIEMPRE QUE I SEA MENOR AL NUMERO DE DIGITOS QUE POSEAMOS, VAMOS IR LEYENDO EL SIGUIENTE DIJITO
        for(int i =0; i < numerosdeletreados; i++ ){

            //GRACIAS A QUE EL NUMERO ERA IN INTEGER PODEMOS PASARLO A STRING E IR SACANDO EL CARACTER QUE NECESITAMOS SEGUN SU POSICION, EN ESTE CASO  "i"
            // (EL ORDEN EMPIEZA DESDDE 0)
            int numEntero = Integer.parseInt(String.valueOf(String.valueOf(numero).charAt(i)));
            System.out.println("Digito numero "+ (i+1) + ": " + numEntero);
        }



    }

    //FUNCION QUE NOS DIRA LA CANTIDAD DE DIGITOS
    static int cantidadDigitos(int numero) {
        //INICIO DEL CONTADOR
        int cantidadNumero = 0;
        while (numero > 0) {
            //CADA VEZ QUE EL BUCLE NOS PERMITA DIVIDIR ENTRE DIEZ SIGNIFICA QUE AUN HAY DIGITOS
            //POR LO CUAL VAMOS SUMANDO AL CONTADOR
            numero = numero / 10;
            cantidadNumero++;

        }

        return cantidadNumero;
    }

    //-----------------------------------------FIN EJERCICIO 1----------------------------------------------------------
    //-------------------------------------------EJERCICIO 2------------------------------------------------------------

    static void ejercicio2(){
        int ejercitoStark = (int) ((Math.random()*100) + 10);
        int ejercitoLannister = (int) ((Math.random()*100) + 10);
        int ronda = 1;

        while (ejercitoStark > 0 && ejercitoLannister > 0) {
            int tropasStark = enviadosCasa(ejercitoLannister);
            int tropasLamnister = enviadosCasa(ejercitoStark);
            int perdidosStark = (int)((Math.random() * tropasLamnister) + 1);
            int perdidosLannister = (int)((Math.random() * tropasStark) + 1);

            //RESTAMOS TROPAS PERDIDAS
            ejercitoStark -= perdidosStark;
            ejercitoLannister -= perdidosLannister;

            //EJECUTAMOS LA BATALLA
            peleilla(ronda, ejercitoStark, ejercitoLannister);

            //SUMAMOS LA RONDA
            ronda++;
        }
        // En caso de que alguno pierda mostramos el ganador
        winner(ejercitoStark, ejercitoLannister);
    }
    //ELEGIMOS CUANTOS SOLDADOS ENVIA CADA CASA
    public static int enviadosCasa(int enemigos) {
        return (int) ((Math.random()* enemigos) + 1);
    }

    //VAMOS A REALIZAR LA MUESTRA DE LA PELEA
    public static void peleilla(int ronda, int ejercitoStark, int ejercitoLannister) {
        System.out.println("Ronda " + ronda + ":");
        System.out.println("Ejército de la Casa Stark: " + ejercitoStark + " soldados");
        System.out.println("Ejército de la Casa Lannister: " + ejercitoLannister + " soldados\n");
    }

    //DECLARAMOS EL GANADOR
    public static void winner(int ejercitoStark, int ejercitoLannister) {
        if (ejercitoStark > ejercitoLannister) {
            System.out.println("Ha ganado la casa Stark");
        } else if (ejercitoLannister > ejercitoStark) {
            System.out.println("ha ganado la Casa Lannister");
        }
    }

    //-----------------------------------------FIN EJERCICIO 2----------------------------------------------------------
    //-------------------------------------------EJERCICIO 3------------------------------------------------------------

    static void ejercicio3(){
        //Rellena con tu código aquí
        Scanner sc = new Scanner(System.in);
        //INICIAMOS CON UN ESTADO DE CALCULADORA ENCENDIDA EN TRUE PARA MANTENERNOS MIENTRAS LO DESEEMOS
        boolean calculadoraOn = true;

        while (calculadoraOn) {
            //MUESTRO EL MENU DE LA CALCULADORA
            System.out.println("<-- Calculadora -->");
            System.out.println("1 - Suma");
            System.out.println("2 - Resta");
            System.out.println("3 - Multiplicación");
            System.out.println("4 - División");
            System.out.println("5 - Potenciación");
            System.out.println("6 - Algoritmo de euclides");
            System.out.println("0 - Salir");
            System.out.print("Elige una opción: ");

            //LEEMOS LA OPCION
            int opcion = sc.nextInt();

            //INDICAMOS EL SWITCH
            switch (opcion) {
                case 1 -> sumar();
                case 2 -> restar();
                case 3 -> multiplicar();
                case 4 -> dividir();
                case 5 -> elevado();
                case 6 -> euclides();
                case 0 -> {
                    System.out.println("Saliendo de la calculadora");
                    //AL PONER "calculadoraOn" EN FALSE CERRAMOS EL BUCLE Y SALIMOS
                    calculadoraOn = false;
                }
                default -> System.out.println("Opción no válida. Inténtalo de nuevo.");
            }
        }
    }
    // OPERACION SUMA
    public static void sumar() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el primer número: ");
        double num1 = sc.nextDouble();
        System.out.print("Introduce el segundo número: ");
        double num2 = sc.nextDouble();
        System.out.println("El resultado de la suma es: " + (num1 + num2));
    }
    // OPERACION RESTA
    public static void restar() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el primer número: ");
        double num1 = sc.nextDouble();
        System.out.print("Introduce el segundo número: ");
        double num2 = sc.nextDouble();
        System.out.println("El resultado de la resta es: " + (num1 - num2));
    }
    //OPERACION  PARA SOBRECARGAR LA MULTIPLICACION
    public static void multiplicar() {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Deseas multiplicar 2 o 3 números?");
        int opcion = sc.nextInt();

        if (opcion == 2) {

            System.out.print("Introduce el primer número: ");
            double num1 = sc.nextDouble();
            System.out.print("Introduce el segundo número: ");
            double num2 = sc.nextDouble();
            multiplicacion(num1, num2);
        }
        else if (opcion == 3) {
            System.out.print("Introduce el primer número: ");
            double num1 = sc.nextDouble();
            System.out.print("Introduce el segundo número: ");
            double num2 = sc.nextDouble();
            System.out.print("Introduce el tercer número: ");
            double num3 = sc.nextDouble();
            multiplicacion(num1, num2, num3);
        }
    }
    // MULTIPLICACION CON 2 DIGITOS
    public static void multiplicacion(double num1, double num2) {

        System.out.println("El resultado de la multiplicación es: " + (num1 * num2));
    }
    // MULTIPLICACION CON 3 DIGITOS
    public static void multiplicacion(double num1, double num2, double num3) {

        System.out.println("El resultado de la multiplicación es: " + (num1 * num2 * num3));
    }
    //OPERACION DIVISION
    public static void dividir() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el dividendo: ");
        double dividendo = sc.nextDouble();
        System.out.print("Introduce el divisor: ");
        double divisor = sc.nextDouble();
        if (divisor != 0) {
            System.out.println("El resultado de la división es: " + (dividendo / divisor));
        }
        else {
            System.out.println("No es posible dividir por cero.");
        }
    }
    //OPERACION DE POTENCIAS
    public static void elevado() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce la base: ");
        double numero = sc.nextDouble();
        System.out.print("Introduce el exponente: ");
        int exponente = sc.nextInt();
        System.out.println("El resultado de la potenciación es: " + Math.pow(numero, exponente));
    }
    //PARANOIA DE EUCLIDES ((MAXIMOS COMUN DIVISOR DE TO LA VIDA))
    public static void euclides(){
        //PEDIMOS LOS NUMEROS PARA EUCLIDES
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el primer numero: ");
        double num1 = sc.nextDouble();
        System.out.print("Introduce el segundo numero: ");
        double num2 = sc.nextInt();
        System.out.println("El resultado es: " + maximoComunDivisor(num1,num2));
    }
    //OPERACION INTEGRA
    public static double maximoComunDivisor(double num1,  double num2){

        if(num2==0){
            return num1;
        }
        else if (num1==0) {
            return num2;         }
        else{
            return maximoComunDivisor(num2 , num1%num2);
        }
    }
//-----------------------------------------FIN EJERCICIO 3----------------------------------------------------------


    public static void main(String[] args) {

        boolean programa = true;

        while(programa){

            System.out.println("---------------------------------------------------------");
            System.out.println("Introduce el nº correspondiente del ejercicio a realizar.");
            System.out.println("1 - Ejercicio 1.");
            System.out.println("2 - Ejercicio 2.");
            System.out.println("3 - Ejercicio 3.");
            System.out.println("0 - Salir del programa");
            System.out.println("---------------------------------------------------------");

            Scanner sc = new Scanner(System.in);
            int opcion = sc.nextInt();

            switch (opcion){
                case 1 -> ejercicio1();
                case 2 -> ejercicio2();
                case 3 -> ejercicio3();
                case 0 -> programa = false;
                default ->
                    System.out.println("Has introducido de forma incorrecta el nº del ejercicio, por favor prueba de nuevo.");
            }


        }


    }

}
