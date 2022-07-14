/**
 * Purpose: Display the Test Grades, Total Points, and Average Scores for 9 different tests
 *
 * @9/30/2021
 * @ Manit Mishra
 */
public class GradesV2 {
    public static void main(String[] args) {
        //local variables
        int numTests = 0;      //counts number of tests
        int testGrade = 0;     //individual test grade
        int totalPoints = 0;   //total points for all tests
        double average = 0.0;  //average grade

        //Test 1
        testGrade = 95;         //test grade received
        totalPoints += testGrade;  //Updating the total points
        numTests ++; //Updates the amount of tests
        average = (double) totalPoints / numTests;
        System.out.println("Test # " + numTests + "\t" + "Test Grade: " + testGrade + "\t" + "Total Points: "
                + totalPoints + "\t" + "Average Score: " + average);

        //Test 2
        testGrade = 73;         //test grade received
        totalPoints += testGrade;  //Updating the total points
        numTests ++; //Updates the amount of tests
        average = (double) totalPoints / numTests; //gives the average of all the tests
        System.out.println("Test # " + numTests + "\t" + "Test Grade: " + testGrade + "\t" + "Total Points: "
                + totalPoints + "\t" + "Average Score: " + average);

        //Test 3
        testGrade = 91;         //test grade received
        totalPoints += testGrade;  //Updating the total points
        numTests ++; //Updates the amount of tests
        average = (double) totalPoints / numTests; //gives the average of all the tests
        System.out.println("Test # " + numTests + "\t" + "Test Grade: " + testGrade + "\t" + "Total Points: "
                + totalPoints + "\t" + "Average Score: " + average);

        //Test 4
        testGrade = 82;         //test grade received
        totalPoints += testGrade;  //Updating the total points
        numTests ++; //Updates the amount of tests
        average = (double) totalPoints / numTests; //gives the average of all the tests
        System.out.println("Test # " + numTests + "\t" + "Test Grade: " + testGrade + "\t" + "Total Points: "
                + totalPoints + "\t" + "Average Score: " + average);


        //My own made up test scores

        //Test 5
        testGrade = 56;         //test grade received
        totalPoints += testGrade;  //Updating the total points
        numTests ++; //Updates the amount of tests
        average = (double) totalPoints / numTests; //gives the average of all the tests
        System.out.println("Test # " + numTests + "\t" + "Test Grade: " + testGrade + "\t" + "Total Points: "
                + totalPoints + "\t" + "Average Score: " + average);

        //Test 6
        testGrade = 88;         //test grade received
        totalPoints += testGrade;  //Updating the total points
        numTests ++; //Updates the amount of tests
        average = (double) totalPoints / numTests; //gives the average of all the tests
        System.out.println("Test # " + numTests + "\t" + "Test Grade: " + testGrade + "\t" + "Total Points: "
                + totalPoints + "\t" + "Average Score: " + average);

        //Test 7
        testGrade = 25;         //test grade received
        totalPoints += testGrade;  //Updating the total points
        numTests ++; //Updates the amount of tests
        average = (double) totalPoints / numTests; //gives the average of all the tests
        System.out.println("Test # " + numTests + "\t" + "Test Grade: " + testGrade + "\t" + "Total Points: "
                + totalPoints + "\t" + "Average Score: " + average);

        //Test 8
        testGrade = 99;         //test grade received
        totalPoints += testGrade;  //Updating the total points
        numTests ++; //Updates the amount of tests
        average = (double) totalPoints / numTests; //gives the average of all the tests
        System.out.println("Test # " + numTests + "\t" + "Test Grade: " + testGrade + "\t" + "Total Points: "
                + totalPoints + "\t" + "Average Score: " + average);

        //Test 9
        testGrade = 78;         //test grade received
        totalPoints += testGrade;  //Updating the total points
        numTests ++; //Updates the amount of tests
        average = (double) totalPoints / numTests; //gives the average of all the tests
        System.out.println("Test # " + numTests + "\t" + "Test Grade: " + testGrade + "\t" + "Total Points: "
                + totalPoints + "\t" + "Average Score: " + average);

        //end of code
    }
}