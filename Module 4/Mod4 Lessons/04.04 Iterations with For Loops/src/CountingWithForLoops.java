
/**
 * The purpose of this program is to illustrate the use of
 * the for loop as a counter.
 *
 * @author Charles Babbage
 * @version 06/05/17
 */
public class CountingWithForLoops
{
    public static void main(String [] args)
    {
        int theTerminator = 10;   //initialize the terminating value

        for(int counter = 0; counter < theTerminator; counter++)     //test the terminating condition
        {
            System.out.println("counter = " + counter);

        }//end of for loop
    }//end of main method
}//end of class
