import java.util.Scanner;
public class eco {
    public static void main(String[] args) {
        System.out.println("¿Cual es el primer numero?");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("¿Cual es el segundo?");
        int b = sc.nextInt();
        eco(a,b);


    }
    static void eco(int a, int b){
        System.out.println("Entre ellos esta el:");
        for (int i=a;i<b-1;i++) {
            System.out.println(i+1);
        }
    }
}

