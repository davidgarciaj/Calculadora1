
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
        int cont=6;
        while(cont < 95){
            if(cont % 5 == 0){
                System.out.println(cont);
            }
            cont++;
        }
    }
}
