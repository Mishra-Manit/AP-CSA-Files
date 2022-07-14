
/**
 * The purpose of this program is to read data from
 * an input file.
 *
 * @author Charles Babbage
 * @version 06/05/17
 */
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
public class TextFileReaderV3
{
    public static void main(String[] args) throws IOException
    {

        String token = "";
        int intToken = 0;
        File fileName = new File("data3.txt");
        Scanner inFile = new Scanner(fileName);
        int total = 0;

        //while loop will continue while inFile has a next token to read
        while (inFile.hasNextInt())
        {
            intToken = inFile.nextInt();      //read next token from file
            System.out.println(intToken);   //print value of token
            total += intToken;
        }//end while
    }//end of main method
}//end of class
/*

// V3: Use the following block of code to test reading integers from data3.txt

      //String token = "";
      int intToken = 0;
      File fileName = new File("data3.txt");
      Scanner inFile = new Scanner(fileName);
      int total = 0;

      //while loop will continue while inFile has a next token to read
      while (inFile.hasNext())
      {
         intToken = inFile.nextInt();      //read next token from file
         System.out.println(intToken);   //print value of token
         total += intToken;
      }//end while

      System.out.println("\nTotal: " + total);
      inFile.close();                 //close input file



// V4: Use the following block of code to test reading doubles from data4.txt
/*
      String token = "";
      double doubleToken = 0.0;
      File fileName = new File("data4.txt");
      Scanner inFile = new Scanner(fileName);
      double total = 0;

      //while loop will continue while inFile has a next token to read
      while (inFile.hasNext())
      {
         doubleToken = inFile.nextDouble( );      //read next token from file
         System.out.println(doubleToken);   //print value of token
         total += doubleToken;
      }//end while

      System.out.println("\nTotal: " + total);
      inFile.close();                 //close input file
 */