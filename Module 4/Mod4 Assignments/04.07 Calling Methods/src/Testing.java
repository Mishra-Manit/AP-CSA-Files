/**
 * Purpose: Display a "Hello, World!" message to the screen.
 *
 * @version or date
 * @ Manit Mishra
 */
import java.util.Scanner;
public class Testing {


    public static int addTotal(int itemCost) {

        int total = 0;
        total += itemCost;
        return total;

    }


    public static void main(String[] args) {

        /*for (int m = 0; m < 4; m+=1)
        {
            int n = 0;
            while(n < 4)
            {
                if (n%2==1)
                    n+=2;
                n++;
                System.out.println(n + " ");
            }
        } */
        int addTotalz = addTotal(5);
        int addTotals = addTotal(-3);
        System.out.println(addTotals);
    }
}