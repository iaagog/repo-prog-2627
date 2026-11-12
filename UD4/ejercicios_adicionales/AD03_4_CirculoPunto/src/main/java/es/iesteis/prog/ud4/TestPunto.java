package es.iesteis.prog.ud4;

public class TestPunto{
    public TestPunto(){

    }

    public void test1(){
        Punto punto1 = new Punto(3,8);
        Punto punto2 = new Punto(12,9);

        System.out.println("El punto1 tiene como coordenadas: (" + punto1.getX() +  "," +  punto1.getY() + ")");
        System.out.println("El punto2 tiene como coordenadas: (" + punto2.getX() +  "," +  punto2.getY() + ")");

        System.out.println("La distancia del primer punto al origen es: " + punto1.getDistanciaDesdeOrigen());
        System.out.println("La distancia entre los dos puntos es: " + punto1.getDistanciaDesde(punto2));

        System.out.printf("El valor de la distancia entre los dos puntos es: %.2f\n",punto2.getDistanciaDesde(punto1));

        System.out.printf("El punto1 tiene como coordenadas: (%d,%d) ", punto1.getX(), punto1.getY());

        String lineaFormateada = String.format("\nEl valor de la distancia entre el punto 1 (%d,%d) al origen es %f",punto1.getX(),punto1.getY(),punto1.getDistanciaDesdeOrigen());
        System.out.println(lineaFormateada);
    }
}
