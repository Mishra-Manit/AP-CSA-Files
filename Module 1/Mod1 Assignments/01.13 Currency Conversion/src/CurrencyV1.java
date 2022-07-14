/**
 * The Currency class converts an amount of money from a specific
 * country into the equivalent currency of another country given 
 * the current exchange rate.
 *
 * @author Manit Mishra
 * @version 10/9/21
 */
public class CurrencyV1
{
    public static void main(String [ ] args)
    {
        //Declare and initialize local variables
        double totalUsDollars = 6500.00;		// starting US Dollars

        double poundsSpent = 3000.0;            // British Pounds spent
        double poundsExchangeRate = 1.42;     // 1 British Pound = 1.42 Dollars
		double eurosSpent = 1000;				// European Euros spent
		double euroExchangeRate = 1.22;			// 1 Euro = 1.22 Dollars
		double yenSpent = 6000;					//Japanese Yen Spent
		double yenExchangeRate = 0.0095;		//1 Yen = 0.0095 Dollars

        //remaining variables below here

		double usDollarsEquivalentPounds = poundsExchangeRate * poundsSpent;
		double usDollarsEquivalentEuros = euroExchangeRate * eurosSpent;
		double usDollarsEquivalentYen = yenExchangeRate * yenSpent;

        // Message to user stating purpose
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("This program converts an amount of money");
        System.out.println("from a specific country into the equivalent");
        System.out.println("currency of another country given the current");
        System.out.println("exchange rate.");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println();

		System.out.println("Starting US Dollars: " + totalUsDollars);

		System.out.println();



		//Main Code

		totalUsDollars -= usDollarsEquivalentPounds;

		System.out.println("Britain: ");
		System.out.println("\t Pounds Spent: " + poundsSpent);
		System.out.println("\t US dollars equivalent: " + usDollarsEquivalentPounds);
		System.out.println("\t US dollars remaining: " + totalUsDollars);
		System.out.println();

		totalUsDollars -= usDollarsEquivalentEuros;

		System.out.println("Italy: ");
		System.out.println("\t Euros Spent: " + eurosSpent);
		System.out.println("\t US Dollars equivalent: "+ usDollarsEquivalentEuros);
		System.out.println("\t US dollars remaining: " + totalUsDollars);
		System.out.println("");

		totalUsDollars -= usDollarsEquivalentYen;

		System.out.println("Japan: ");
		System.out.println("\t Yen Spent: " + yenSpent);
		System.out.println("\t US Dollars equivalent: "+ usDollarsEquivalentYen);
		System.out.println("\t US dollars remaining: " + totalUsDollars);
		System.out.println();



        // Complete the code below for Souvenir Purchases
 		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("Souvenir Purchases");
		System.out.println(" (all values in US Dollars) ");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

		//Calculations for Souvenir #1
		int costItem1 = 12;  								//cost per item of first souvenir
		int budget1 = 100;   								//budget for first item
		int totalItems1 = (int)(budget1 / costItem1); 		//how many items can be purchased
		int fundsRemaining1 = budget1 % costItem1;  		//how much of the budget is left

		System.out.println("Item 1");
		System.out.println("   Cost per item: $" + costItem1 );
		System.out.println("   Budget: $"+ budget1);
		System.out.println("   Total items purchased: " +  totalItems1);
		System.out.println("   Funds remaining: $"  +  fundsRemaining1);
     	System.out.println();

		//Calculations for Souvenir #2
		double costItem2 = 29.99;  						//cost per item of second souvenir
		int budget2 = 500;   							//budget for second item
		int totalItems2 = (int)(budget2 / costItem2);							//how many items can be purchased
		double fundsRemaining2 = budget2 % costItem2;  	//how much of the budget is left

		System.out.println("Item 2");
		System.out.println("   Cost per item: $" + costItem2 );
		System.out.println("   Budget: $"+ budget2);
		System.out.println("   Total items purchased: " +  totalItems2);
		System.out.println("   Funds remaining: $"  +  fundsRemaining2);

    } // end of main method
} // end of class

