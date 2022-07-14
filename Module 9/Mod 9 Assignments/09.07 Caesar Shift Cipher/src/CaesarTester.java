import java.util.Scanner;
/**
 * Purpose: Test the encryption and decryption classes.
 *
 * @version 3/28/2022
 * @ Manit Mishra
 */

public class CaesarTester {
    public static void main(String[] args) {
        Encryption myEncryption = new Encryption(0);

        Decryption myDecryption = new Decryption(0);

        //All things regarding menu
        Scanner in = new Scanner(System.in);

        String afterInput = "";

        System.out.println("Type quit to quit the program after you choose the shift amount.");
        System.out.println("\nEnter \"Encryption\" or \"Decryption\"");
        String choose = in.nextLine();

        if (choose.equalsIgnoreCase("Encryption")){
            System.out.println("Enter the encryption shift that you want: ");
            String encryptionShift = in.nextLine();
            int intEncryptionShift = Integer.parseInt(encryptionShift);
            myEncryption.setShiftValue(intEncryptionShift);
        }
        else if(choose.equalsIgnoreCase("Decryption")){
            System.out.println("Enter the decryption shift that you want: ");
            String decryptionShift = in.nextLine();
            int intDecryptionShift = Integer.parseInt(decryptionShift);
            myDecryption.setShiftValue(intDecryptionShift);
        }

        String[] alpha = Encryption.newAlphabet();

        myDecryption.setAlphabet(alpha);
        String[] beta = Decryption.newDecryptionAlphabet();

        //Print out the arrays
        if (choose.equalsIgnoreCase("Encryption")){
            System.out.println("Encryption Alphabet: ");
            System.out.print( "[ " );
            for (String element : alpha){
                System.out.print(element + " ");
            }
            System.out.print( "]" );

        }
        else if (choose.equalsIgnoreCase("Decryption")){
            System.out.println("\nDecryption Alphabet:");
            System.out.print( "[ " );
            for (String element : beta){
                System.out.print(element + " ");
            }
            System.out.print( "]" );
            System.out.println();
        }

        System.out.println();

        while(! (afterInput.equalsIgnoreCase("quit"))){
            if (choose.equalsIgnoreCase("Encryption")){
                System.out.println("\nEnter the phrase/word you want to encrypt\n");
                afterInput = in.nextLine();

                String encryptedMessage = Encryption.encryptMessage(afterInput, alpha);

                if (! (afterInput.equalsIgnoreCase("quit"))){
                    System.out.println("\nThe encrypted message is: " + encryptedMessage + "\n");
                }
            }
            else if(choose.equalsIgnoreCase("Decryption")){
                System.out.println("\nEnter the phrase/word you want to decrypt\n");
                afterInput = in.nextLine();

                String decryptedMessage = Decryption.decryptMessage(afterInput, beta);

                if (! (afterInput.equalsIgnoreCase("quit"))){
                    System.out.println("\nThe decrypted message is: " + decryptedMessage + "\n");
                }
            }
        }
    }
}