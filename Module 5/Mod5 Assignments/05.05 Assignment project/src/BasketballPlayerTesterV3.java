/**
 * @purpose: BasketballPlayerV3 client class
 *
 * @author Manit Mishra
 * @version 11/28/2021
 */


public class BasketballPlayerTesterV3 {

    public static void printPlayers(int dbpm1, int dbpm2, double average, double difference) {
        System.out.print(dbpm1);
        System.out.print("\t\t\t\t" + dbpm2);
        System.out.print("\t\t\t\t" + average);
        System.out.print("\t\t" + difference);

    }

    public static void Header(){
        System.out.println("Players");
        System.out.println("______________________________________________________");
        System.out.print("Player 1");
        System.out.print("\t\tPlayer 2");
        System.out.print("\t\tAverage");
        System.out.println("\t\tDifference");
        System.out.println("______________________________________________________");
    }


    public static void main(String[] args) {
        int dbpm1 = 60;
        int dbpm2 = 45;
        Header();

        double average = 0.0;
        double difference = 0.0;

        BasketballPlayerV3 player1 = new BasketballPlayerV3();

        average = player1.calcAverage(dbpm1, dbpm2);
        difference = player1.calcDifference(dbpm1, dbpm2);
        printPlayers(dbpm1, dbpm2, average, difference);

    }
}
