/**
 * Purpose: Class for creating forests.
 *
 * @version 3/22/2022
 * @ Manit Mishra
 */
public class Forest extends Terrain{
    private int myNumberOfTrees;

    public Forest(int l, int w, int numOfTrees){
        super(l, w);
        myNumberOfTrees = numOfTrees;
    }

    public int getNumberOfTrees(){return myNumberOfTrees;}
}