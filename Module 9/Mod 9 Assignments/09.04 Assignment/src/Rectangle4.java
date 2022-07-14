
/**
 * This class defines a Rectangle object using
 * length and width.
 * The toString method has been added.
 *
 *
 * @author Poly Morphism and Manit Mishra
 * @version 3/26/2022
 */
public class Rectangle4
{
    // instance variables
    private int length;
    private int width;

    // Constructor for objects of class Rectangle
    public Rectangle4(int l, int w)
    {
        // initialize instance variables
        length = l;
        width = w;
    }

    // return the height
    public int getLength()
    {
        return length;
    }

    // return the width
    public int getWidth()
    {
        return width;
    }

    public boolean equals(Object b){
        Rectangle4 rec = (Rectangle4)b;

        if (rec.getLength() == length && rec.getWidth() == width){
            return true;
        }
        return false;
    }

    // String to display when object is printed.

    public String toString()
    {
        return "Rectangle - " + length + " X " + width;
    }

}
