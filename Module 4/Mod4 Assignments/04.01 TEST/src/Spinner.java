/**
 * Purpose: A spinner for a game has four possible options: blue, red, yellow, green.
 * The chance of landing on each option is equal. Write the section of code to simulate
 * using the spinner 15 times and reporting the resulting color.
 *
 * @ 11/7/2021
 * @ Manit Mishra
 */

import java.util.Scanner;
public class Spinner {
    public static void main(String[] args) {
        int spinCount = 0;
        String blue = "Blue";
        String red = "Red";
        String yellow = "Yellow";
        String green = "Green";

        int blueCount = 0;
        int redCount = 0;
        int yellowCount = 0;
        int greenCount = 0;

        Scanner in = new Scanner(System.in);

        System.out.println("How many times will the coin be flipped? ");
        int totalFlips = in.nextInt();

        while(spinCount < totalFlips)
        {
            //Random value between 0.0 (inclusive) and 1.0 (exclusive)
            double randNum = Math.random();

            if(randNum < 0.25)          //change to < 0.3
            {
                System.out.println(blue);
                blueCount ++;
            }
            else if(randNum < 0.50)
            {
                System.out.println(red);
                redCount ++;
            }
            else if(randNum < 0.75)
            {
                System.out.println(yellow);
                yellowCount ++;
            }
            else
            {
                System.out.println(green);
                greenCount ++;
            }

            spinCount++;

        }//end while
        System.out.println();
        System.out.println("Blue Count: " + blueCount);
        System.out.println("Red Count: " + redCount);
        System.out.println("Yellow Count: " + yellowCount);
        System.out.println("Green Count: " + greenCount);
    }
}