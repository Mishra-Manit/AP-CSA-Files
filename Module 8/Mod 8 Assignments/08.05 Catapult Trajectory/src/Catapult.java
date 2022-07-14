/**
 * Purpose: Implementation class for the fruit apple.
 *
 * @version 3/19/2022
 * @ Manit Mishra
 */
public class Catapult {
    public Catapult(){

    }

    public double calcDistance(int speed, int angle){
        double distance;

        distance = (speed*speed) * Math.sin(2 * Math.toRadians(angle))/9.8;
        double distanceInFeet = (distance * 3.28084);

        return distanceInFeet;
    }
}