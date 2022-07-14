/**
 * Purpose: Display the results of calling all of the different classes.
 *
 * @version 3/22/2022
 * @ Manit Mishra
 */
public class GameTerrainTester {
    public static void main(String[] args) {
        Terrain boringTerrain = new Terrain(150, 240);
        System.out.println(boringTerrain.getTerrainSize());
        System.out.println();

        Mountain mountainTerrain = new Mountain(300, 500, 10);
        System.out.println("Mountain " + mountainTerrain.getTerrainSize() + " and has " + mountainTerrain.getNumOfMountains() + " mountains");
        System.out.println();

        WinterMountain winterMountainTerrain = new WinterMountain(100, 160, 15, 68.6);
        System.out.println("Winter Mountain " + winterMountainTerrain.getTerrainSize() + " and has " + winterMountainTerrain.getNumOfMountains() + " mountains"
                            + " with the average temp of " + winterMountainTerrain.getTemperature() + " degrees");
        System.out.println();

        Forest forestTerrain = new Forest(230, 340, 600);
        System.out.println("Forest " + forestTerrain.getTerrainSize() + " and has " + forestTerrain.getNumberOfTrees() + " trees");
        System.out.println();

        TallForest tallForestTerrain = new TallForest(243, 234, 500, 80);
        System.out.println("Tall Forest " + tallForestTerrain.getTerrainSize() + " amd has " + tallForestTerrain.getNumberOfTrees() +
                            " with the trees having an average height of " + tallForestTerrain.getAverageHeightOfTrees() + " feet");
        System.out.println();

        Wetland wetlandTerrain = new Wetland(245 ,240, 60.4);
        System.out.println("Wetlands " + wetlandTerrain.getTerrainSize() + " and has " + wetlandTerrain.getAmountOfRain() + " inches of rainfall every year");
        System.out.println();
    }
}