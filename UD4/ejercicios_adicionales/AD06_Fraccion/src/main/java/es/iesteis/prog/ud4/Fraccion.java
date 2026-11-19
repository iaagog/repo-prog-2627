package es.iesteis.prog.ud4;

/**
 * La clase modela un número racional, una fracción
 * representada por su numerador y denominador
 * 
 */
public class Fraccion{
    private int numerador;  
    private int denominador;

    /**
     *
     * Constructor  
     */
    public Fraccion(){
        numerador = 0;
        denominador = 0;
    }   
    /**
     * constructor para los objetos de la clase Fraccion
     */
    public Fraccion(int numerador, int denominador){
        this.numerador = numerador;
        this.denominador = denominador;
    }

    /**
     * Accesor para el numerador
     */
    public int getNumerador()
    {
       return numerador;
    }
    
     /**
     * Accesor para el denominador
     */
    public int getDenominador()
    {
       return denominador;
    }
    
    /**
     * Mutador para el numerador
     */
    public void setNumerador(int numerador){
        this.numerador = numerador;
    }
    
    /**
     * Mutador para el denominador
     */
    public void setDenominador(int denominador){
       this.denominador = denominador;
    }  
    
    /**
     * Suma la fracción actual por la que
     * se recibe como parámetro
     * @param otra fracción con la que sumar
     * @return la suma de dos fracciones
     */
    public Fraccion sumar(Fraccion otra){
        int sumaDenominador = 0;
        int sumaNumerador = 0;
        if(getDenominador() == otra.getDenominador()){
            sumaNumerador = getNumerador() + otra.getNumerador();
            sumaDenominador = getDenominador();
        }else{
            sumaDenominador = getDenominador() + otra.getDenominador();
            sumaNumerador = (getNumerador() * otra.getDenominador()) + (otra.getNumerador() + getDenominador());
        }
        return new Fraccion(sumaNumerador, sumaDenominador);
    }
    
     /**
     * Resta la fracción actual por la que
     * se recibe como parámetro
     * @param otra  fracción con la que se resta
     * @return  la resta  de dos fracciones
     */
    public Fraccion restar(Fraccion otra){
        int restaDenominador = 0;
        int restaNumerador = 0;
        if(getDenominador() == otra.getDenominador()){
            restaNumerador = getNumerador() - otra.getNumerador();
        }else{
            restaDenominador = getDenominador() - otra.getDenominador();
            restaNumerador = (getNumerador() * otra.getDenominador()) - (otra.getNumerador() + getDenominador());
        }
        return new Fraccion(restaNumerador, restaDenominador);
    }
    
    /**
     * Multiplica la fracción actual por la que
     * se recibe como parámetro
     * @param otra fracción por la que se multiplica
     * @return  el producto de dos fracciones
     */
    public Fraccion multiplicar(Fraccion otra){
         int multiplicacionNumerador = 0;
         int multiplicacionDenominador = 0;

         multiplicacionNumerador = numerador * otra.numerador;
         multiplicacionDenominador = denominador * otra.denominador;

         return new Fraccion(multiplicacionNumerador,multiplicacionDenominador);
    }
    
    /**
     * Divide la fracción actual entre la que
     * se pasa como parámetro
     * @param otra  fracción entre la que se dividirá
     * @return  el cociente de dos fracciones
     */
    public Fraccion dividir(Fraccion otra){
        int divisionNumerador = 0;
        int divisionDenominador = 0;

        divisionNumerador = numerador * otra.denominador;
        divisionDenominador = otra.numerador * denominador;

        return new Fraccion(divisionNumerador,divisionDenominador);
    }
    
    /**
     * Compara dos fracciones, la actual y 
     * la recibida como parámetro
     * @param otra la fracción con la que comparar
     * @return true si son iguales
     */
    public boolean igualQue(Fraccion otra){
        return (numerador % otra.numerador == 0 && denominador % otra.denominador == 0);
    }
    
     /**
     * Compara dos fracciones, la actual y 
     * la recibida como parámetro
     * @param otra la fracción con la que comparar
     * @return true si la fracción actual es menor que la recibida como parámetro
     */
    public boolean menorQue(Fraccion otra){
        if(getDenominador() == otra.getDenominador()){
            if(getNumerador() < otra.getNumerador()){
                return true;
            }else{
                return false;
            }
        }else if(getNumerador() == otra.getNumerador()){
            if(getDenominador() > otra.getDenominador()){
                return true;
            }else{
                return false;
            }
        }else{
            return ((getNumerador() * otra.getDenominador()) < (otra.getNumerador() * denominador));
        }
    }
    
    /**
     *
     * @return  la fracción actual clonada
     */
    public Fraccion clonar(){
        return new Fraccion(numerador, denominador);
    }
    
    /**
     * Representación textual de la fracción
     */
    
    public String toString()
    {
        String tmp = numerador + " / " + denominador;
        return tmp;
    }
                
}
