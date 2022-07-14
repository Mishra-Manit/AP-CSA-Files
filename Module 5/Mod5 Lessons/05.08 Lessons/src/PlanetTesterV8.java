/**
 * @purpose: Tester to create two PlanetV8 objects
 *
 * @author APCS Team
 * @version FLVS 2020
 */
 
 
public class PlanetTesterV8
{
   
   public static void main (String [] args) {
   
      
       String name1 = "Jupiter";
       int diam1 = 142984;
       
       int diam2 = 6794;
       
       double radius = 0.0;
       
       PlanetV8 planet1 = new PlanetV8("");
       radius = planet1.calcRadius(diam1);
       System.out.println("Planet: " + name1 + "\t Radius: " + radius);
       
       // notice you can put values directly in the parameter list or use a variable
       PlanetV8 planet2 = new PlanetV8("Mars", diam2);
       radius = planet2.calcRadius();
       System.out.println("Planet: " + planet2.getName() + "\t\t Radius: " + radius);
       
       
       // create a third PlanetV8 object

   
   
   }    
    
}

