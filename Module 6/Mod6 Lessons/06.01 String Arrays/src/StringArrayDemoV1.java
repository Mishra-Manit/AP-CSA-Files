
/**
 * This program demonstrates how to assign values to individual
 * positions in a String array.
 *
 * @author David J. Farber
 * @version 06/06/17
 */
import java.util.Scanner;
public class StringArrayDemoV1
{
    public static void main(String [] args)
    {
        int dwarfNum = 0;
        Scanner in = new Scanner(System.in);

        //String [ ] dwarfNames;
        //dwarfNames = new String[7];
        // OR


        // Direct assignment during array initialization:
        //String [] dwarfNames = {"Sleepy", "Sneezy", "Doc", "Dopey", "Happy", "Bashful", "Grumpy"};

        while(dwarfNum != 8)
        {
            System.out.print("Enter a number from 1 - 7 (8 to quit): ");
            dwarfNum = in.nextInt();

            if(dwarfNum >= 1 && dwarfNum <= 7)
            {
                System.out.println("Dwarf number " + dwarfNum + " is: "
                                  + dwarfNames[dwarfNum - 1]
                                  + ".  He is in array index position "
                                  + (dwarfNum - 1) + ".");
            }
            else if(dwarfNum < 1 || dwarfNum > 8)
            {
                System.out.println("Oops, there are 7 dwarves. Please try again.");
            }
            System.out.println();
        }
        System.out.println("Goodbye!");
    }
}
