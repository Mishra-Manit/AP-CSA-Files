import java.util.ArrayList;
/**
 * Purpose: Display all results of an election with select candidates. Also make classes in order to change all of the
 *          different aspects of these different candidates. Do all of this with the use of ArrayLists.
 *
 * @version or date
 * @ Manit Mishra
 */

public class ElectionTesterV4 {
    public static void main(String[] args) {
        ArrayList <Candidate> candidateObjects = new ArrayList<Candidate>();
        candidateObjects.add(new Candidate("Tony Stark", 3691));
        candidateObjects.add(new Candidate("Henry Pym", 2691));
        candidateObjects.add(new Candidate("Batman", 1962));
        candidateObjects.add(new Candidate("Wonder Woman", 1491));
        candidateObjects.add(new Candidate("Venom", 1968));

        System.out.println("Original Results\n");
        printResults(candidateObjects);
        System.out.println();
        printTable(candidateObjects);

        System.out.println("\n<<Changing Tony Stark to Your Mom>>\n");
        changeName(candidateObjects,"Tony Stark", "Your Mom");
        printTable(candidateObjects);

        System.out.println("\n\n<<Changing Venom Votes to 2500>>\n");
        changeVotes(candidateObjects,"Venom", 2500);
        printTable(candidateObjects);

        System.out.println("\n\n<<Changing Wonder Woman to Wonder Man and Votes to 5000>>\n");
        changeBothVotesAndName(candidateObjects,"Wonder Woman", "Wonder Man", 5000);
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
        System.out.println("Candidate             Votes Received             % of Total Votes");
        System.out.println("==================================================================");

        for (Candidate element : candidateObjects){
            System.out.printf("%-26s %-26s %2.5s \n", element.getName(), element.getVotes(),
                    (100*(double)element.getVotes()/totalVotes));
        }

        System.out.printf("\nThe total number of votes is: %s\n", totalVotes);
    }

    public static void changeName(ArrayList <Candidate> candidateObjects, String find, String replace){
        for (int i = 0; i < candidateObjects.size(); i++){
            if (candidateObjects.get(i).getName().equals(find)){
                candidateObjects.get(i).setName(replace);
            }
        }
    }

    public static void changeVotes(ArrayList <Candidate> candidateObjects, String name, int replace){
        for (int i = 0; i < candidateObjects.size(); i++){
            if (candidateObjects.get(i).getName().equals(name)){
                candidateObjects.get(i).setVotes(replace);
            }
        }
    }

    public static void changeBothVotesAndName(ArrayList <Candidate> candidateObjects, String name, String replacementName,
                                              int replacementVotes){
        for (int i = 0; i < candidateObjects.size(); i++){
            if (candidateObjects.get(i).getName().equals(name)){
                candidateObjects.get(i).setName(replacementName);
                candidateObjects.get(i).setVotes(replacementVotes);
            }
        }
    }
}