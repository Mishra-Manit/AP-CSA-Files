import java.util.ArrayList;

/**
 * Purpose: Display a "Hello, World!" message to the screen.
 *
 * @version or date
 * @ Manit Mishra
 */
import java.util.ArrayList;                                         //import the ArrayList class
public class Quiz
{
    public static void main(String[] args)                          //header for the main method
    {

        ArrayList<Integer> aList = new ArrayList<Integer>();     //declares an ArrayList of Integers
        aList.add(-3);
        aList.add(95);
        aList.add(86);
        aList.add(11);
        aList.add(18);
        aList.add(42);
        aList.add(73);

        aList.add(5, 55);

        for(int fruit: aList){
            System.out.println(fruit);
        }

    }
}