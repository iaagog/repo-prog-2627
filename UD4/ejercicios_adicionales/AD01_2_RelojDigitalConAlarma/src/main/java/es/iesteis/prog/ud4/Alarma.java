package es.iesteis.prog.ud4;

public class Alarma{
    private int hora;
    private int minutos;


    public Alarma(){
        this.hora = 7;
        this.minutos = 0;
    }

    public void setHoraAlarma(int horas, int minutos){
        this.minutos = minutos;
        this.hora = horas;
    }

    public String getHoraAlarma(){
        String retorno = "";
        if(hora < 10){
            retorno += "0" + hora + ":";
        }else{
            retorno += hora + ":";
        }
        if(minutos < 10){
            retorno += "0" + minutos;
        }else{
            retorno += minutos;
        }
        return retorno;
    }

}
