/**
 * Purpose: Display a "Hello, World!" message to the screen.
 *
 * @version or date
 * @ Manit Mishra
 */
public class FRQ1 {

    public static int arrayCalculator(){
        int [] numbers = new int[5];
        numbers[0] = 2;
        numbers[1] = 4;
        numbers[2] = 6;
        numbers[3] = 8;
        numbers[4] = 10;

        int product = 1;
        for (int x=0; x<5; x++){
            product = product * numbers[x];
        }

        return product;
        }


    public static void main(String[] args) {
        System.out.println(arrayCalculator());
    }
}