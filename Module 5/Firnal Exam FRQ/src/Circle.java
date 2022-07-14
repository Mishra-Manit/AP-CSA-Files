
public class Circle
{

    private double radius;

    // constructors
    // postcondition: the instance variable is initialized
    public Circle(double rad)
    {
        radius = rad;
    }

    // postcondition: the instance variable is initialized
    public Circle(int diameter)
    {
        radius = diameter / 2.0;
    }

    // postcondition: returns the sector area of a circle with radius equal to
    // this circle's radius, according to the formula: (deg / 360) * PI * r^2,
    // where deg is the angle in degrees passed as the parameter,
    // PI is the value of pi (3.1415…), r is the radius of the circle,
    // and "^2" means raised to the second power.
    // Use the Math class constant to represent the value of pi.

    public double sectorArea(double degree)
    {
        double sectorArea = (degree / 360) * Math.PI * (Math.pow(radius, 2));
        return sectorArea;
    }

    // There may be other instance variables, constructors,
    // and methods that are not shown.

}