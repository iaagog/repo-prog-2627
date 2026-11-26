import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.Random;

/**
 *  Clase que inclute métodos para probar la
 *  sentencia iterativa while
 *   
 */
public class DemoWhileUno
{
    private final char ESPACIO = ' ';
    private final char ASTERISCO = '*';

    private Random generador;
    private Scanner teclado;
    private Dado dado;
    private Moneda moneda;

    /**
     * Constructor  
     */
    public DemoWhileUno()
    {
        generador = new Random();
        teclado = new Scanner(System.in);
        moneda = new Moneda();
        dado = new Dado();
    }

    /**
     *  
     * Escribir un saludo 10 veces
     *  
     * 
     */
    public void ejemplo01(){
        int contadorSaludos = 0;
        while(contadorSaludos < 10){
            contadorSaludos++;
            System.out.println("Hola " + contadorSaludos);
        }

    }

    /**
     *  
     * Tirar una moneda 10 veces
     * 
     */
    public void ejemplo02()
    {
        Moneda monedaPrueba = new Moneda();
        int contador = 0;
        while(contador < 10){
            contador++;
            monedaPrueba.tirar();
            System.out.println(monedaPrueba.esCara());
        }
    }

    /**
     *  
     * Tirar una moneda 30 veces
     * contando las veces que ha salido cara y las que ha salido cruz
     * Uso de contadores
     */
    public void ejemplo03(){
        Moneda moneda2 = new Moneda();
        int i = 0;
        int contadorCara = 0;
        int contadorCruz = 0;

        while (i < 30){
            moneda2.tirar();
            if(moneda2.esCara()){
                contadorCara++;
            }else{
                contadorCruz++;
            }
            i++;
        }
        System.out.println("Salieron " + contadorCara + " caras");
        System.out.println("Salieron " + contadorCruz + " cruces");

    }

    /**
     *  
     * Suma y producto de los números naturales desde el 20 hasta el 1
     * Uso de acumuladores
     */
    public void ejemplo04(){
        int suma = 0;
        int i = 0;
        long producto = 1;

        while(i < 20){
            i++;
            producto *= i;
            suma += i;
        }
        System.out.println("La suma es: " + suma);
        System.out.println("El producto es: " + producto);
    }

    /**
     *  Generar aleatorios entre 10 y 50 inclusive y escribirlos
     *  El bucle termina cuando sale el 25
     *  Mostrar los números en filas de 6 formateados a 4 espacios
     *  
     *  Bucle controlado por un valor centinela
     */
    public void ejemplo05(){
        int numero = -1;
        int contador = 0;

        while(numero != 25){
            contador++;
            numero = (int) (Math.random() * (50 - 10 + 1)) + 10;
            System.out.printf( " %4d", numero);
            if(contador % 6 == 0){
                System.out.print("\n");
            }
            if(numero == 25){
                System.out.printf( " %4d", numero);
            }
        }
    }

    /**
     *  Generar aleatorios entre 0 y 50 inclusive y sumarlos.
     *  Parar cuando salga el 0. Escribir al final la suma
     *  Bucle controlado por un valor centinela
     */
    public void ejemplo06(){
        int i = 0;
        boolean es0 = false;
        int suma = 0;

        while (!es0){
            int num = (int) (Math.random() * 51);
            suma += num;
            if(num == 0){
                es0 = true;
                System.out.println("El numero vale: " + num);
            }
            System.out.println(num);
        }

        System.out.println("La suma es: " + suma);
    }

    /**
     *  
     * Tirar una moneda reiteradamente 
     * hasta que salga cara o se hayan hecho 30 tiradas
     * Usar una variable booleana como conmutador (o switch - flag) para
     * salir del bucle
     */
    public void ejemplo07(){
            int tiradas = 0;
            boolean salioCara = false;

            while(tiradas <= 30 && ! salioCara){
                moneda.tirar();
                if(moneda.esCara()){
                    salioCara = true;
                }else{
                    tiradas++;
                }
            }
    }

    /**
     *  Suma de pares entre 1 y 100
     *  y producto de impares entre 1 y 100 
     *   
     */
    public  void ejemplo08(){
        int suma = 0;
        int i = 0;

        while(i < 100){
            if(i % 2 == 0){
                suma+= i;
            }
            i++;
        }
        System.out.println("La suma es: " + suma);
        //No hago el producto porque da resultado demasiado grande
    }

    /**
     *  Suma de pares entre 1 y 100
     *  y producto de impares entre 1 y 100 
     *  Con una variable booleana que actúe de switch o conmutador
     */
    public  void ejemplo09(){
        int suma = 0;
        int i = 0;
        boolean esPar = false;
        //No hago el producto porque da resultado demasiado grande

        while(i < 100){
            if(i % 2 == 0){
                esPar = true;
            }else{
                esPar = false;
            }

            if(esPar){
                suma += i;
            }
            i++;
        }
        System.out.println("La suma es: " + suma);

    }

    /**
     * Generar n aleatorios entre 5 y 15 inclusive y contar los pares, los que acaban en 2
     * y sumar los impares
     */
    public void ejemplo10(int n){
        int pares = 0, acabanEn2 = 0, impares = 0;

        for(int i = 0; i < n; i++){
            int numeroAleatorio = (int) (Math.random() * 11) + 5;
            if(numeroAleatorio % 2 == 0){
                pares++;
            }else{
                impares++;
            }

            if(numeroAleatorio % 10 == 2){
                acabanEn2++;
            }
        }

        System.out.println("Pares: " + pares);
        System.out.printf("Impares: %d\n", impares);
        System.out.printf("Acaban en 2: %d\n", acabanEn2);
    }

