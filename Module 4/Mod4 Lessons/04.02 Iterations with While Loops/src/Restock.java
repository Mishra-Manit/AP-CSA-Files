
/**
 * This program simulates the fish population within a pond and predicts
 * when to restock based on the growth delay formula. The while loop
 * terminates when the population goes below a desired value.
 *
 * @author Charles Babbage
 * @version 06/05/17
 */
public class Restock
{
    public static void main(String[] args)
    {
		int year = 2010;             //initial year
		int fishPop = 12500;         //max fish population
		double decreaseRate = .224;  //annual rate of decrease

		while(fishPop >= 1500)
		{
			fishPop -= (int)(fishPop * decreaseRate);
			year++;
		}
		System.out.print("In " + year
							+ " the fish population will decrease to "
							+ fishPop );
       }//end of main method
}//end of class
