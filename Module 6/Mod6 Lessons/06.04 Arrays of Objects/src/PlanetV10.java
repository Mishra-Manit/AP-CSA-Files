/**
 * @purpose: PlanetV10 Object Class
 *
 * @author APCS Team
 * @version FLVS 2020
 *
 */
 
 
public class PlanetV10
{
   private String n;
   private double d;

     
   
   //one parameter constructor, all private instance variables initialized
   public PlanetV10(String name) {
      n = name;
      d = 0.0;
   }

   //two parameter constructor
   public PlanetV10(String name, double diam){
      n = name;
      d = diam;

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
   

   public double calcRadius()
   {
       double radius = 0.0;
       radius = d / 2.0;
       return radius;
   }
   
   //overloaded method
   public double calcRadius(int d)
   {
       double radius = 0.0;
       radius = d / 2.0;
       return radius;
   }

   public String toString() {
   
      return String.format("%-10s %-12.1f", getName(), getDiam());  
   }
    
}