    /**
     * Tirar un dado repetidas veces hasta que salga un 6.
     * Contar las tiradas y sumarlas (se excluye el 6 de los cálculos)
     */
    public  void ejemplo11(int n){
        Dado dado = new Dado();
        int tiradas = 0;
        while(dado.getCara() != 6){
            dado.tirarDado();
            tiradas++;
        }

        System.out.println("La cara del dado es " + dado.getCara());
        System.out.printf("Se han realizado %d tiradas", tiradas);
    }

    /**
     *  Pregunta 9 del cuestionario I UT4
     *  
     *  Pide al usuario una letra y valida con un bucle while que sea una vocal 
     *  minúscula. Si no es así pide de nuevo  al usuario otra letra hasta que 
     *  introduzca una letra correcta (hazlo con un while)
     */
    public void ejemplo12(){
        Scanner teclado = new Scanner(System.in);
        boolean esVocal = false;


        while(!esVocal){
            System.out.printf("Introduce una letra: ");
            char letra = teclado.next().charAt(0);

            switch(letra){
                case 'a': case 'e': case 'i': case 'o': case 'u':
                    esVocal = true;
                    break;
            }
        }
    }

    /**
     *  Calcular y devolver el nº de cifras de numero
     */
    public int contarCifras(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un numero");
        int num = teclado.nextInt();
        int numCifras = 1;

         while(num >= 10){
             System.out.println(num / 10);
             num /= 10;
             numCifras++;
         }

        System.out.printf("El numero de cifras del numero es %d", numCifras);
        return numCifras;
    }

    /**
     *  Calcular el inverso de un nº (sin contar previamente sus cifras)
     */
    public int inversoV1(int numero)
    {

         return 0;
    }

    /**
     *  Calcular el inverso de un nº (contando previamente sus cifras)
     */
    public int inversoV2(int numero)
    {

         return 0;
    }


    /**
     * Hacer una traza en papel  de este método y deducir qué salida produce
     * para las llamadas  misterio(1);       misterio(6);    
     *              misterio(19);  misterio(39);     misterio(74);
     */
    public   void misterio1(int x)
    {
        int y = 1;
        int z = 0;
        while (2 * y <= x)   {
            y = y * 2;
            z++;
        }
        System.out.println(y + " " + z);
    }

    /**
     * Para hacer la traza en papel
     */
    public  int misterio2(int a, int b)
    {
        int p = 1;
        int contador = 1;
        while (contador <= b)   {
            p = p * a;
            contador ++;
        }
        return p;

    }

    /**
     * Para hacer la traza en papel
     */
    public  int misterio3(int a, int b)
    {
        int s = 0;
        int contador = 1;
        while (contador <= b)    {
            s = s + a;
            contador ++;
        }
        return s;

    }

    /**
     * Generar 20 nºs aleatorios entre 5 y 10 incluidos
     * y para cada número calcular y escribir su sumatorio
     */
    public  void bucleAnidado01()
    {

    }

     /**
     * Generar 10 nºs aleatorios entre 5 y 50 incluidos
     * y mostrar un  histograma
     * 
     *  7: * * * * * * *
        6: * * * * * *
        7: * * * * * * *
        9: * * * * * * * * *
       10: * * * * * * * * * *
        8: * * * * * * * *
        9: * * * * * * * * *
       10: * * * * * * * * * *
        5: * * * * *
        9: * * * * * * * * *
     */
    public  void bucleAnidado02()
    {

    }

    /**
     * Mostrar la siguiente figura  (6 filas y 10 columnas)
     *  1 1 1 1 1 1 1 1 1 1
     *  2 2 2 2 2 2 2 2 2 2
     *  3 3 3 3 3 3 3 3 3 3
     *  4 4 4 4 4 4 4 4 4 4
     *  5 5 5 5 5 5 5 5 5 5
     *  6 6 6 6 6 6 6 6 6 6
     * 
     */
    public  void bucleAnidado03()
    {

    }

    /**
     * Mostrar la siguiente figura  (6 filas y 10 columnas)
     *  1
     *  1 2
     *  1 2 3
     *  1 2 3 4
     *  1 2 3 4 5
     *  1 2 3 4 5 6
     *  ...................
     *  
     */
    public  void bucleAnidado04()
    {

    }
    
    
     /**
     *  Mostrar la serie usando escribirEspacios()
     *        1
     *       21
     *      321
     *     4321
     *    54321
     *   654321
     *  7654321
     *
     *  
     */
    public  void bucleAnidado05(int n)
    {
 

    }

      /**
     *  escribir n espacios
     *  
     */
    private void escribirEspacios(int n)
    {
        
    }
    /**
     * El programa hace una pausa de los milisegundos especificados
     */
    public void esperar(int milisegundos)
    {
        try {
            Thread.sleep(milisegundos);
        } 
        catch (Exception e)  {
            // ignorar la excepción
        }
    }

    static void main(String[] args) {
        //TODO añadir aqui el codigo de pruebas: crear instancia y llamar a las funciones
        DemoWhileUno miDemo = new DemoWhileUno();

        miDemo.ejemplo05();
    }

}
