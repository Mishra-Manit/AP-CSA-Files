/**
 * This class defines a Cube object by extending Box
 *
 * @author Manit Mishra
 * @version 3/26/2022
 */
public class Cube4 extends Box4
{

    // Constructor for objects of class Box
    public Cube4(int l, int w, int h)
    {
        // call superclass
        super(l, w, h);
    }

    // String to display when object is printed.

    public String toString()
    {
        return "Box - " + getLength() + " X " + getWidth() + " X " + getHeight();
    }

}
