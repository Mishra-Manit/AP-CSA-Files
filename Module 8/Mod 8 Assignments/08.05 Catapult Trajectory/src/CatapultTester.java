/**
 * Purpose: Print out a table of distances the projectile will go
 *
 * @version 3/19/2022
 * @ Manit Mishra
 */
public class CatapultTester {
    public static void main(String[] args) {
        Catapult myTestCatapult = new Catapult();

        int[] speedArray = {20, 25, 30, 35, 40, 45, 50};
        int[] angleArray = {25, 30, 35, 40, 45, 50};

        double[][] twoDimArray = new double[7][6];

        for (int mps = 0; mps < speedArray.length; mps++){
            for (int deg = 0; deg < angleArray.length; deg++){
                double distance = myTestCatapult.calcDistance(speedArray[mps], angleArray[deg]);

                twoDimArray[mps][deg] = distance;
            }
        }


        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t Projectile Distance (Feet) \n");

        System.out.println("Meters Per Second      25 deg \t\t 30 deg \t   35 deg \t\t 40 deg        45 deg \t\t 50 deg");
        System.out.println("===================================================================================================");
        printResults(twoDimArray);
    }

    public static void printResults(double[][] array){
        int j = 20;

        for(int row = 0; row < array.length; row++)
        {
            System.out.print("\t\t" + j + "\t\t\t   ");

            for(int col = 0; col < array[row].length; col ++)
            {
                System.out.printf("%-14.2f",array[row][col]);

            }
            System.out.println();
            j = j + 5;
        }
    }
}