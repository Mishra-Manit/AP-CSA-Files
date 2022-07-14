
/**
 * This program demonstrates how to assign values to individual
 * positions of a String array with user input.
 *
 * @author David J. Farber
 * @version 06/06/17
 */
import java.util.Scanner;
public class StringArrayDemoV2
{
    public static void main(String [] args)
    {
        String [] dwarfNames = new String[7];

        Scanner in = new Scanner(System.in);

        // Input: assign user input to each index within the array
        for(int n = 0; n < dwarfNames.length; n++)
        {
            System.out.print("Enter the name of dwarf number " + (n + 1) + ": ");
            dwarfNames[n] = in.next();
        }
        System.out.println("\n\n");

        // Output: traverse the array to display contents of array
        System.out.println("The array of dwarf names is: ");
        for(int n = 0; n < dwarfNames.length; n++)
        {
            System.out.println("Dwarf number " + (n + 1) + " is: "
                                  + dwarfNames[n] + ".  He is in array position "
                                  + n + ".");
        }
    }
}
