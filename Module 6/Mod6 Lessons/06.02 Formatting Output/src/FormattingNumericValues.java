
/**
 * This program demonstrates how to format numeric values with the printf() method.
 *
 * After reading each section of the lesson on formatting strings, remove the
 * comments for the appropriate section of code, then run it to see printf()
 * in action.
 *
 * @author David J. Farber
 * @version 06/06/17
 */
public class FormattingNumericValues
{
    public static void main(String [] args)
    {
        int intArgument1 = 16934;
        int intArgument2 = 12;
        int intArgument3 = -301;
        int intArgument4 = 7432;

        double doubleArgument = 3.141592654;

        //Formatting integers without specifying a field width
        System.out.println(".........1.........2.........3.........4.........5");
        System.out.printf("%d%n", 16934);
        System.out.printf("%d%n", 12);
        System.out.printf("%d%n", -301);
        System.out.printf("%d\n", 7432);
        System.out.println();

        //Don't forget to uncomment the following sections as you work through
        //the lesson.


        //Formatting integers with a field width

        System.out.println(".........1.........2.........3.........4.........5");
        System.out.printf("%10d\n", intArgument1);
        System.out.printf("%10d\n", intArgument2);
        System.out.printf("%10d\n", intArgument3);
        System.out.printf("%10d\n", intArgument4);
        System.out.printf("%10d\n", intArgument4);
        System.out.println();


        //Formatting integers with commas

        System.out.println(".........1.........2.........3.........4.........5");
        System.out.printf("%,10d\n", intArgument1);
        System.out.printf("%,10d\n", intArgument2);
        System.out.printf("%,10d\n", intArgument3);
        System.out.printf("%,10d\n", intArgument4);
        System.out.printf("%,+10d\n", intArgument4);
        System.out.println();


        //Formatting multiple integer arguments in one statement

        System.out.println(".........1.........2.........3.........4.........5");
        System.out.printf("%10d%7d%,15d%n",-25,4963,7894502);
        System.out.println();


        //Formatting double values

        System.out.println(".........1.........2.........3.........4.........5");
        System.out.printf("%f\n",3.141592654);
        System.out.printf("%9f\n",3.141592654);
        System.out.printf("%12.9f\n",3.141592654);
        System.out.printf("%1.2f\n",3.141592654);
        System.out.println();


        //Formatting String and numeric values together

        System.out.println(".........1.........2.........3.........4.........5");
        System.out.printf("The value of pi is: %f\n",3.141592654);
        System.out.printf("The total cost is $%4.2f. \n",42.999);
        System.out.printf("Scientific notation %10.3E. \n", 0.0000000000667408);



        System.out.println();
        System.out.println();
    }
}
