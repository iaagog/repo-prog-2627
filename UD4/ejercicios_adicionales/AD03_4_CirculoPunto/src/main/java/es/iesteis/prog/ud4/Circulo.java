package es.iesteis.prog.ud4;

/**
 * La clase representa círculos con un centro
 * y un valor determinado de radio
 * 
 * @author 
 * @version 
 */
public class Circulo
{
    private final double PI = 3.14;
    private double radio;
    private Punto centro;

     /**
     * constructor para los objetos de la clase Circulo
     * 
     */
    public Circulo(double radio, Punto valorCentro){
        this.radio = radio;
        centro = valorCentro;
    }

    public Circulo(double radio){
        this.radio = radio;
        centro = new Punto(0,0);
    }

    public Punto getCentro(){
        return centro;
    }

    public void setCentroX(int valorX){
        centro.setX(valorX);
    }

    public void setCentroY(int valorY){
        centro.setY(valorY);
    }

    public String toString(){
        return "El valor del centro es: " + centro.toString()  + " y el valor del radio es: " + getRadio();
    }

    public void printCirculo(){
        System.out.println(toString());
    }
    /**
     * 
     * @return devuelve el radio del círculo
     */
    public double getRadio()
    {
        return radio;
    }
    
        
      /**
     * 
     * @param nuevoRadio el nuevo valor del radio
     */
    public void setRadio(int nuevoRadio)
    {
        radio = nuevoRadio;
    }
    
    /**
     * @return devuelve el área del círculo
     */
    public double calcularArea()
    {
        return 2 * PI * radio * radio;
    }
    
    /**
     * @return devuelve el perímetro del círculo
     */
    public double calcularPerimetro()
    {
        return 2 * PI * radio;
    }
    
 
    
}
