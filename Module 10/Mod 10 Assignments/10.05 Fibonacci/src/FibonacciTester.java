/**
 * Purpose: Test the fibonacci calculator.
 *
 * @version 4/11/2022
 * @ Manit Mishra
 */
import java.util.Scanner;

public class FibonacciTester {
    public static void main(String[] args) {
        int chosenNumber;

        Scanner in = new Scanner(System.in);

        Fibonacci newFibonacci = new Fibonacci(0);

        System.out.println("Enter the number -1 in order to quit the program\n");

        System.out.println("Enter a number for which you want the fibonacci sequence calculated:");

        chosenNumber = in.nextInt();

        while (chosenNumber != -1){

            if (chosenNumber < -1){
                System.out.println("Please enter -1 to quit the program, otherwise enter a whole number greater than 1" +
                        " to get the results from the fibonacci series.\n");
                System.out.println("Enter a number for which you want the fibonacci sequence calculated:");
                chosenNumber = in.nextInt();
            }

            System.out.print("\nThe number from the fibonacci series is: ");
            System.out.println(newFibonacci.calcFibonacci(chosenNumber));
            System.out.println();


            System.out.println("Choose a number for which you want the fibonacci sequence calculated");

            chosenNumber = in.nextInt();
        }
    }
}
