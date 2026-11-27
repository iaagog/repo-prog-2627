
/**
 * 
 */
public class DemoFor
{
    private Moneda moneda;

    /**
     * Constructor  
     */
    public DemoFor()
    {
        moneda = new Moneda();
    }

    /**
     * Saludar 10 veces con for
     */
    public  void ejemploFor01(){
        for (int i = 0; i < 10; i++) {
            System.out.println("Hola " + i + 1);
        }
    }
    
    
    /**
     * Tirar una moneda 10 veces con for
     */
    public  void ejemploFor02(){
        for (int i = 0; i < 10; i++){
            moneda.tirar();
            if(moneda.esCara())
                System.out.printf("Es cara%n");
            else
                System.out.printf("Es cruz%n");
        }
        
    }

    /**
     * Tirar una moneda 30 veces
     * contando las veces que ha salido cara y las que ha salido cruz
     */
    public void ejemploFor03(){
        int caras = 0, cruces = 0;
        for (int i = 0; i < 30; i++) {
            moneda.tirar();
            if(moneda.esCara())
                caras++;

            else{
                cruces++;
            }
        }

        System.out.printf("Han salido %d caras", caras);
        System.out.printf(" y %d cruces", cruces);
    }
    
     /**
     *  Impares entre 1 y 19
     *  1, 3, 5, 7, 9, 11, 13, 15, 17, 19
     *  
     */
    public void imparesEntre1y20(){
        for (int i = 0; i < 20; i++){
            if(i % 2 != 0){
                System.out.printf("%d, ", i);
            }
        }
         

    }
	
	/**
     *  Generar n aleatorios entre -10 y 50 y calcular y escribir el máximo y cuántas veces aparece
     *
     *  
     */
    public void maximo(int n){
        int numero = (int) (Math.random() * 61) - 10;
        int maximo = 0;
        int vecesMaximo = 0;

        for (int i = 0; i < n; i++){
            numero = (int) (Math.random() * 61) - 10;
            if(i == 0){
                numero = maximo;
            }else{
                if(numero > maximo){
                    maximo = numero;
                    System.out.println("El maximo es: " + maximo);
                    vecesMaximo++;
                }
            }
            System.out.println(numero);
        }

        System.out.printf("El maximo salio %d veces", vecesMaximo);
    }
    
     /**
     * Cuenta la cantidad de divisores del parámetro recibido
     * Con for
     */
    public int contarDivisores(int numero)
    {
         
         return 0;
    }
    
    
    /**
     * Ejer 4.14 f)
     *  Calcula y devuelve la suma de los divisores de 
     *  numero - Con for
     */
    public int sumarDivisores(int numero)
    {
        
         return 0;
    }
    
    /**
     * Ejer 4.14 h)
     * Sin método adicional de ayuda
     * Buscamos divisores desde el 2 hasta la mitad del número
     * Si se encuentra alguno sabremos que no es primo, en caso contrario lo será
     * Con for saliendo del bucle con return en cuanto sepamos que no es primo
     */
    public  boolean esPrimo(int numero)
    {
         
        return true;
    }

    
     /**
     *  Calcula y escribe la siguiente serie
     *  1 + 2 elevado a 2 + 3 elevado a 2 + 4 elevado a 2 +   .... + n elevado a 2
     *
     */
    public void serieCuadrados(int n)
    {
         
    }
    
     /**
     *  Genera n pares de números entre 5 y 20 y
     *  calcula su producto mediante sumas
     *
     */
    public void productoMedianteSumas(int n)
    {
         

    }
	

    /**
     * Ejer 4.15 a) de la UT4
     * Escribe la siguiente figura 
     * Si n = 6 entonces
     * 1   1   1   1   1   1 
     * 2   2   2   2   2  2
     * 3   3   3   3   3  3
     * 4   4   4   4   4  4
     * 5   5   5   5   5   5 
     * 6   6   6   6   6  6 
     */
    public  void escribirFiguraA(int n)
    {
        
    }

    /**
     * Ejer 4.15 b) de la UT4
     * Escribe la siguiente figura 
     *  Si n = 6 entonces
     *  
     * 1   
     * 2   2   
     * 3   3   3   
     * 4   4   4   4   
     * 5   5  5   5   5   
     * 6   6   6   6   6  6 
     */
    public  void escribirFiguraB(int n)
    {
        
    }

    /**
     * Ejer 4.15 c) de la UT4
     * Escribe la siguiente figura
     *  Si n = 6 entonces
     *  
     * 1   
     * 1  2
     * 1  2   3
     * 1  2   3    4
     * 1  2    3    4   5 
     * 1  2   3   4   5   6 
     */
    public  void escribirFiguraC(int n)
    {
        
    }

    /**
     *  Ejer 4.15 d) de la UT4
     *   escribe la tabla de multiplicar del 1, del 2, 
     *   del 3, .... hasta la tabla de numero
     */
    public  void   escribirTablasMultiplicar(int  numero) 
    {
         
    }
    
        
    /**
     *  ....1
     *  ...2.
     *  ..3..
     *  .4...
     *  5....
     *
     *  
     */
    public void cuadroConPuntos(int n)
    { 
        
    }
    
     /**
     *  Escribe n puntos en la misma línea
     *  
     */
    public void escribirPuntos(int n)
    {
         
    }
    
     /**
     *  Mostrar figura para N filas
     *  A
     *  BB
     *  CCC
     *  DDDD
     *  EEEEE
     *  FFFFFF
     *  GGGGGGG
     *  .........
     *  MMMMMMMMMMMM
     *
     *  
     */
    public void trianguloLetras(int n)
    {
        

    }

    /**
     *  Mostrar la siguiente figura 
     *  ABCD...................Z
     *  BCD...................Z
     *  CDEF.................Z
     *   ..........
     *
     *  Z
     */
    public void trianguloLetrasOtro()
    {
        

    }

    /**
     * El programa hace una pausa de los milisegundos especificados
     */
    public void esperar(int milisegundos)
    {
        try   {
            Thread.sleep(milisegundos);
        } 
        catch (Exception e)  {
            // ignorar la excepción
        }
    }

    static void main(String[] args) {
        //TODO añadir aqui el codigo de pruebas: crear instancia y llamar a las funciones
        DemoFor prueba = new DemoFor();
        prueba.maximo(20);
    }
}
