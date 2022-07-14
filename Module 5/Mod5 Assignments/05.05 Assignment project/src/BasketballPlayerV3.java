/**
 * Purpose: Write a program to calculate the averages of dribbles per minute between 2 players.
 *
 * @11/28/2021
 * @ Manit Mishra
 */
public class BasketballPlayerV3 {
    public BasketballPlayerV3() {
    }

    public double calcAverage(int dbpm1, int dbpm2){
        double averageDribblesPerMinute = 0;
        averageDribblesPerMinute = (dbpm1 + dbpm2) / 2.0;
        return averageDribblesPerMinute;
    }

    public double calcDifference(int dbpm1, int dbmp2){
        double differenceDribbles = Math.abs(dbpm1 - dbmp2);
        return differenceDribbles;
    }
}

