/**
 * @purpose: BasketballPlayerV8 client class
 *
 * @author Manit Mishra
 * @version 12/4/2021
 */


public class BasketballPlayerTesterV8 {

    public static void printPlayers(String name1, String name2, String name3,
                                    int dbpm1, int dbpm2, int dbpm3, double dbps1,
                                    double dbps2, double dbps3) {

        System.out.println(name1 + "\t\t\t" + dbpm1 + "\t\t\t\t" + dbps1);
        System.out.println(name2 + "\t\t\t" + dbpm2 + "\t\t\t\t" +dbps2);
        System.out.println(name3 + "\t\t\t" + dbpm3 + "\t\t\t\t" + dbps3);
        System.out.println("_____________________________________");
    }

    public static void Header(){
        System.out.print("Players");
        System.out.print("\t\t\t" + "DBPM");
        System.out.println("\t\t\t" + "DBPS");
        System.out.println("_____________________________________");
    }


    public static void main(String[] args) {
        double dbps1 = 0.0;
        double dbps2 = 0.0;
        double dbps3 = 0.0;

        BasketballPlayerV8 player1 = new BasketballPlayerV8();
        player1.setName("James");
        dbps1 = player1.calcDBPS(90);

        BasketballPlayerV8 player2 = new BasketballPlayerV8("Jack", 132);
        dbps2 = player2.calcDBPS();

        BasketballPlayerV8 player3 = new BasketballPlayerV8("John", 66);
        dbps3 = player3.calcDBPS();


        String playerName1 = player1.getName();
        String playerName2 = player2.getName();
        String playerName3 = player3.getName();

        int playerDbpm1 = player1.getDbpm();
        int playerDbpm2 = player2.getDbpm();
        int playerDbpm3 = player3.getDbpm();

        Header();
        printPlayers(playerName1, playerName2, playerName3, playerDbpm1,
                     playerDbpm2, playerDbpm3, dbps1, dbps2, dbps3);
    }
}
