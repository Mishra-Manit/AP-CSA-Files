/**
 * Purpose: Class for creating wetlands.
 *
 * @version 3/22/2022
 * @ Manit Mishra
 */
public class Wetland extends Terrain{
    private double rainInInches;

    public Wetland(int l, int w, double amountOfRain){
        super(l, w);
        rainInInches = amountOfRain;
    }

    public double getAmountOfRain(){return rainInInches;}
}