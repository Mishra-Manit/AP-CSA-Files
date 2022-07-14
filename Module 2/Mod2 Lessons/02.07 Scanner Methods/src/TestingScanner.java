import java.util.Scanner;

/**
 * Purpose: Display a "Hello, World!" message to the screen.
 *
 * @version or date
 * @ Manit Mishra
 */
public class TestingScanner {
    public static void main(String[] args) {

        Scanner in;
        in = new Scanner(System.in);

        System.out.println("Enter the name of your favorite book: ");
        String title = in.next();
        System.out.println(title);

    }
}