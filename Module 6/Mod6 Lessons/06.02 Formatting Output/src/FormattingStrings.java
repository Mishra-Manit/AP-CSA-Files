
/**
 * This program demonstrates how to format strings with the printf() method.
 *
 * After reading each section of the lesson on formatting strings, remove the
 * comments for the appropriate section of code, then run it to see printf()
 * in action.
 *
 * @author David J. Farber
 * @version 06/06/17
 */
public class FormattingStrings
{
    public static void main(String [] args)
    {
        String arg1 = "Tallahassee";
        String arg2 = "Florida";

        System.out.println(".........1.........2.........3.........4.........5");
        System.out.printf("%s", arg1);
        System.out.println();
        System.out.printf("%S", arg1);
        System.out.println();
        System.out.println();

        //Don't forget to uncomment the following sections as you work through
        //Don't forget to uncomment the following sections as you work through
        //the lesson.
        
        System.out.println(".........1.........2.........3.........4.........5");
        System.out.printf("%15s%n", arg1);
        System.out.printf("%-15s%n", arg1);
        System.out.println();


        // Left justify String values
        System.out.println(".........1.........2.........3.........4.........5");
        System.out.printf("%-15s",arg1);
        System.out.printf("%10s%n",arg2);
        System.out.println();


        // Multiple arguments
        System.out.println(".........1.........2.........3.........4.........5");
        System.out.printf("%-15s%-7s%n", arg1, arg2);
        System.out.println();


        //Printing multiple String values
        System.out.printf("City: %-15s State: %4s%n", arg1, arg2);
        System.out.printf("%s is the capitol of %s.%n", arg1, arg2);
        System.out.printf("Florida State University is located in %s, %s.\n", arg1, arg2);
        System.out.printf("The population of %s, %s is over 150,000.\n", arg1, arg2);

    }
}
