/**
 * Purpose: Print many expressions with different operators
 *
 * 9/29/21
 * @ Manit Mishra
 */

public class CalculationsV6
{
    public static void main(String[ ] args)
    {
        // Declare integer variables
        int iNum1 = 25;
        int iNum2 = 9;
        int iNum3 = 11;

// Declare double variables
        double dNum1 = 43.21;
        double dNum2 = 3.14;
        double dNum3 = 10.0;

// Addition
        System.out.println("Addition");
        System.out.println(iNum1 + " + " + iNum2 + " = " + (iNum1 + iNum2));
        System.out.println(dNum1 + " + " + dNum2 + " = " + (dNum1 + dNum2));
        System.out.println();

// Subtraction
        System.out.println("Subtraction");
        System.out.println( "11 - 9 - 25 = " + (iNum3 - iNum2 - iNum1));
        System.out.println( "3.14 - 10.0 = " + (dNum2 - dNum3) );
        System.out.println();

        // Multiplication
        System.out.println("Multiplication");
        System.out.println( "25 * 9 = " + (iNum1 * iNum2) );
        System.out.println("3.14 * 10.0 * 10.0 = " + (dNum2 * dNum3 * dNum3) );
        System.out.println();

        // Division
        System.out.println("Division");
        System.out.println( "9 / 25 = " + (iNum2 / iNum1) );
        System.out.println( "43.21 / 10.0 = " + (dNum1 / dNum3) );
        System.out.println();

        // Modulus operator
        System.out.println("Modulus");
        System.out.println( "11 % 9 = " + (iNum3 % iNum2) );
        System.out.println( "10.0 % 3.14 = " + (dNum3 % dNum2) );
        System.out.println();

        // Three more arithmetic expressions of my own
        System.out.println("Mixed");
        System.out.println( "43.21 % 10.0 * 9 = " + (dNum1  % dNum3 * iNum2) );
        System.out.println( "10.0 - 3.14 / 25 = " + (dNum3 - dNum2 / iNum1) );
        System.out.println( "11 + 3.14 % 9 = " + (dNum3 + dNum2 % iNum2) );
        System.out.println();


    } // end of main method
} // end of class


