import java.util.spi.CalendarDataProvider;

/**
 * Purpose: Display a "Hello, World!" message to the screen.
 *
 * @version or date
 * @ Manit Mishra
 */
public class ElectionTesterV1 {
    public static void main(String[] args) {
        Candidate [] candidateObjects = new Candidate[5];
            candidateObjects[0] = new Candidate("Tony Stark", 3691);
            candidateObjects[1] = new Candidate("Henry Pym", 2691);
            candidateObjects[2] = new Candidate("Batman", 1962);
            candidateObjects[3] = new Candidate("Wonder Woman", 1491);
            candidateObjects[4] = new Candidate("Venom", 1968);

        printResults(candidateObjects);
        System.out.println();
        printTable(candidateObjects);
    }
    public static void printResults(Candidate [] candidateObjects){
        for(int i = 0; i < candidateObjects.length; i++)
            System.out.println(candidateObjects[i]);
    }

    public static int calculateTotalNumberOfVotes(Candidate [] candidateObjects){
        int totalNumberOfVotes = 0;

        for (Candidate element: candidateObjects){
            totalNumberOfVotes = totalNumberOfVotes + element.getVotes();
        }
        return totalNumberOfVotes;
    }

    public static void printTable(Candidate [] candidateObjects){
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