/**
 * @purpose  Make the tester class and print a table with the Data needed to make a cheesecake.
 *
 * @author Manit Mishra
 * @version 3/3/22
 *
 */
import java.util.ArrayList;

class cheesecaketesterv1
{
    public static void main(String[] args)
    {
        //initializing and declareing an ArrayList and adding in objects as elements
        ArrayList<cheesecakev1> cake = new ArrayList<cheesecakev1>();
            // add CheeseCake to the ArrayList
        cake.add(new cheesecakev1("Blueberry", 5));
        cake.add(new cheesecakev1("Strawberry", 6));
        cake.add(new cheesecakev1("Cherry", 4));
        cake.add(new cheesecakev1("Jalapeno", 1));
        cake.add(new cheesecakev1("Dill", 2));
        cake.add(new cheesecakev1("Fig", 3));

        //calls several method for each object to perform calculations
        for(cheesecakev1 dataRecord : cake)
        {
            dataRecord.calcTotalServings();
            dataRecord.calcSugar();
            dataRecord.calcCreamCheese();
            dataRecord.calcVanilla();
        }
        
        //printing the format of the table
        System.out.println("|       Cheese Cake Data           |             Ingredient Calculations             |");
        System.out.println("| Index | Quantity |     Flavor    | Cream Cheese | Servings |   Sugar   |  Vanilla  |");
        System.out.println("|-------|----------|---------------|--------------|----------|-----------|-----------|");

        cheesecakev1 dataRecord;


        //using a for loop to print out the objects' data
        for(int index = 0; index < cake.size(); index ++)
        {
            cheesecakev1 myTemp = cake.get(index);
            System.out.println( "|   " + index + myTemp.toString());
        }
    }
}
