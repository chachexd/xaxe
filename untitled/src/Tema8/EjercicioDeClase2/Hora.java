package Tema8.EjercicioDeClase2;

public class Hora {
    int hora;
    int minutos;

    Hora(int hora, int minutos){
        setHora(hora);
        setMinutos(minutos);
    }

    public int getHora() {
        return hora;
    }

    public int getMinutos() {
        return minutos;
    }

    public boolean setHora(int hora) {
        boolean aux;
        if(hora>=0 && hora <=23){
            this.hora = hora;
            aux = true;
        }
        else{
            System.out.println("Hora errónea");
            aux = false;
        }
        return aux;
    }

    public boolean setMinutos(int minutos) {
        boolean aux;
        if(minutos>=0 && minutos <=59){
            this.minutos = minutos;
            aux = true;
        }
        else{
            System.out.println("Minutos erróneos");
            aux = false;
        }
        return aux;
    }

    void inc(){
        if((getMinutos()+1 == 60)){
            if(getHora()+1 != 24){
                setHora(getHora()+1);
            }
            else{
                setHora(0);
            }
            setMinutos(0);
        }
        else{
            setMinutos(getMinutos()+1);
        }
    }

    @Override
    public String toString() {
        String cad;
        if(getHora()<10 && getMinutos() <10) cad = "(0" + getHora() + ":0" + getMinutos()+")";
        else if(getHora()<10 && getMinutos() >=10) cad = "(0" + getHora() + ":" + getMinutos()+")";
        else if(getHora()>=10 && getMinutos() <10) cad = "(" + getHora() + ":0" + getMinutos()+")";
        else cad = "(" + getHora() + ":" + getMinutos()+")";
        return cad;
    }
}
