/**
 * This program demonstrates how to assign values to individual
 * positions in a String array by reading the values from
 * a text file.
 *
 * @author David J. Farber
 * @version 06/06/17
 */
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
public class StringArrayDemoV3
{
    public static void main(String[ ] args) throws IOException
    {
        int index = 0;
        String [ ] dwarfNames = new String[7];
        File fileName = new File("seven.txt");
        Scanner inFile = new Scanner(fileName);

        // Input: read from text file and assign values one at a time to the array
        while (inFile.hasNext())
        {
            dwarfNames[index] = inFile.next();
            index++;
        }


        // Output: traverse the array and display the contents
        for(int n = 0; n < dwarfNames.length; n++)
        {
            System.out.println("Dwarf number " + (n + 1) + " is: "
                                  + dwarfNames[n] + ".  He is in array position "
                                  + n + ".");
        }
        inFile.close();

    }//end of main method
}//end of class
