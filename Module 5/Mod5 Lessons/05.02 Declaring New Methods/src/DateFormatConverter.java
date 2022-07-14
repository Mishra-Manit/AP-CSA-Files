import java.util.Scanner;

public class DateFormatConverter

{

    //  convert the ISO date format YYYY-MM-DD to US date format MM/DD/YYYY

    public static String convertToUS(String date)

    {

        int pos1 = date.indexOf("-");

        String year = date.substring(0, pos1);

        String temp = date.substring(pos1 + 1);

        int pos2 = temp.indexOf("-");

        String month = temp.substring(0, pos2);

        String day = temp.substring(pos2 + 1);

        return month + "/" + day + "/" + year;

    }
    //  convert the ISO date format YYYY-MM-DD to European date format DD/MM/YYYY

    public static String convertToEuropean(String date)

    {
        int pos1 = date.indexOf("-");

        String year = date.substring(0, pos1);

        String temp = date.substring(pos1 + 1);

        int pos2 = temp.indexOf("-");

        String month = temp.substring(0, pos2);

        String day = temp.substring(pos2 + 1);

        return day + "/" + month + "/" + year;

    }
    // the main method

    public static void main(String[] args)

    {

        // read in the ISO date

        Scanner in = new Scanner(System.in);

        System.out.println("Enter the ISO formatted date YYYY-MM-DD");

        String isoDate = in .nextLine();

        String usDate = convertToUS(isoDate);

        String euroDate = convertToEuropean(isoDate);

        // print the results

        System.out.println("ISO Date: " + isoDate);

        System.out.println("US Date: " + usDate);

        System.out.println("European Date: " + euroDate);

    } // end main

} // end class