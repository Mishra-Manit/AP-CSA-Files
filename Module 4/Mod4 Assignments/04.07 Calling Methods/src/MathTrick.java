/**
 * Purpose: Create a math trick with the input given by the user.
 *
 * @ 11/21/2021
 * @ Manit Mishra
 */

public class MathTrick {


    // Step 1) Creates a random 3 digit (100-999) number where the first and last digit differ by more than one
    // Hint: Use Math.random() to create number in the correct range
    // 		 use modulus to find the last digit and divide by 100 for the first digit.
    //		 calculate the difference, which method can you use so it doesn't matter how the numbers are subtract?
    // 		 while the difference of the digits is less than 2, create a new random number and try again

    public static int getRandomNum() {
        int num = 0;
        int firstDigit = 0;
        int lastDigit = 0;

        num = (int) ((Math.random() * 899) + 100);
        lastDigit = (int) (num % 10);
        firstDigit = (int) num / 100;

        int differenceOf = lastDigit - firstDigit;

        while (differenceOf < 2) {
            num = (int) ((Math.random() * 899) + 100);
            lastDigit = (int) (num % 10);
            firstDigit = (int) num / 100;
            differenceOf = lastDigit - firstDigit;
            //System.out.println("difference of: " + differenceOf);
        }

        return num;
    }

    // Step 2 & 4) reverse the digits of a number
    // Hint: to reverse a number without converting it to a String:
    //		create a new variable to store the reversed number
    //		while the original number > 0
    //		for each digit, multiply the new variable by 10 (to make room for the new digit)
    //		then add the last digit (remember modulus?) to the new variable
    //		divide the original number by 10 to get rid of the last digit
    //	Ex: 584--> (0 x 10) + 4 = 4 ; 58--> (4 x 10) + 8 = 48; 5-->(48 x 10) + 5 = 485

    public static int reverseDigits(int num) {
        int reversedNumber = 0;
        int digit = 0;

        while (num != 0) {
            digit = num % 10;
            reversedNumber = (reversedNumber * 10) + digit;
            num = num / 10;
            //System.out.println("Reverse Num " + num);

        }
        return reversedNumber;
    }


    // Step 7) replace characters in a String according to the chart
    // Hint: Loop through the String and "replace" the numbers with the corresponding letter
    public static String replaceLtr(String str)
    {
        String replacedString = str;

        for (int i = 0; i < str.length(); i++) {
            String stringSub = str.substring(i, i + 1);

            if (stringSub.equalsIgnoreCase("0") ){
                replacedString = replacedString.replaceAll("0", "Y");
            }
            else if (stringSub.equalsIgnoreCase("1") ){
                replacedString = replacedString.replaceAll("1", "M");
            }
            else if (stringSub.equalsIgnoreCase("2") ){
                replacedString = replacedString.replaceAll("2", "P");
            }
            else if (stringSub.equalsIgnoreCase("3") ){
                replacedString = replacedString.replaceAll("3", "L");
            }
            else if (stringSub.equalsIgnoreCase("4") ){
                replacedString = replacedString.replaceAll("4", "R");
            }
            else if (stringSub.equalsIgnoreCase("5") ){
                replacedString = replacedString.replaceAll("5", "O");
            }
            else if (stringSub.equalsIgnoreCase("6") ){
                replacedString = replacedString.replaceAll("6", "F");
            }
            else if (stringSub.equalsIgnoreCase("7") ){
                replacedString = replacedString.replaceAll("7", "A");
            }
            else if (stringSub.equalsIgnoreCase("8") ){
                replacedString = replacedString.replaceAll("8", "I");
            }
            else if (stringSub.equalsIgnoreCase("9") ){
                replacedString = replacedString.replaceAll("9", "B");
            }

        }
        return replacedString;

    }

    // Step 8) reverse the letters in a String
    // Hint: start with an empty String variable
    //		 loop through the original word
    //		 add one letter at time to the new variable using concatenation and .substring()
    public static String reverseString(String str) {
        String reversedString = "";
        for (int i = str.length(); i >=1 ; i--) {
            String stringSub = str.substring(i - 1, i);
            reversedString = reversedString + stringSub;
        }
        return reversedString;
    }

    public static void main(String[] args)
    {
//		1.	Generate a random 3-digit number so that the first and third digits differ by more than one.
        int randNumber = getRandomNum();
        System.out.println("The starting Number: " + randNumber);
//		2.	Now reverse the digits to form a second number.
        int reverseRandNumber = reverseDigits(randNumber);
        System.out.println("The starting Number: " + reverseRandNumber);
//		3.	Subtract the smaller number from the larger one.
        int difference = 0;
        if (reverseRandNumber > randNumber) {
            difference = reverseRandNumber - randNumber;
            System.out.println("The difference is: " + difference);
        }
        else{
            difference = randNumber - reverseRandNumber;
            System.out.println("The difference is: " + difference);
        }
//		4.	Now reverse the digits in the answer you got in step 3 and add it to that number.
        int reverseNumber = reverseDigits(difference);
        int addedNumbers = reverseNumber + difference;
        System.out.println("The reversed number added to difference: " + addedNumbers);
//		5.	Multiply by one million.
        int multipliedMillion = addedNumbers * 1000000;
        System.out.println("Number x one million: " + multipliedMillion);
//		6.	Subtract 733,361,573.
        int addedALot = multipliedMillion - 733361573;
        System.out.println("Number subtracted: " + addedALot);
//		7.	Convert the number to a string in order to replace the numbers with letters.
// 				Ex: String str = String.valueOf(myNumber);
//			Then, replace each of the digits in your answer, with the letter it corresponds to using the table in the instructions.
        String subtractedNumberToString = String.valueOf(addedALot);
        String replacedString = replaceLtr(subtractedNumberToString);
        System.out.println("Replaced String: " + replacedString);
//		8.	Now reverse the letters in the string to read your message backward.
        String reversedString = reverseString(replacedString);
        System.out.println("Reversed String: " + reversedString);

    } // end main
} // end class

