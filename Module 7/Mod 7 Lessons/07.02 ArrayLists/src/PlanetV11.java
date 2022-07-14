/**
 * @purpose: PlanetV11 Object Class
 *
 * @author APCS Team
 * @version FLVS 2020
 *
 */
 
 
public class PlanetV11
{
   private String n;
   private double d;
   private double r;

     
   
   //one parameter constructor, all private instance variables initialized
   public PlanetV11(String name) {
      n = name;
      d = 0.0;
   }

   //two parameter constructor
   public PlanetV11(String name, double diam){
      n = name;
      d = diam;
      r = 0.0;
   }
   
   public String getName() {
      return n; 
   }
   
   public double getDiam() {
      return d;  
   }
   
   
   public void setName(String name) {
      n = name;
   }
   
   public void setDiam(double diam) {
      d = diam;
   }
   

   public void calcRadius()
   {
       r = d / 2.0;
   }
   
   //overloaded method
   public void calcRadius(int d)
   {
       r = d / 2.0;
   }
   
   public double getRadius() {
   
      return r;
   }

   public String toString() {
   
      return String.format("%-10s %-12.1f", getName(), getDiam());  
   }
    
}
