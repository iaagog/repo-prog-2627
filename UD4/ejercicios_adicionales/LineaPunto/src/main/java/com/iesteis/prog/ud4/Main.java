package com.iesteis.prog.ud4;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main(String[] args) {
        Linea linea1 = new Linea();
        Linea linea2 = new Linea(new Punto(10,12), new Punto(20,20));

        Punto punto1 = new Punto(5,0);
        Punto punto2 = new Punto(10,0);

        linea1.printLinea();
        linea2.printLinea();

        linea1.setPunto2(punto1);
        linea1.setPunto1(punto2);

        linea1.printLinea();
        linea2.printLinea();

        linea1.moverAbajo(10);
        linea2.moverDerecha(20);
        linea1.printLinea();
        linea2.printLinea();
    }

}
