/**
 * Purpose: Display a "Hello, World!" message to the screen.
 *
 * @version or date
 * @ Manit Mishra
 */
public class Testing {
    public static void main(String[] args) {
        int num = 0;
        int firstDigit = 0;
        int lastDigit = 0;

        num = (int) ((Math.random() * 899) + 100);
        lastDigit = (int) (num % 10);
        firstDigit = (int)num / 100;

        int differenceOf = lastDigit - firstDigit;

        while (differenceOf < 2) {
            num = (int) ((Math.random() * 899) + 100);
            lastDigit = (int) (num % 10);
            firstDigit = (int) num / 100;
        }
        System.out.println(num);

    }
}