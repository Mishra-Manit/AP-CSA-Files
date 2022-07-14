/**
 * Purpose: Class for creating tall forests.
 *
 * @version 3/22/2022
 * @ Manit Mishra
 */
public class TallForest extends Forest{
    private double myAvgHeightOfTrees;

    public TallForest(int l, int w, int numOfTrees, double averageHeight){
        super(l, w, numOfTrees);
        myAvgHeightOfTrees = averageHeight;
    }

    public double getAverageHeightOfTrees(){return myAvgHeightOfTrees;}
}