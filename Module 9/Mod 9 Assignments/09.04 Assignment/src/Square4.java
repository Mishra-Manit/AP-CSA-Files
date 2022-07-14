/**
 * This class defines a Square object by extending rectangle
 *
 * @author Manit Mishra
 * @version 3/26/2022
 */
public class Square4 extends Rectangle4
{
    // Constructor for objects of class Box
    public Square4(int l, int w)
    {
        // call superclass
        super(l, w);
    }

    public String toString()
    {
        return "Square - " + getLength() + " X " + getWidth();
    }

}
