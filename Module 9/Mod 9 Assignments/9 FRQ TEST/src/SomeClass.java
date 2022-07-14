/**
 * Purpose: Display a "Hello, World!" message to the screen.
 *
 * @version or date
 * @ Manit Mishra
 */
public class HoursCalculator {
    public static final int MINUTESINANHOUR = 60;

    public HoursCalculator(){}

    public double convertToHours(double minutesGiven){
        double hoursCalculated = minutesGiven/MINUTESINANHOUR;
        return hoursCalculated;
    }
}