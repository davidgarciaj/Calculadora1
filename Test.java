
/**
 * Write a description of class Test here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Test
{
    // Objeto que vas a provar
    private Calculadora Calcu;

    /**
     * Constructor for objects of class Test
     */
    public Test()
    {
        Calcu = new Calculadora();
    }

    /**
     * Prueba del método sumValuesInterval 
     */
    public void testSumValuesInterval()
    {
       String mens1 = "";
       String mens2 = "";
       String mens3 = "";
       String mens4 = "";
       String mens5 = "";
       String mens6 = "";
       boolean funcionaCorrecto = true;
       int resul1 = Calcu.sumValuesInterval(2,5);
       if(resul1 == 14){
           mens1 = " 14... Ok";
       }
       else{
           mens1 = " " + resul1 + "... ERROR"; 
           funcionaCorrecto = false;
       }       
       System.out.println("Comprobando sumValuesInterval(2,5)... resultado correcto 14 / resultado método" + mens1);
       int resul2 = Calcu.sumValuesInterval(5,2);
       if(resul2 == 14){
           mens2 = " 14... Ok";
       }
       else{
           mens2 = " " + resul2 + "... ERROR"; 
           funcionaCorrecto = false;
       }       
       System.out.println("Comprobando sumValuesInterval(5,2)... resultado correcto 14 / resultado método" + mens2);
       int resul3 = Calcu.sumValuesInterval(5,5);
       if(resul3 == 5){
           mens3 = " 5... Ok";
       }
       else{
           mens3 = " " + resul3 + "... ERROR"; 
           funcionaCorrecto = false;
       }       
       System.out.println("Comprobando sumValuesInterval(5,5)... resultado correcto 5 / resultado método" + mens3);
       int resul4 = Calcu.sumValuesInterval(-2,5);
       if(resul4 == -1){
           mens4 = " -1... Ok";
       }
       else{
           mens4 = " " + resul4 + "... ERROR"; 
           funcionaCorrecto = false;
       }       
       System.out.println("Comprobando sumValuesInterval(-2,5)... resultado correcto -1 / resultado método" + mens4);
       int resul5 = Calcu.sumValuesInterval(2,-5);
       if(resul5 == -1){
           mens5 = " -1... Ok";
       }
       else{
           mens5 = " " + resul5 + "... ERROR"; 
           funcionaCorrecto = false;
       }       
       System.out.println("Comprobando sumValuesInterval(2,-5)... resultado correcto -1 / resultado método" + mens5);
       int resul6 = Calcu.sumValuesInterval(-2,-5);
       if(resul6 == -1){
           mens6 = " -1... Ok";
       }
       else{
           mens6 = " " + resul6 + "... ERROR"; 
           funcionaCorrecto = false;
       }       
       System.out.println("Comprobando sumValuesInterval(-2,-5)... resultado correcto -1 / resultado método" + mens6);
       if(funcionaCorrecto){
           System.out.println("El método SI funciona correctamente");
       }
       else{           
           System.out.println("El método NO funciona correctamente");
       }
    }

    /**
     * Prueba del método isPrime 
     */
    public void testIsPrime()
    {
       String mens1 = "";
       String mens2 = "";
       String mens3 = "";
       String mens4 = "";
       String mens5 = "";
       String mens6 = "";
       boolean funcionaCorrecto = true;
       boolean resul1 = Calcu.isPrime(2);
       if(resul1){
           mens1 = " true... OK";
       }
       else{
           mens1 = " false... ERROR"; 
           funcionaCorrecto = false;
       }       
       System.out.println("Comprobando isPrime(2)... resultado correcto true / resultado método" + mens1);
       
       boolean resul2 = Calcu.isPrime(1);
       if(resul2){
           mens2 = " true... ERROR";
           funcionaCorrecto = false;
       }
       else{
           mens2 = " false... OK"; 
       }       
       System.out.println("Comprobando isPrime(1)... resultado correcto false / resultado método" + mens2);
       
       boolean resul3 = Calcu.isPrime(4);
       if(resul3){
           mens3 = " true... ERROR";
           funcionaCorrecto = false;
       }
       else{
           mens3 = " false... OK"; 
       }       
       System.out.println("Comprobando isPrime(4)... resultado correcto false / resultado método" + mens3);
       
       boolean resul4 = Calcu.isPrime(7);
       if(resul4){
           mens4 = " true... Ok";
       }
       else{
           mens4 = " false... ERROR"; 
           funcionaCorrecto = false;
       }       
       System.out.println("Comprobando isPrime(7)... resultado correcto true / resultado método" + mens4);
       
       boolean resul5 = Calcu.isPrime(-2);
       if(resul5){
           mens5 = " true... ERROR";
           funcionaCorrecto = false;
       }
       else{
           mens5 = " false... OK"; 
       }       
       System.out.println("Comprobando isPrime(-2)... resultado correcto false / resultado método" + mens5);
       
       boolean resul6 = Calcu.isPrime(0);
       if(resul6){
           mens6 = " true... ERROR";
           funcionaCorrecto = false;
       }
       else{
           mens6 = " false... OK"; 
       }       
       System.out.println("Comprobando isPrime(0)... resultado correcto false / resultado método" + mens6);
       
       if(funcionaCorrecto){
           System.out.println("El método SI funciona correctamente");
       }
       else{           
           System.out.println("El método NO funciona correctamente");
       }
    }
}
