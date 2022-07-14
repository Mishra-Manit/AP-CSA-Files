/**
 * Purpose: Class for creating mountains.
 *
 * @version 3/22/2022
 * @ Manit Mishra
 */
public class Mountain extends Terrain{
    private int myNumOfMountains;

    public Mountain(int l, int w, int numOfMountains){
        super(l, w);
        myNumOfMountains = numOfMountains;
    }

    public int getNumOfMountains(){return myNumOfMountains;}
}