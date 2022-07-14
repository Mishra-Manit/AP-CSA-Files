/**
 * This is a class that tests the Card class.
 *
 *  < Manit Mishra >
 *  < 4/19/2022 >
 */

public class CardTester
{
   /**
    * The main method in this class checks the Card operations for consistency.
    * @param args is not used.
    */
   public static void main(String[] args) {

      /* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */

      // Establish new cards
      Card aceHearts = new Card("ace", "hearts", 1);
      Card eightDiamonds = new Card("8", "hearts", 8);
      Card twoKings = new Card("2", "hearts", 2);

      // Test card 1 and methods
      System.out.println("**** Tests Card 1: ace of hearts ****");
      System.out.println("  rank: " + aceHearts.rank());
      System.out.println("  suit: " + aceHearts.suit());
      System.out.println("  pointValue: " + aceHearts.pointValue());
      System.out.println("  toString: " + aceHearts.toString());
      System.out.println();

      // Test card 2
      System.out.println("**** Tests Card 2: eight of diamonds ****");
      System.out.println("  rank: " + eightDiamonds.rank());
      System.out.println("  suit: " + eightDiamonds.suit());
      System.out.println("  pointValue: " + eightDiamonds.pointValue());
      System.out.println("  toString: " + eightDiamonds.toString());
      System.out.println();

      // Test card 3
      System.out.println("**** Tests Card 3: two of kings ****");
      System.out.println("  rank: " + twoKings.rank());
      System.out.println("  suit: " + twoKings.suit());
      System.out.println("  pointValue: " + twoKings.pointValue());
      System.out.println("  toString: " + twoKings.toString());
      System.out.println();

      // Test matches() method
      System.out.println("**** matches Tests ****");
      boolean result = twoKings.matches(eightDiamonds);

      System.out.println("matching: " + result);

   }
}
