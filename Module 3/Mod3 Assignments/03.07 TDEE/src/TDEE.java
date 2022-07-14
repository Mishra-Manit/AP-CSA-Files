/**
 * Purpose: Calculate the TDEE with the given gender, BMR, and activity level
 *
 * @ 11/7/2021
 * @ Manit Mishra
 */
import java.util.Scanner;
public class TDEE {
    public static void main(String[] args) {

        double activityFactor = 0;

        Scanner in = new Scanner(System.in);

        //Get inputs
        System.out.println("Please enter your name: ");
        String name = in.nextLine();

        System.out.println("Please Enter your BMR: ");
        String stringBMR = in.next();
        double doubleBMR = Double.parseDouble(stringBMR);

        System.out.println("Please Enter your gender (M/F): ");
        String gender = in.next();
        String upperCaseGender = gender.toUpperCase();

        //Display Menu
        System.out.println("\n\nPlease Select your activity level");
        System.out.println("[A] Resting (Sleeping, Reclining)");
        System.out.println("[B] Sedentary (Minimal Movement)");
        System.out.println("[C] Light (Office work, sitting)");
        System.out.println("[D] Moderate (Light Manual Labor)");
        System.out.println("[E] Very Active (Head Manual Labor)");
        System.out.println("[F] Extremely Active (Heavy Manual Labor)");

        System.out.println("\nEnter the letter corresponding to your activity level: ");
        String activityLevel = in.next();

        //If Statements
        if (activityLevel.equalsIgnoreCase("A"))
        {
            activityFactor = 1.0;
        }
        else if (activityLevel.equalsIgnoreCase("B"))
        {
            activityFactor = 1.3;
        }
        else if ((activityLevel.equalsIgnoreCase("C")) && (gender.equalsIgnoreCase("M")))
        {
            activityFactor = 1.6;
        }
        else if ((activityLevel.equalsIgnoreCase("C")) && (gender.equalsIgnoreCase("F")))
        {
            activityFactor = 1.5;
        }
        else if ((activityLevel.equalsIgnoreCase("D")) && (gender.equalsIgnoreCase("M")))
        {
            activityFactor = 1.7;
        }
        else if ((activityLevel.equalsIgnoreCase("D")) && (gender.equalsIgnoreCase("F")))
        {
            activityFactor = 1.6;
        }
        else if ((activityLevel.equalsIgnoreCase("E")) && (gender.equalsIgnoreCase("M")))
        {
            activityFactor = 2.1;
        }
        else if ((activityLevel.equalsIgnoreCase("E")) && (gender.equalsIgnoreCase("F")))
        {
            activityFactor = 1.9;
        }
        else if ((activityLevel.equalsIgnoreCase("F")) && (gender.equalsIgnoreCase("M")))
        {
            activityFactor = 2.4;
        }
        else if ((activityLevel.equalsIgnoreCase("F")) && (gender.equalsIgnoreCase("F")))
        {
            activityFactor = 2.2;
        }
        else
        {
            System.out.println("You did not choose a valid option");
            return;
        }

        //Formula
        double TDEE = doubleBMR * activityFactor;

        //Print Formatting
        System.out.println("\n\n" + "Your Results: ");
        System.out.print("Name: " + name);
        System.out.println("\t\t\t\t" + "Gender: " + upperCaseGender);
        System.out.print("BMR: " + doubleBMR + " calories");
        System.out.println("\t\t\t" + "Activity Factor: " + activityFactor);
        System.out.println("TDEE: " + TDEE + " calories");
    }
}