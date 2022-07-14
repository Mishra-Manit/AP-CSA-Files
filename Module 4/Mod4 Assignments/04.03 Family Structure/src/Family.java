/**
 * Purpose: Calculate the probability that a family with two children will consist of two boys, a boy and a girl, or two girls.
 *
 * 11/11/2021
 * @ Manit Mishra
 */

import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class Family {
    public static void main(String[] args) throws IOException
    {
        int twoBoys = 0;
        int twoGirls = 0;
        int oneBoyAndOneGirl = 0;

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the name of the File you want to open (eg: test1.txt): ");
        String userFileName = in.next();

        String token = "";
        File fileName = new File(userFileName);
        Scanner inFile = new Scanner(fileName);

        //while loop will continue while inFile has a next token to read
        while(inFile.hasNext())
        {
            token = inFile.nextLine( );      //read next token from file

            if (token.equalsIgnoreCase("GB") || (token.equalsIgnoreCase("BG")))
                oneBoyAndOneGirl ++;
            else if (token.equalsIgnoreCase("GG"))
                twoGirls ++;
            else if (token.equalsIgnoreCase("BB"))
                twoBoys ++;
        }//end while

        int totalFamilies = twoBoys + twoGirls + oneBoyAndOneGirl;

        double percentageTwoBoys = (double)twoBoys / totalFamilies;
        double percentageTwoGirls = (double)twoGirls / totalFamilies;
        double percentageOneBoyAndOneGirl = (double)oneBoyAndOneGirl / totalFamilies;

        double roundedPercentageTwoBoys = ((int)(10*percentageTwoBoys)/10.0) * 100;
        double roundedPercentageTwoGirls = ((int)(10*percentageTwoGirls)/10.0) * 100;
        double roundedPercentageOneBoyAndOneGirl = ((int)(10*percentageOneBoyAndOneGirl)/10.0) * 100;

        //Print Statements
        System.out.println("Composition statistics for families with two children.");
        System.out.println("\n" + "Total Number of Families: " + totalFamilies);
        System.out.println("\n" + "Number of Families with: ");
        System.out.println("\t\t\t" + "2 boys: " + twoBoys + "\t\t\t" + "is " + roundedPercentageTwoBoys + "%");
        System.out.println("\t\t\t" + "2 girls: " + twoGirls + "\t\t\t" + "is " + roundedPercentageTwoGirls + "%");
        System.out.println("\t" + "1 boy and 1 girl: " + oneBoyAndOneGirl + "\t\t\t" + "is " + roundedPercentageOneBoyAndOneGirl + "%");

        inFile.close();                 //close input file
    }
}