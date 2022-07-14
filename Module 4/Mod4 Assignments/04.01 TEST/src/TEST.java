/**
 * Purpose: Display a "Hello, World!" message to the screen.
 *
 * @version or date
 * @ Manit Mishra
 */
public class TEST {
    public static void main(String[] args) {
        int flipCount = 0;

        while(flipCount < 100 )
        {
            int x = (int)(Math.random() * 10);
            System.out.println(x);
            flipCount++;
        }
    }
}