/**
 * Purpose: To use the pythagorean theorem to find the length of the hypotenuse when 2 sides are given.
 *
 * 10/17/2021
 * @ Manit Mishra
 */
public class PyTheorem {
    public static void main(String[] args) {
        //Triangle 1
        int sideA = (int)(Math.random() * 18) + 5;
        int sideB = (int)(Math.random() * 18) + 5;

        double sideC = (double)(Math.sqrt((sideA * sideA) + (sideB * sideB)));

        //Triangle 2
        int sideA2 = (int)(Math.random() * 18) + 5;
        int sideB2 = (int)(Math.random() * 18) + 5;

        double sideC2 = (double)(Math.sqrt((sideA2 * sideA2) + (sideB2 * sideB2)));

        // Print Statements
        System.out.print("Triangle 1");
        System.out.print("\t \t Side 1: " + sideA);
        System.out.print("\t \t Side 2: " + sideB);
        System.out.println("\t \t Hypotenuse: " + sideC);

        System.out.print("Triangle 2");
        System.out.print("\t \t Side 1: " + sideA2);
        System.out.print("\t \t Side 2: " + sideB2);
        System.out.print("\t \t Hypotenuse: " + sideC2);

    }
}