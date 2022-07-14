/**
 * Purpose: Print out a receipt of a movie ticket purchase.
 *
 * 10/30/2021
 * @ Manit Mishra
 */
import java.util.Scanner;

public class BuyMovieTickets {
    public static void main(String[] args) {

        //Defining Inputs
        Scanner obj1 = new Scanner(System.in);
        System.out.println("Enter First and Last name: ");
        String fullName = obj1.nextLine();

        Scanner obj2 = new Scanner(System.in);
        System.out.println("Enter today's date (mm/dd/yyyy): ");
        String todayDate = obj2.nextLine();

        Scanner obj3 = new Scanner(System.in);
        System.out.println("Enter name of movie: ");
        String movieName = obj3.nextLine();

        Scanner obj4 = new Scanner(System.in);
        System.out.println("Enter number of tickets: ");
        String numberOfTickets = obj4.nextLine();

        Scanner obj5 = new Scanner(System.in);
        System.out.println("Enter price of each ticket in this format -> ($___): ");
        String priceOfTickets = obj5.nextLine();

        Scanner obj6 = new Scanner(System.in);
        System.out.println("Enter your 12 digit card number (format: #####-###-####): ");
        String debitCardNumber = obj6.nextLine();

        Scanner obj7 = new Scanner(System.in);
        System.out.println("Enter your PIN: ");
        String debitCardPin = obj7.nextLine();
        //Other statements

        todayDate = todayDate.replace("/", "-");
        String orderNumber = fullName.substring(1,3);
        String someCardDigits = debitCardNumber.substring(0,3);

        //First Initial + Last Name
        String firstInitial = fullName.substring(0,1);
        int indexOfSpace = fullName.indexOf(" ");
        String lastName = fullName.substring(indexOfSpace + 1);

        String price = priceOfTickets.substring(1);
        double priceDouble = Double.parseDouble(price);
        int ticketsInt = Integer.parseInt(numberOfTickets);
        double totalCost = priceDouble * ticketsInt;

        int indexOfDash = debitCardNumber.indexOf("-");
        int indexOfSecondDash = debitCardNumber.indexOf("-",indexOfDash + 1);
        String conNumber = debitCardNumber.replaceFirst(debitCardNumber.substring(0, indexOfDash), "#####");
        String conNumber2 = conNumber.replaceFirst(conNumber.substring(indexOfDash + 1, indexOfSecondDash), "###");

        //Print Statements

        System.out.println("\n***************************************************************************************");
        System.out.println("Your Receipt: ");

        System.out.println("\n" + todayDate);
        System.out.println("Order Number: " + orderNumber + someCardDigits);

        System.out.println("\n" + firstInitial + ". " + lastName);

        System.out.println("Account: " + conNumber2);

        System.out.println("Movie: " + movieName);

        System.out.println("Number of Tickets: " + numberOfTickets);

        System.out.println("Ticket Price: " + price);

        System.out.println("\n" + "You will be charged $" + totalCost);

        System.out.println("\nThank you. Enjoy the rest of your day.");

        System.out.println("\n***************************************************************************************");

    }
}