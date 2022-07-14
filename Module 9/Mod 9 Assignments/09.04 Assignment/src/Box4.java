/**
 * This class defines a Box object by extending
 * Rectangle and includes height.
 * The toString method has been added.
 *
 * @author Poly Morphism and Manit Mishra
 * @version 3/26/2022
 */
public class Box4 extends Rectangle4
{
    // instance variables
    private int height;

    // Constructor for objects of class Box
    public Box4(int l, int w, int h)
    {
        // call superclass
        super(l, w);

        // initialize instance variables
        height = h;
    }

    // return the height
    public int getHeight()
    {
        return height;
    }

    public boolean equals(Object b){
        Box4 box = (Box4)b;

        if (box.getLength() == getLength() && box.getWidth() == getWidth() && box.getHeight() == height){
            return true;
        }
        return false;
    }

    // String to display when object is printed.

    public String toString()
    {
        return "Box - " + getLength() + " X " + getWidth() + " X " + height;
    }

}
