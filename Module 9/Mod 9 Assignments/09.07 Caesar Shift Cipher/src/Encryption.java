/**
 * Purpose: Class to encrypt the message given.
 *
 * @version 3/28/2022
 * @ Manit Mishra
 */

public class Encryption {
    private static int shiftValue;
    private static final String [] ALPHABET = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s",
                                    "t", "u", "v", "w", "x", "y", "z"};

    public Encryption(int shift){
        shiftValue = shift;
    }

    public void setShiftValue(int shift){
        shiftValue = shift;
    }

    public static String[] newAlphabet(){
        String [] sortedAlphabet = new String[ALPHABET.length];

        for (int i = 0; i < ALPHABET.length; i++){
            if ((i + shiftValue >= 0) && (i + shiftValue < 26)){
                int indexOfAlphabet = i + shiftValue;
                sortedAlphabet[indexOfAlphabet] = ALPHABET[i];
            }
            else if(i + shiftValue >= 26){
                int indexOfLetter = i + shiftValue - 26;
                sortedAlphabet[indexOfLetter] = ALPHABET[i];
            }
        }

        return sortedAlphabet;
    }

    public static String encryptMessage(String originalMessage, String[] sortedAlphabet){
        String encryptedMessage = "";

        for (int i = 0; i < originalMessage.length(); i++){
            int indexOfLetter = findIndex(originalMessage.substring(i, i+1));

            if (originalMessage.substring(i, i+1).equalsIgnoreCase(" ")){
                encryptedMessage = encryptedMessage + " ";
            }
            else {
                char k = originalMessage.charAt(i);
                int ascii = (int)k;

                if (ascii >= 65 && ascii <= 90){
                    encryptedMessage = encryptedMessage + sortedAlphabet[indexOfLetter].toUpperCase();
                }
                else{
                    encryptedMessage = encryptedMessage + sortedAlphabet[indexOfLetter];
                }
                }
            }


        return encryptedMessage;
    }

    public static int findIndex(String input){
        for (int i = 0; i < ALPHABET.length; i++){
            if (ALPHABET[i].equalsIgnoreCase(input)){
                return i;
            }
        }
        return -1;
    }
}