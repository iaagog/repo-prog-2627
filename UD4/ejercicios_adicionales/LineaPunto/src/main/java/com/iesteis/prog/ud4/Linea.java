package com.iesteis.prog.ud4;

public class Linea{
    private Punto punto1, punto2;

    public Linea(){
        punto1 = new Punto(0,0);
        punto2 = new Punto(0,0);
    }

    public Linea(Punto punto1, Punto punto2){
        this.punto1 = punto1;
        this.punto2 = punto2;
    }

    public void moverDerecha(int distancia){
        punto1.desplazar(distancia,0);
        punto2.desplazar(distancia,0);
    }

    public void moverIzquierda(int distancia){
        punto1.desplazar(-distancia,0);
        punto2.desplazar(-distancia,0);
    }

    public void moverArriba(int distancia){
        punto1.desplazar(0,distancia);
        punto2.desplazar(0,distancia);
    }

    public void moverAbajo(int distancia){
        punto1.desplazar(0,-distancia);
        punto2.desplazar(0,-distancia);
    }

    public Punto getPunto1(){
        return punto1;
    }

    public Punto getPunto2(){
        return punto2;
    }

    public void setPunto1(Punto punto1){
        this.punto1 = punto1;

    }
    public void setPunto2(Punto punto2){
        this.punto2 = punto2;
    }

    public void printLinea(){
        System.out.printf("Punto 1 - Valor de x = %d\n",punto1.getX());
        System.out.printf("Valor de y = %d\n",punto1.getY());
        System.out.printf("Punto 2 - Valor de x = %d\n",punto2.getX());
        System.out.printf("Valor de y = %d\n",punto2.getY());
    }
}
