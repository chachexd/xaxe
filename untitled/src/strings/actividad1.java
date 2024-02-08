package strings;
import java.util.Scanner;
public class actividad1 {
    public static void main(String[] args){
        String [] usuCont =  {"Usuario1" ,"contraseña1", "Usuario2" , "contraseña2", "Usuario3", "contraseña3"};
         Scanner scanner = new Scanner(System.in);
        System.out.println("Dime tu usuario");
        String usuario = scanner.nextLine();
        boolean usuarioEncontrado = false;
        int contador = 0;
        while (!usuarioEncontrado && contador < 5){
            for(int i = 0; i < usuCont.length; i++){
                if (usuCont[i].equals(usuario)){
                    contador = i;
                    usuarioEncontrado = true;
                    contrasena(usuCont , contador);

                }
                else{
                    i++;
                }
            }
            if (!usuarioEncontrado){

                System.out.println("dime otro usuario: ");
                usuario = scanner.nextLine();
            }

        contador ++;
        }

    }

    public static void contrasena( String[] usuCont , int contador) {
        Scanner scanner = new Scanner(System.in);
        boolean contrasena = false;
        
        int contadorbucle = 0;
        while(!contrasena && contadorbucle < 5) {
            System.out.println("Escribe Una contraseña: ");
            String contrasenass = scanner.nextLine();
            if (contrasenass.equals(usuCont[contador + 1])){
                System.out.println("ere un crak");
                contrasena = true;
            }
            
            contadorbucle++;
        }

    }

}
