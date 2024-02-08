
public class Ejercicio3T3 {
    public static void main(String[] args) {
        for(int i = 0; i<11; i++){
            System.out.println("<Tabla del " + i + "> ");
            for (int e = 1; e<11; e++) {
                System.out.println(e + " * " + i + "= " + (i * e));
            }
        }
    }
}