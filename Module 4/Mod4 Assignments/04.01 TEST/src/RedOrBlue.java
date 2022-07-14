public class RedOrBlue
{
    public static void main(String[] args)
    {
        // Declare and initialize variables
        int blue = 0;
        int red = 0;
        int flipCount = 0;
        double randNum = 0.0;

        // Input number of coins flipped
        System.out.println("How many times will the coin be flipped? ");

        // Simulate flipping coins.
        while(flipCount < 10)
        {
            //Random value between 0.0 (inclusive) and 1.0 (exclusive)
            randNum = Math.random();

            if(randNum < 0.8)
            {
                blue++;
                System.out.println("\t red");
            }
            else
            {
                red++;
                System.out.println("\t blue");
            }
            flipCount++;

        }//end while

        //Output number of heads and number of tails
        System.out.println();
        System.out.println("Number of blue = " + blue);
        System.out.println("Number of red = " + red);
    }
}