
/**
 * Purpose: To display the shapes and the results of comparing these shapes
 *
 * @author Manit Mishra
 * @version 3/26/2022
 */
import java.util.*;
public class ShapesTester4
{
    public static void main(String []args)
    {
        Rectangle4 one = new Rectangle4(12, 20);
        Rectangle4 two = new Box4(4, 12, 8);
        Rectangle4 three = new Square4(12, 12);
        Rectangle4 four = new Brick4(4, 4, 4);
        Rectangle4 five = new Cube4(4, 4, 4);

        ArrayList<Rectangle4> shapes = new ArrayList<Rectangle4>();

        shapes.add( one );
        shapes.add( two );
        shapes.add( three );
        shapes.add( four );
        shapes.add( five );

        System.out.println("My shapes: \n");

        for(Rectangle4 rect: shapes)
        {
        	showEffectBoth(rect);
        }

        System.out.println("\nTest for Equality: \n");

        String output1 = returnForYesOrNo(shapes, "Brick", "Cube");

        String output2 = returnForYesOrNo(shapes, "Square", "Rectangle");

        System.out.println(output1);
        System.out.println();
        System.out.println(output2);

    }

    public static void showEffectBoth(Rectangle4 r)
    {
        System.out.println(r);
    }

    public static String returnForYesOrNo(ArrayList <Rectangle4> shapes, String shape1, String shape2){
        int locationOfShape1 = 0;
        int locationOfShape2 = 0;

        for (int i = 0; i < shapes.size(); i++){
            if(shapes.get(i).getClass().getName().substring(0, shapes.get(i).getClass().getName().length()-1).equalsIgnoreCase(shape1)){
                locationOfShape1 = i;
            }
        }

        for (int i = 0; i < shapes.size(); i++){
            if(shapes.get(i).getClass().getName().substring(0, shapes.get(i).getClass().getName().length()-1).equalsIgnoreCase(shape2)){
                locationOfShape2 = i;
            }
        }

        boolean equalsOrNot = shapes.get(locationOfShape1).equals(shapes.get(locationOfShape2));

        String returnString = "";

        if (equalsOrNot){
            returnString = shapes.get(locationOfShape1) + " IS same size as " + shapes.get(locationOfShape2);
        }
        else{
            returnString = shapes.get(locationOfShape1) + " is NOT the same size as " + shapes.get(locationOfShape2);
        }

        return returnString;
    }
}