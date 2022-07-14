/**
 * @purpose: Tester to create an array of PlanetV10 objects
 *
 * @author APCS Team
 * @version FLVS 2020
 */
 
 
public class PlanetTesterV10
{
   
   public static void main (String [] args) {
   
      
       String name1 = "Jupiter";
       int diam1 = 142984;
       
       String name2 = "Mars";
       int diam2 = 6794;
       
       String name3 = "Saturn";
       int diam3 = 120536;
       
       double radius = 0.0;
       
       PlanetV10[] planets = {new PlanetV10(name1, diam1), new PlanetV10(name2, diam2), new PlanetV10(name3, diam3)};
     
       System.out.printf("%s %12s %10s %n", "Planet", "Diameter", "Radius");
       System.out.println("=======================================");
       
       //prints the PlanetV10 array of objects using the toString() method
       for(PlanetV10 p: planets) {
         radius = p.calcRadius();
         System.out.println(p + " " + radius);
       }
         
   
   
   }
    
    
}
