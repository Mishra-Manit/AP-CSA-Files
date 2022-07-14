/**
 * This class defines a Brick object by extending the box class
 *
 * @author Manit Mishra
 * @version 3/26/2022
 */
public class Brick4 extends Box4
{
    // Constructor for objects of class Box
    public Brick4(int l, int w, int h)
    {
        // call superclass
        super(l, w, h);
    }

    // String to display when object is printed.

    public String toString()
    {
        return "Brick - " + getLength() + " X " + getWidth() + " X " + getHeight();
    }

}
