import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Purpose: Display a "Hello, World!" message to the screen.
 *
 * @version or date
 * @ Manit Mishra
 */
public class ElectionTesterV2 {
    public static void main(String[] args) {
        ArrayList <Candidate> candidateObjects = new ArrayList<Candidate>();
        candidateObjects.add(new Candidate("Tony Stark", 3691));
        candidateObjects.add(new Candidate("Henry Pym", 2691));
        candidateObjects.add(new Candidate("Batman", 1962));
        candidateObjects.add(new Candidate("Wonder Woman", 1491));
        candidateObjects.add(new Candidate("Venom", 1968));

        printResults(candidateObjects);
        System.out.println();
        printTable(candidateObjects);
    }
    public static void printResults(ArrayList <Candidate> candidateObjects){
        for(int i = 0; i < candidateObjects.size(); i++)
            System.out.println(candidateObjects.get(i));
    }

    public static int calculateTotalNumberOfVotes(ArrayList <Candidate> candidateObjects){
        int totalNumberOfVotes = 0;

        for (Candidate element: candidateObjects){
            totalNumberOfVotes = totalNumberOfVotes + element.getVotes();
        }
        return totalNumberOfVotes;
    }

    public static void printTable(ArrayList <Candidate> candidateObjects){
        int totalVotes = calculateTotalNumberOfVotes(candidateObjects);
        System.out.println("Election Results \n");
        System.out.println("Candidate             Votes Received             % of Total Votes");
        System.out.println("==================================================================");

        for (Candidate element : candidateObjects){
            System.out.printf("%-26s %-26s %2.5s \n", element.getName(), element.getVotes(),
                    (100*(double)element.getVotes()/totalVotes));
        }

        System.out.printf("\nThe total number of votes is: %s", totalVotes);
    }
}