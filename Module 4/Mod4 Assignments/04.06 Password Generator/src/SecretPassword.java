/**
 * Purpose: Program that generates random passwords; the user should be able to select the length.
 *
 * 11/13/2021
 * @ Manit Mishra
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.io.File;
import java.util.Scanner;

public class SecretPassword
{
    public static void main(String [] args) throws IOException
    {
        String userChoice = "Y";
        int pwLength = 0;
        String password = "";

        // initialize scanner and print writer
        Scanner in = new Scanner(System.in);

        System.out.println("**********************************************************");
        System.out.println("Welcome to a simple password generator. \nThe password will include lowercase, uppercase, & numbers.");

        // the user wants to continue

// Ask for password length
        System.out.println("Enter a password length (6 or more): ");
        pwLength = in.nextInt();

// validate password length
        while (pwLength < 6) {
            System.out.println("Password Length too short. Please try again");
            System.out.println("Enter a password length (6 or more): ");
            pwLength = in.nextInt();
        }

        // generate a random character in the correct character set
        PrintWriter outFile = new PrintWriter(new File("Passwords.txt"));

        userChoice = "Y";
        int passwordCounter = 1;

        while (userChoice.equalsIgnoreCase("Y")) {
            for (int loop = 1; loop <= pwLength; loop++) {
                int numbers = (int) ((Math.random() * 93) + 33);
                password = password + (char) numbers;
            }
            outFile.println(passwordCounter + ") " + password);
            System.out.println("\nA password has been written to the text file");
            password = "";
            System.out.println("Would you like to make a new password: Y/N ");
            userChoice = in.next();
            passwordCounter ++;
        }

        System.out.println("\nThank you for using the Password Generator");
        outFile.close();

        // Read passwords back from text file and display to the screen

        System.out.println("\nHere are your randomly generated codes:");

        String token = "";
        File fileName = new File("Passwords.txt");
        Scanner inFile = new Scanner(fileName);

        while( inFile.hasNext() )
        {
            token = inFile.nextLine( );
            System.out.println(token);
        }

        inFile.close();
    }//end main
}//end class

