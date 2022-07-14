
/**
 * The purpose of this program is to generate a table of random
 * integers using the Random class nextInt() method.
 *
 * @author Charles Babbage
 * @version 06/05/17
 */
import java.util.Random;
public class RandomNumbers
{
    public static void main(String[] args)
    {
        int randNum = 0;
        Random randNumList = new Random();

        System.out.println("        Table of Random Numbers  ");
        for(int row = 0; row < 5; row++)
        {
            for(int col = 0; col < 10; col++)
            {
                randNum = randNumList.nextInt(100);   //random numbers from 0 to 99
                System.out.print(randNum + "\t ");
            }//end column loop
            System.out.println();
        }//end row loop
    }//end main
}//end class