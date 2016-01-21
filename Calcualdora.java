
/**
 * Write a description of class Calcualdora here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Calcualdora
{
    // instance variables - replace the example below with your own
    

    /**
     * Constructor for objects of class Calcualdora
     */
    public Calcualdora()
    {
       
    }

    /**
     *Muestra los numeros ente 5 y 95 
     */
    public void multiplesOfFive()
    {
        int cont = 6;
        while(cont < 95){
            if(cont % 5 == 0){
                System.out.println(cont);
            }
            cont++;
        }
    }
    
    /**
     * Muestra la suma de números entre 0 y 10 estos incluidos
     */
    public void sumValues(){
        int cont = 0;
        int sum = 0;
        while(cont <= 10){
            sum+= cont;
            cont++;
        }
        System.out.println(sum);
    }
    
    /**
     * Muestra la suma de números entre dos números dados estos incluidos
     */
    public int sumValuesInterval(int valor1, int valor2){
        if( valor2 < valor1){
            int cambio = valor1;
            valor1 = valor2;
            valor2 = cambio;
        }
        int cont = valor1;
        int sum = 0;
        if(valor1 == valor2){
            sum = valor1;
        }
        else if((valor1 < 0) || (valor2 < 0)){
            sum = -1;
        }
        else{
            while(cont <= valor2){
                sum+= cont;
                cont++;
            }
        }
        return sum;
    }
    
    /**
     * Devuelbe si un número dado es primo o no
     */
    public boolean isPrime(int valor){
        boolean esPrimo = true;
        int probador = 2;
        if(valor > 1){
            while(probador == valor-1 || !esPrimo){
                if(valor % probador == 0){
                    esPrimo = false;
                }
            }
        }
        else{
            System.out.println("El número dado es negativo, cero o uno; Es un valor invalido como número primo.");
            esPrimo = false;
        }
        return esPrimo;
    }
}
