/**
 * Starter code for the Hurricane Tester
 * APCS Team 2020
 * Manit Mishra; 3/6/2022
 */

import java.io.IOException;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
public class HurricaneTester {
    public static void main(String[] args) throws IOException {
        //read data from text file & put in an array
        File fileName = new File("HurricaneData.txt");
        Scanner inFile = new Scanner(fileName);
        int numValues = 0;

        //count number of lines in text file
        while (inFile.hasNextLine()) {
            inFile.nextLine();
            numValues++;
        }
        inFile.close();


        //initialize arrays based on lines counted in text file
        int[] years = new int[numValues];
        String[] months = new String[numValues];
        int[] pressures = new int[numValues];
        double[] windSpeeds = new double[numValues];
        String[] names = new String[numValues];
        int[] categories = new int[numValues];

        //read and assign data from text file to the arrays
        inFile = new Scanner(fileName);
        int index = 0;
        while (inFile.hasNext()) {
            years[index] = inFile.nextInt();
            months[index] = inFile.next();
            pressures[index] = inFile.nextInt();
            windSpeeds[index] = inFile.nextDouble();
            names[index] = inFile.next();
            categories[index] =
            index++;
        }
        inFile.close();

        //convert the windspeed

        for (int i = 0; i < windSpeeds.length; i++) {
            windSpeeds[i] = (int)(10*(windSpeeds[i] * 1.15))/10.0;
        }

        //calculate categories from windspeed arraylist

        for (int i = 0; i < numValues; i++) {
            if (windSpeeds[i] > 74 && windSpeeds[i] < 95) {
                categories[i] = 1;
            } else if (windSpeeds[i] > 96 && windSpeeds[i] < 110) {
                categories[i] = 2;
            } else if (windSpeeds[i] > 111 && windSpeeds[i] < 129) {
                categories[i] = 3;
            } else if (windSpeeds[i] > 130 && windSpeeds[i] < 156) {
                categories[i] = 4;
            } else if (windSpeeds[i] > 157) {
                categories[i] = 5;
            }
        }

        //create a Hurricane ArrayList using the data above
        ArrayList<Hurricane> myRangeHurricaneList = new ArrayList<Hurricane>();

        //user prompted for range of years
        Scanner in = new Scanner(System.in);

        boolean exists1 = false;
        boolean exists2 = false;

        int rangeFirstNumber = 0;
        int rangeSecondNumber = 0;

        while (exists1 == false || exists2 == false) {

            System.out.println("Enter the FIRST year for the range of years you want the data for: ");
             rangeFirstNumber = in.nextInt();

            System.out.println("Enter the SECOND year for the range of years you want the data for: ");
             rangeSecondNumber = in.nextInt();

            for (int element : years) {
                if (element == rangeFirstNumber) {
                    exists1 = true;
                }
                if (element == rangeSecondNumber) {
                    exists2 = true;
                }

            }
            if (exists1 == false || exists2 == false) {
                System.out.println("That set of years is not available in our collection of data, please try another set. \n");
            }
        }

        //Creating a new ArrayList with the selected range
        ArrayList <Integer> myYearRange = new ArrayList<Integer>();
        ArrayList <Double> myWindSpeed = new ArrayList<Double>();
        ArrayList <Integer> myPressure = new ArrayList<Integer>();
        ArrayList <String> myMonths = new ArrayList<String>();
        ArrayList <String> myNames = new ArrayList<String>();
        ArrayList <Integer> myCategories = new ArrayList<Integer>();

        for (int i = 0; i < numValues; i++){
            if (years[i] >= rangeFirstNumber && years[i] <= rangeSecondNumber){
                myYearRange.add(years[i]);
                myWindSpeed.add(windSpeeds[i]);
                myPressure.add(pressures[i]);
                myMonths.add(months[i]);
                myNames.add(names[i]);
                myCategories.add(categories[i]);

                myRangeHurricaneList.add(new Hurricane(years[i], names[i], months[i], categories[i], pressures[i], windSpeeds[i]));
            }
        }


        //MIN AND MAX CALCULATIONS ARE IN A SEPARATE METHOD AT THE BOTTOM
        //CALC CATEGORIES FOR THE NEW WINDSPEEDS ARRAY IS ALSO AT THE BOTTOM

        //print the data
        System.out.printf("\n \t\t\t\t\t\t Hurricanes %1s - %1s \n\n", rangeFirstNumber, rangeSecondNumber);
        System.out.println("Year       Hurricane        Category       Pressure (mb)       Wind Speed (mph) ");
        System.out.println("===============================================================================");

        for (int i = 0; i < myRangeHurricaneList.size(); i++){
            Hurricane myTemp = myRangeHurricaneList.get(i);
            System.out.println(myTemp.toString());
        }

        System.out.printf("\n\t\tAverage:   %16.2f %17.2f %20.2f", calcAverage(myCategories), calcAverage(myPressure), calcAverageDouble(myWindSpeed) );
        System.out.printf("\n\t\tMinimum:   %13s %17s %23.2f", calcMinAndMax(myCategories)[0], calcMinAndMax(myPressure)[0],
                                                         calcMinAndMaxDouble(myWindSpeed)[0] );
        System.out.printf("\n\t\tMaximum:   %13s %17s %23.2f", calcMinAndMax(myCategories)[1], calcMinAndMax(myPressure)[1],
                                                         calcMinAndMaxDouble(myWindSpeed)[1] );


        System.out.printf("\n\nSummary of Categories: " );
        System.out.printf("\n\tCat1: %1s", calcSummaryOfCategories(myCategories)[0]);
        System.out.printf("\n\tCat2: %1s", calcSummaryOfCategories(myCategories)[1]);
        System.out.printf("\n\tCat3: %1s", calcSummaryOfCategories(myCategories)[2]);
        System.out.printf("\n\tCat4: %1s", calcSummaryOfCategories(myCategories)[3]);
        System.out.printf("\n\tCat5: %1s", calcSummaryOfCategories(myCategories)[4]);
    }

