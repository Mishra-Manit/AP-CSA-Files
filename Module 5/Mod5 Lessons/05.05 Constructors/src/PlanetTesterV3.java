/**
 * @purpose: PlanetTesterV3 client class 
 *
 * @author APCS Team
 * @version FLVS 2020
 */
 
 
public class PlanetTesterV3
{

   public static void printPlanet(String n, double rad)
   {
       System.out.println("Planet " + n + " has a radius of " + rad);
   }
   

   public static void main (String[] args) {
   
       String name = "Jupiter";
       int diam = 142984;
       double radius = 0.0;
       
       PlanetV3 planet1 = new PlanetV3();
       
       radius = planet1.calcRadius(diam);
       printPlanet(name, radius);
   
   }
    
    
}

