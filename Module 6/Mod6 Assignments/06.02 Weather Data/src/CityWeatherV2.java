/**
 * Annual Weather object class
 * 
 * @author Manit Mishra
 * @version 12/30/21
 */

public class CityWeatherV2 {
    // private instance variables - three arrays
    String [] GivenMonths = new String[12];
    double [] temps = new double[12];
    double[] precipitation = new double[12];

    // constructor with parameters
    public CityWeatherV2(String []months, double []temperatures, double []pcpt){
        GivenMonths = months;
        temps = temperatures;
        precipitation = pcpt;
    }

    // setters and getters for each private instance variable
    public void setMonths(String []months){
        GivenMonths = months;
    }
    public String[] getMonths(){
        return GivenMonths;
    }

    public void setTemps(double []Temperature){
        temps = Temperature;
    }
    public double[] getTemps(){
        return temps;
    }

    public void setPrecipitation(double []Precipitation){
        precipitation = Precipitation;
    }
    public double[] getPrecipitation(){
        return precipitation;
    }


    // method to calculate the average of temperature
    public double calcAverageTemp(double []Temperature){
        double total = 0.0;
        double average = 0.0;

        for (int i = 0; i < Temperature.length; i++){
            total = total + Temperature[i];
        }
        average = total/Temperature.length;

        return average;
    }

    // method to calculate total precipitation array
    public double calcTotalPrecipitation(double []precipitation){
        double total = 0.0;

        for (int i = 0; i < precipitation.length; i++)
            total = total + precipitation[i];

        return total;
    }

    // method to calculate temperature in Celsius (current index of temperature array passed as a parameter) - to be completed in 6.02
    public double[] tempInCelcius(double []tempInFarenheit){
        double [] newArray = new double[tempInFarenheit.length];
        for (int i = 0; i < tempInFarenheit.length; i++) {
            newArray[i] = (tempInFarenheit[i] - 32) * (5.0/9);
        }
        return newArray;
    }
    
    // method to calculate precipitation in centimeters (current index of precipitation array passed as a parameter) - to be completed in 6.02
    public double[] precipitationInCentimeters(double[] precipitationInInches){
        double [] newArray = new double[precipitationInInches.length];
        for (int i = 0; i < precipitationInInches.length; i++) {
            newArray[i] = precipitationInInches[i] * (2.54);
        }
        return newArray;
    }

}
