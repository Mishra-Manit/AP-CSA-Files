/**
 * @purpose: Tester to create PlanetV7 objects with single parameter constructor and overloaded calcRadius() method.
 *
 * @author APCS Team
 * @version FLVS 2020
 */

public class PlanetTesterV7a
{
   public static void main (String [] args) {
       String name1 = "Jupiter";
       int diam1 = 142984;

       double radius = 0.0;
       
       PlanetV7 planet1 = new PlanetV7(name1);
       radius = planet1.calcRadius(diam1);
       System.out.println("Planet: " + planet1.getName() + "\t Radius: " + radius);
      
       // notice you can put values directly in the parameter list or use a variable 
       PlanetV7 planet2 = new PlanetV7("Mars");
       radius = planet2.calcRadius(6794);
       System.out.println("Planet: " + planet2.getName() + "\t\t Radius: " + radius);

   
   } //end main()
    
} //end class

