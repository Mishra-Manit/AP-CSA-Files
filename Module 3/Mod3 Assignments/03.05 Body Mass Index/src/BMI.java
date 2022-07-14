/**
 * Purpose: Calculate the BMI of someone with the height and weight given
 *
 * @ 11/5/2021
 * @ Manit Mishra
 */

import java.util.Scanner;


public class BMI {
    public static void main(String[] args) {

        String category = "";

        Scanner in = new Scanner(System.in);

        //Input
        System.out.println("Please enter your name: ");
        String nameString = in.nextLine();

        System.out.print("Please enter your height in Feet and then Inches(eg. 4 11): ");
        String feetString = in.next();
        String inchesString = in.next();
        int feetInt = Integer.parseInt(feetString);
        int inchesInt = Integer.parseInt(inchesString);

        System.out.println("Please enter your weight in pounds: ");
        String weightString = in.next();
        double weightInt = Double.parseDouble(weightString);

        //Formulas

        feetInt = feetInt * 12;                     //to find how many inches are in the feet
        int totalInches = feetInt + inchesInt;      //to get total number of inches

        double totalInchesToMeters = totalInches / 39.37;
        double roundedInchesToMeters = (int)(10 * totalInchesToMeters)/10.0;

        double weightInKilograms = weightInt / 2.205;
        double roundedWeightInKilograms = (int)(10 * weightInKilograms)/10.0;

        double BMI = roundedWeightInKilograms / (roundedInchesToMeters * roundedInchesToMeters);
        double roundedBMI = (int)(10 * BMI)/10.0;

        // If statements

        if (roundedBMI < 18.5)
                category = "Underweight";

        else if (roundedBMI < 24.9)
                category = "Healthy Weight";

        else if (roundedBMI <  29.9)
                category = "Overweight";
        else
                category = "Obese";

        //Print Statements

        System.out.println("\n" + "BMI Calculator");
        System.out.println("--------------------------------------------");
        System.out.println("Height (m): " + roundedInchesToMeters);
        System.out.println("Weight (kg): " + roundedWeightInKilograms);
        System.out.println("BMI: " + roundedBMI);
        System.out.println("Category: " + category);







    }
}