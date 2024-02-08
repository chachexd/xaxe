package Tema8.EjercicioDeClase2;

public class Main {
    public static void main(String[] args) {
        Hora hora = new Hora(20,30);
        System.out.println(hora.toString());
        Hora hora2 = new Hora(7,3);
        System.out.println(hora2.toString());
        Hora hora3 = new Hora(0,0);
        System.out.println(hora3.toString());
        Hora hora4 = new Hora(22,59);
        System.out.println(hora4.toString());
        hora4.inc();
        System.out.println(hora4.toString());
    }
}
