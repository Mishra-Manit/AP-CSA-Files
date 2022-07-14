import java.util.ArrayList;

/**
 * Purpose: find the prime numbers in a given range of numbers.
 *
 * @version 3/27/2022
 * @ Manit Mishra
 */
public class PrimeNumbers {
    private static int lowerLimit;
    private static int upperLimit;
    public static int counter;

    public PrimeNumbers(int lowerLimit, int upperLimit){
        this.lowerLimit = lowerLimit;
        this.upperLimit = upperLimit;
    }

    public void setLowerLimit(int lowerLimit){this.lowerLimit = lowerLimit;}
    public int getLowerLimit(){return lowerLimit;}

    public void setUpperLimit(int lowerLimit){this.upperLimit = upperLimit;}
    public int getUpperLimit(){return upperLimit;}

    public static ArrayList<Integer> calcAllPrimeNumbers(){
        ArrayList<Integer> primeNumbers = new ArrayList<Integer>();

        //Starts off at the lowest prime number
        if (lowerLimit == 0){
            lowerLimit = 2;
        }

        //Checks through all of the prime numbers in the given range
        for (int x = lowerLimit; x <= upperLimit; x++){
            if (isPrimeNumber(x)){
                primeNumbers.add(x);
                counter++;
            }
        }
        return primeNumbers;
    }

    //This method checks and makes sure each number passed is a prime number
    public static boolean isPrimeNumber(int number){
        for (int i = 2; i < number; i++){
            if (number % i == 0){
                return false;
            }
        }
        return true;
    }
}