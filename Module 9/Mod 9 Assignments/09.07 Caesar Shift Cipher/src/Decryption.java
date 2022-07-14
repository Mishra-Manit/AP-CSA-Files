/**
 * Purpose: Class to decrypt message given.
 *
 * @version 3/28/2022
 * @ Manit Mishra
 */

public class Decryption {
    private static int shiftValue;
    private static String [] ALPHABET = new String[26];

    public Decryption(int shift){
        shiftValue = shift;
    }

    public void setShiftValue(int shift){
        shiftValue = shift;
    }

    public void setAlphabet(String [] alphabet){ALPHABET = alphabet;}

    public static String[] newDecryptionAlphabet(){
        String [] sortedAlphabet = new String[ALPHABET.length];

        for (int i = 0; i < ALPHABET.length; i++){
            if ((i - shiftValue >= 0) && (i - shiftValue < 26)){
                int indexOfAlphabet = i - shiftValue;
                sortedAlphabet[indexOfAlphabet] = ALPHABET[i];
            }

            else if(i - shiftValue < 0){
                int indexOfLetter = (i - shiftValue) + 26;
                sortedAlphabet[indexOfLetter] = ALPHABET[i];
            }
        }
        return sortedAlphabet;
    }

    public static String decryptMessage(String originalMessage, String[] sortedAlphabet){
        String decryptedMessage = "";

        for (int i = 0; i < originalMessage.length(); i++){
            int indexOfLetter = findIndex(originalMessage.substring(i, i+1));

            if (originalMessage.substring(i, i+1).equalsIgnoreCase(" ")){
                decryptedMessage = decryptedMessage + " ";
            }
            else{
                char k = originalMessage.charAt(i);
                int ascii = (int)k;

                if (ascii >= 65 && ascii <= 90){
                    decryptedMessage = decryptedMessage + sortedAlphabet[indexOfLetter].toUpperCase();
                }
                else{
                    decryptedMessage = decryptedMessage + sortedAlphabet[indexOfLetter];
                }
            }
        }

        return decryptedMessage;
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