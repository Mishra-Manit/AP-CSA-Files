/**
 * Purpose: Write a program to determine the surface gravity (g) on a planet in our solar system.
 *
 * @11/23/2021
 * @ Manit Mishra
 */
public class PlanetGravity {

    public static double SurfaceGravity(double mass, double diameter){
        double gravitationalConstant = 0.0000000000667;
        double radius = (0.5 * diameter) * 1000;
        double surfaceGravity = (gravitationalConstant * mass) / (radius * radius);
        double roundedSurfaceGravity = (int)(100*surfaceGravity)/100.0;
        return roundedSurfaceGravity;
    }

    public static void Header(){
        System.out.println("Planetary Data");
        System.out.println("Planet \t Diameter (km) \t Mass (kg) \t g(m/s^2)");
        System.out.println("---------------------------------------------");
    }

    public static void Results(){
        double mercuryMass = 3.30e23;
        double mercuryDiameter = 4880;
        double mercurySurfaceGravity = SurfaceGravity(mercuryMass, mercuryDiameter);
        System.out.println("Mercury \t " + mercuryDiameter + "\t\t\t" + mercuryMass +  "\t \t " + mercurySurfaceGravity);

        double venusMass = 4.869e24;
        double venusDiameter = 12103.6;
        double venusSurfaceGravity = SurfaceGravity(venusMass, venusDiameter);
        System.out.println("Venus \t \t" + venusDiameter + "\t\t\t" + venusMass +  "\t " + venusSurfaceGravity);

        double earthMass = 5.972e24;
        double earthDiameter = 12756.3;
        double earthSurfaceGravity = SurfaceGravity(earthMass, earthDiameter);
        System.out.println("Earth \t \t" + earthDiameter + "\t\t\t" + earthMass +  "\t " + earthSurfaceGravity);

        double marsMass = 6.4219e23;
        double marsDiameter = 6794;
        double marsSurfaceGravity = SurfaceGravity(marsMass, marsDiameter);
        System.out.println("Mars \t \t" + marsDiameter + "\t\t\t" + marsMass +  "\t " + marsSurfaceGravity);

        double jupiterMass = 1.900e27;
        double jupiterDiameter = 142984;
        double jupiterSurfaceGravity = SurfaceGravity(jupiterMass, jupiterDiameter);
        System.out.println("Jupiter \t" + jupiterDiameter + "\t\t" + jupiterMass + "\t \t" + jupiterSurfaceGravity);
    }

    public static void main(String[] args) {
        Header();
        Results();
    }
}