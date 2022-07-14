/**
 * Purpose: Display a "Hello, World!" message to the screen.
 *
 * @11/22/2021
 * @ Manit Mishra
 */
public class FreeResponseQuestion {

    public static int numberOfWords(String word)
    {
        int counter = 1;
        if(word.isEmpty()){
            return 0;
        }
        for (int x = 0; x < word.length(); x++){
            String substring = word.substring(x, x + 1);
            if (substring.equals(" ")) {
                if ((x != 0) && (x != (word.length() - 1))) {
                    counter ++;
                }
            }
        }
        return counter;
    }


    public static void main(String[] args) {
        int numberOfWords = numberOfWords("Sorry for the formatting error");
        System.out.println(numberOfWords);

    }
}