/**
 * Purpose: Write a program to calculate the averages of dribbles per minute between 1-3 players.
 *
 * @12/4/2021
 * @ Manit Mishra
 */
public class BasketballPlayerV8 {
    private String n;
    private int dbpm;


    public BasketballPlayerV8() {
        dbpm = 0;
    }

    public BasketballPlayerV8(String name, int dribblesPerMinute){
        n = name;
        dbpm = dribblesPerMinute;
    }

    public String getName(){return n;}
    public int getDbpm(){return dbpm;}

    public void setName(String name){n=name;}
    public void setDbpm(int dribblesPm){dbpm=dribblesPm;}


    public double calcDBPS(){
        double averageDribblesPerSecond = 0;
        averageDribblesPerSecond = (double)dbpm / 60;
        return averageDribblesPerSecond;
    }

    public double calcDBPS(int d){
        dbpm = d;
        double averageDribblesPerSecond = 0;
        averageDribblesPerSecond = (double)d / 60;
        return averageDribblesPerSecond;
    }
}

