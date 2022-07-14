/**
 * @purpose: Tester to create an array of Student objects
 *
 * @author Manit Mishra
 * @version 1/8/2022
 */


public class StudentTester
{
    public static void main (String [] args) {

        //Student 1
        String name1 = "Jeff";
        double jeffGrade1 = 90.0;
        double jeffGrade2 = 92.2;

        //Student 2
        String name2 = "Mary";
        double maryGrade1 = 67.8;
        double maryGrade2 = 70.3;

        //Student 3
        String name3 = "Jack";
        double jackGrade1 = 99.9;
        double jackGrade2 = 78.9;


        //Array Initialization
        Student[] students = {new Student(name1, jeffGrade1, jeffGrade2), new Student(name2, maryGrade1, maryGrade2),
                              new Student(name3, jackGrade1, jackGrade2)};

        System.out.printf("%s %12s %14s %16s %17s %n", "Student Name", "Grade1", "Grade2", "Difference", "Average");
        System.out.println("===========================================================================");


        double average = 0.0;
        double difference = 0.0;

        //In order to print using the toString() method
        for(Student s: students) {
            average = s.calcAverage();
            difference = s.calcDifference();
            System.out.printf(s + " " + "%1.1f" + "                " + average + "%n", difference);
        }
    }
}

