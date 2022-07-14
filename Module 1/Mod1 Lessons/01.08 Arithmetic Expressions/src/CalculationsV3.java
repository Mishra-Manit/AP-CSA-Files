public class CalculationsV3
{
    public static void main(String[ ] args)
    {
        // Declare integer variables
        int iNum1 = 25;
        int iNum2 = 9;
        // Addition
        System.out.println("Addition");
        System.out.println(iNum1 + " + " + iNum2 + " = " + (iNum1 + iNum2));
        System.out.println(43.21 + " + " + 3.14+ " = " + (43.21 + 3.14));
        System.out.println();

        // Subtraction
        int iNum3 = 11;
        double iNum4 = 3.14;
        double iNum5 = 10.0;
        System.out.println("Subtraction");
        System.out.println( "11 - 9 - 25 = " + (iNum3 - iNum2 - iNum1));
        System.out.println( "3.14 - 10.0 = " + (iNum4 - iNum5) );
        //System.out.println();

        // Multiplication
        System.out.println("Multiplication");
        System.out.println( "25 * 9 = " + (iNum1 * iNum2) );
        System.out.println("3.14 * 10.0 * 10.0 = " + (iNum4 * iNum5 * iNum5) );
        //System.out.println();

        // Division
        double iNum6 = 43.21;
        System.out.println("Division");
        System.out.println( "9 / 25 = " + (iNum2 / iNum1) );
        System.out.println( "43.21 / 10.0 = " + (iNum6 / iNum5) );
        //System.out.println();

        // Modulus operator
        System.out.println("Modulus");
        System.out.println( "11 % 9 = " + (iNum3 % iNum2) );
        System.out.println( "10.0 % 3.14 = " + (iNum5 % iNum4) );
        //System.out.println();

        // 1.08 Additional int Equations


        // 1.09 Additional double Equations


    } // end of main method
} // end of class

