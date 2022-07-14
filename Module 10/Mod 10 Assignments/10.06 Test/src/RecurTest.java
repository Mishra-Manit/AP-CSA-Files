/**
 * Purpose: Display a "Hello, World!" message to the screen.
 *
 * @version or date
 * @ Manit Mishra
 */
public class RecurTest {

    public static int recur(int n)
    {
        if(n < 3)
        {
            return 2;
        }
        else
        {
            return recur(n / 3) + 1;
        }
    }

    public static void main(String[] args) {
        System.out.println(recur(10));
    }
}