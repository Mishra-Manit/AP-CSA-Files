/**
 * Purpose: Class for creating winter mountains.
 *
 * @version 3/22/2022
 * @ Manit Mishra
 */
public class WinterMountain extends Mountain{
    private double temperature;

    public WinterMountain(int l, int w, int numberOfMountains, double temp){
        super(l, w, numberOfMountains);
        temperature = temp;
    }

    public double getTemperature(){return temperature;}
}