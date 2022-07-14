import java.util.ArrayList;
import java.util.Scanner;

/**
 * Purpose: Display the prime numbers according to the user input.
 *
 * @version 3/27/2022
 * @ Manit Mishra
 */

public class PrimeNumbersTester {
    public static void main(String[] args) {

        //Get the limits for the prime number selection
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the lower limit: ");
        int providedLowerLimit = in.nextInt();

        System.out.println("Enter the upper limit: ");
        int providedUpperLimit = in.nextInt();

        System.out.println();

        //Print out all the prime numbers generated
        PrimeNumbers newPrimeNumberCounter = new PrimeNumbers(providedLowerLimit, providedUpperLimit);

        ArrayList<Integer> primeNumbers = new ArrayList<Integer>();

        primeNumbers = PrimeNumbers.calcAllPrimeNumbers();

        int howManyNumbersPerLine = 0;

        for (int element : primeNumbers){
            System.out.printf("%15s", element);
            howManyNumbersPerLine++;

            if(howManyNumbersPerLine == 6){
                System.out.println();
                howManyNumbersPerLine = 0;
            }
        }

        System.out.println("\n\nNumber of Prime Numbers: " + PrimeNumbers.counter);
    }
}