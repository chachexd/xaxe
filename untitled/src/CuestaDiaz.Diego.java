import java.util.Scanner;

class CuestaDiazDiego {

    static void ejercicio1(){
        System.out.println("Has seleccionado el ejercicio 1.");
        //Rellena aquí con el contenido del ejercicio 1
        //Declaro variables
        int numero;
        int positivo = 0;
        Scanner sc = new Scanner(System.in);

        //hago print para pedir numero
        System.out.println("Dime un numero: ");

        //pido por teclado el numero
        numero = sc.nextInt();

        //imprimo resultado
        System.out.println((numero >= positivo) ? "ES POSITIVO" : "ES NEGATIVO");
        
    }

    static void ejercicio2(){
        System.out.println("Has seleccionado el ejercicio 2.");
        //Rellena aquí con el contenido del ejercicio 2
        //Declaro variables
        double yenes;
        double euros = 0.0064;
        double resultado;
        int comision;
        Scanner sc = new Scanner(System.in);

        //Pido por teclado los Yenes que desea pasar a euros
        System.out.println("Dime cuantos Yenes quieres pasar: ");

        //recojo por teclado el numero y hago los correspondientes calculos
        yenes = sc.nextInt();
        resultado = yenes * euros;
        System.out.println("Dime el porcentaje de comision que estipulas:");
        comision = sc.nextInt();

        //imprimo el resultado
        System.out.println(yenes+"Yenes convertidos a euros son: "+ resultado +"Euros");

        //realizo calculo de comision y lo imprimo
        resultado = (( comision * yenes ) / 100 ) * euros;
        System.out.println("Tras aplicarle una comisión del " + comision + "%, la comisión resultante es de "+ resultado +" euros.");

    }

    static void ejercicio3(){
        System.out.println("Has seleccionado el ejercicio 3.");
        //Rellena aquí con el contenido del ejercicio 2
        //Declaro variables
        double tributo;
        double minimo = 67.5;
        int edad;
        int año;
        String respuesta;
        Scanner sc = new Scanner(System.in);

        //Pido el peso del tributo y lo recojo por teclado, luego muestro si el individuo podria pasar o no
        System.out.println( "Peso del tributo: ");
        tributo = sc.nextDouble();
        System.out.println( ( tributo >= minimo ) ? "PUEDE PASAR" : "NO PUEDE PASAR");

        //Pido la edad del individuo y lo recojo por teclado, luego le asigno la Zona en la que se situaria en caso de haber podido pasar
        System.out.println( "Dime tu año de nacimiento:" );
        año = sc.nextInt();
        edad = 2023 - año;
        System.out.println( edad <= 50 ? "<Estarías en la Zona1>" :
                ( edad <= 100 ) ? "<Estarias en la Zona2>" :
                        ( edad <= 1000 ) ? "<Estarias en la Zona3>" : "<Illo muerete ya no? ;)>");

    }


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
                case 1: ejercicio1(); break;
                case 2: ejercicio2(); break;
                case 3: ejercicio3(); break;
                case 0: programa = false; break;
                default:
                    System.out.println("Has introducido de forma incorrecta el nº del ejercicio, por favor prueba de nuevo.");
            }


        }


    }

}