/**
 * Purpose: Display all results of an election with select candidates. Also make classes in order to change all of the
 *          different aspects of these different candidates. Do all of this with the use of Arrays.
 *
 * @ 3/7/22
 * @ Manit Mishra
 */

public class ElectionTesterV3 {
    public static void main(String[] args) {
        Candidate [] candidateObjects = new Candidate[5];
            candidateObjects[0] = new Candidate("Tony Stark", 3691);
            candidateObjects[1] = new Candidate("Henry Pym", 2691);
            candidateObjects[2] = new Candidate("Batman", 1962);
            candidateObjects[3] = new Candidate("Wonder Woman", 1491);
            candidateObjects[4] = new Candidate("Venom", 1968);

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
        System.out.println("Candidate             Votes Received             % of Total Votes");
        System.out.println("==================================================================");

        for (Candidate element : candidateObjects){
            System.out.printf("%-26s %-26s %2.5s \n", element.getName(), element.getVotes(),
                    (100*(double)element.getVotes()/totalVotes));
        }
        System.out.println("\nThe total number of votes is: " + totalVotes);
    }

    public static void changeName(Candidate[] candidateObjects, String find, String replace){
        for (int i = 0; i < candidateObjects.length; i++){
            if (candidateObjects[i].getName().equals(find)){
                candidateObjects[i].setName(replace);
            }
        }
    }

    public static void changeVotes(Candidate[] candidateObjects, String name, int replace){
        for (int i = 0; i < candidateObjects.length; i++){
            if (candidateObjects[i].getName().equals(name)){
                candidateObjects[i].setVotes(replace);
            }
        }
    }

    public static void changeBothVotesAndName(Candidate[] candidateObjects, String name, String replacementName,
                                              int replacementVotes){
        for (int i = 0; i < candidateObjects.length; i++){
            if (candidateObjects[i].getName().equals(name)){
                candidateObjects[i].setName(replacementName);
                candidateObjects[i].setVotes(replacementVotes);
            }
        }
    }
}






















