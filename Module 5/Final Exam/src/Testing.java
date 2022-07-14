/**
 * Purpose: Display a "Hello, World!" message to the screen.
 *
 * @version or date
 * @ Manit Mishra
 */
public class Testing {

    public static void main(String[] args) {
        int score = 89;
        String grade = "";

        if(score>89)
            grade = "A";
        else if(score>79)
            grade = "B";
        else if(score>69)
            grade = "C";
        else if(score>59)
            grade = "D";
        else
            grade = "F";

        System.out.println(grade);

    }
}