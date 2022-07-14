/**
 * Purpose: Display a "Hello, World!" message to the screen.
 *
 * @version or date
 * @ Manit Mishra
 */
public class LRQ {

    public static String lastCharacters (String word) {
        int lengthOfString = word.length();
        String newString = word.substring(lengthOfString - 2, lengthOfString);
        return "The last two characters in the word " + word + " are " + newString;
    }

    public static void main(String[] args) {
        String lastCharacters = lastCharacters("ManojMishra");
        System.out.println(lastCharacters);
    }
}