    //calculating average from given integer arrayList
    public static Double calcAverage(ArrayList<Integer> mytestlist){
        double total = 0;
        int numberOfValues = mytestlist.size();
        for (int element : mytestlist){
            total = total + element;
        }
        double average = (double)total/numberOfValues;
        return average;
    }

    //Calculating average from given double ArrayList
    public static Double calcAverageDouble(ArrayList<Double> mytestlist){
        double total = 0;
        int numberOfValues = mytestlist.size();
        for (double element : mytestlist){
            total = total + element;
        }
        double average = (double)total/numberOfValues;
        return average;
    }

    //calculating the minimum and maximum of the dataset for integer arrayList
    public static int[] calcMinAndMax(ArrayList <Integer> myList){
        int minOfList = Integer.MAX_VALUE;
        int maxOfList = Integer.MIN_VALUE;

        for(int i = 0; i < myList.size(); i ++)
        {
            if(myList.get(i) < minOfList)
                minOfList = myList.get(i);

            else if(myList.get(i) > maxOfList)
                maxOfList = myList.get(i);
        }
        int [] values = {minOfList, maxOfList};
        return values;
    }

    //calculating the minimum and maximum of the dataset for double arrayList
    public static double[] calcMinAndMaxDouble(ArrayList <Double> myList){
        double minOfList = Integer.MAX_VALUE;
        double maxOfList = Integer.MIN_VALUE;

        for(int i = 0; i < myList.size(); i ++)
        {
            if(myList.get(i) < minOfList)
                minOfList = myList.get(i);

            else if(myList.get(i) > maxOfList)
                maxOfList = myList.get(i);
        }
        double [] values = {minOfList, maxOfList};
        return values;
    }

    //Summary of categories with the selected range of categories
    public static int[] calcSummaryOfCategories(ArrayList <Integer> myCategories){
        int [] categories = new int[myCategories.size()];

        int cat1 = 0;
        int cat2 = 0;
        int cat3 = 0;
        int cat4 = 0;
        int cat5 = 0;

        for (int element: myCategories) {
            if (element == 1){cat1++;}
            else if (element == 2){cat2++;}
            else if (element == 3){cat3++;}
            else if (element == 4){cat4++;}
            else if (element == 5){cat5++;}
        }

        categories[0] = cat1;
        categories[1] = cat2;
        categories[2] = cat3;
        categories[3] = cat4;
        categories[4] = cat5;

        return categories;
    }
}