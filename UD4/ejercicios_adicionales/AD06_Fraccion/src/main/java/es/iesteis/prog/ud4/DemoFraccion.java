package es.iesteis.prog.ud4;

/**
 * Clase para probar la clase Fraccion 
 * 
 * @author 
 * @version 
 */
public class DemoFraccion
{
    private Fraccion fraccion1;
    private Fraccion fraccion2;

    /**
     * Constructor de la clase DemoFraccion
     */
    public DemoFraccion(){
        fraccion1 = new Fraccion(-4,7);
        fraccion2 = new Fraccion(13,2);
    }

    /**
     * 
     *
     */
    
    public void demo1(){
       escribirFraccion("La suma es: ", fraccion1.sumar(fraccion2));
       escribirFraccion("La resta es: ", fraccion1.restar(fraccion2));
       escribirFraccion("La multiplicacion es: ", fraccion1.multiplicar(fraccion2));
       escribirFraccion("La division es: ", fraccion1.dividir(fraccion2));
    }
    
    /**
     *
     *   
     */
    private void escribirFraccion(String mensaje, Fraccion laFraccion){
        System.out.println(mensaje);
        System.out.println(laFraccion);
    }
    
    /**
     *
     * Limpiar la pantalla    
     */
    private void borrarPantalla()
    {
       System.out.println('\u000C');
    }
    
    
    /**
     *
     *   
     */
     public void demo2()
    {
       
       
    }
    
    
}
