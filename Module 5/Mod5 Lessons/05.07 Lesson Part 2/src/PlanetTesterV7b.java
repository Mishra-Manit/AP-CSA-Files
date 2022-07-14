/**
 * @purpose: Tester to create PlanetV7 objects with two parameter constructor and calcRadius() method with no parameters.
 *
 * @author APCS Team
 * @version FLVS 2020
 */
 
 public class PlanetTesterV7b
{
  
   public static void main (String [] args) {
      
       double radius = 0.0;
       
       // notice you can put values directly in the parameter list or use a variable
       PlanetV7 planet3 = new PlanetV7("Jupiter", 142984);
       radius = planet3.calcRadius();  // no need to have the diameter parameter because it's passed into the two parameter constructor
       System.out.println("Planet: " + planet3.getName() + "\t Radius: " + radius);
       
       PlanetV7 planet4 = new PlanetV7("Mars", 6794);
       radius = planet4.calcRadius();  // no need to have the diameter parameter because it's passed into the two parameter constructor
       System.out.println("Planet: " + planet4.getName() + "\t\t Radius: " + radius);

   } //end main()
    
} //end class

