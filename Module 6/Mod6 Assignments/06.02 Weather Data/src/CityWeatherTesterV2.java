/**
 * Annual Weather client class
 * 
 * @author Manit Mishra
 * @version 12/30/21
 */
import java.util.Scanner;
public class CityWeatherTesterV2
{
    // method to print results (formatting output will be done in 6.02)
    public static void results(String city, String state, String tempLabel, String precipLabel, double[] temperature,
                               String[] month, double[] precipitation, double averageTemp, double annualPrecipitation){
        //Output: display table of weather data including average and total
        System.out.println();
        System.out.println("           Weather Data");
        System.out.println("      Location: " + city +", " + state);
        System.out.println("Month     Temperature (" +  tempLabel + ")     Precipitation (" + precipLabel + ")");
        System.out.println();
        System.out.println("***************************************************");
        for( int index = 0; index < temperature.length; index++)
        {
            System.out.printf("%2s", month[index]);
            System.out.printf("%14.1f", temperature[index]);
            System.out.printf("%19.1f%n", precipitation[index]);
        }

        System.out.println("***************************************************");
        System.out.printf("Average:     " + "%1.1f" + "        Total: " + "%2.1f", averageTemp, annualPrecipitation);
    }

    public static void main (String [ ] args)
    {

        //Declare and initialize variables
        Scanner in = new Scanner(System.in);  //will be used in 6.02
        String city = "Apalachicola";  //choose a city from the table provided
        String state = "Florida";  //choose a city from the table provided
  
        String [] month = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};     //complete initialization of months array
        double [] temperature = {52.7, 55.3, 60.7, 66.8, 74.1, 80.0, 81.9, 81.7, 79.1, 70.2, 62.0, 55.2};     //complete initialization of temperatures array
        double [] precipitation ={4.9, 3.8, 5.0, 3.0, 2.6, 4.3, 7.3, 7.3, 7.1, 4.2, 3.6, 3.5};     //complete initialization of precipitation array
    
        String tempLabel = "F";    //initialize to F
        String precipLabel; //initialize to in

        //input to decide F/C and in/cm - to be completed in 6.02
        System.out.println("Do you want the temperatures displayed in Farenheit or Celcius (F for Farenheight and C for Celcius)");
        String response = in.next();

	    //instantiate AnnualWeatherV1 object
        CityWeatherV2 myWeather = new CityWeatherV2(month, temperature, precipitation);

        //conditions & method call to convert temp, if needed - to be completed in 6.02
        if (response.equalsIgnoreCase("F")){
            tempLabel = "F";
        }
        else if(response.equalsIgnoreCase("C")){
            tempLabel = "C";
            temperature = myWeather.tempInCelcius(temperature);
        }
        //conditions & method call to convert prec, if needed - to be completed in 6.02
        System.out.println("Do you want the precipitation displayed in Inches or Centimeters (I for Inches and C for Centimeters)");
        String response2 = in.next();

        if (response2.equalsIgnoreCase("I")){
            precipLabel = "in";
        }
        else {
            precipLabel = "cm";
            precipitation = myWeather.precipitationInCentimeters(precipitation);
        }

        //method call to calculate the average temperature
        double averageTemperature = myWeather.calcAverageTemp(temperature);

        //method call to calculate the total precipitation
        double totalPrecipitation = myWeather.calcTotalPrecipitation(precipitation);

        //method call to print results (hint: Need parameters for month, temperature, precipitation arrays, data labels and the average temperature, total precipitation variables)

        results(city, state, tempLabel, precipLabel, temperature, month, precipitation, averageTemperature, totalPrecipitation);
    
    
    


    }//end main
}//end class

