/**
 * @purpose: Tester to create a PlanetV11 ArrayList objects
 *
 * @author APCS Team
 * @version FLVS 2020
 */
 
import java.util.ArrayList;
public class PlanetTesterV11
{
   
   public static void main (String [] args) {
   
      
       String name1 = "Jupiter";
       int diam1 = 142984;
       
       String name2 = "Mars";
       int diam2 = 6794;
       
       String name3 = "Saturn";
       int diam3 = 120536;
       
       
       ArrayList<PlanetV11> space = new ArrayList<PlanetV11>();
       
       space.add(new PlanetV11(name1, diam1));
       space.add(new PlanetV11(name2, diam2));
       space.add(new PlanetV11(name3, diam3));
     
       System.out.printf("%s %12s %10s %n", "Planet", "Diameter", "Radius");
       System.out.println("=======================================");
       
       //prints the PlanetV11 ArrayList using the toString() method
       for(PlanetV11 sp: space) {
         sp.calcRadius();
         System.out.println(sp + " " + sp.getRadius());
       }
         
   
   
   }
    
    
}
