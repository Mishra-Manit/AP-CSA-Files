/**
 * Purpose: Display a "Hello, World!" message to the screen.
 *
 * @version or date
 * @ Manit Mishra
 */
import java.util.Random;
public class TEST {
    public static void main(String[] args) {

        int c = 2;
        int d = 0;
        while (c <= 10)
        {
            d = 1;
            while (d < c)
            {
                d++;
            }
            c += d;
        }
        System.out.println(c);
    }
}
