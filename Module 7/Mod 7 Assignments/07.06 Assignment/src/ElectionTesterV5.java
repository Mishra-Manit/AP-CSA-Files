/**
 * Purpose: Display all results of an election with select candidates. Also make classes in order to change all of the
 *          different aspects of these different candidates. Do all of this with the use of Arrays.
 *
 * @ 3/8/22
 * @ Manit Mishra
 */

public class ElectionTesterV5 {
    public static void main(String[] args) {
        Candidate [] candidateObjects = new Candidate[5];
            candidateObjects[0] = new Candidate("Tony Stark", 3691);
            candidateObjects[1] = new Candidate("Henry Pym", 2691);
            candidateObjects[2] = new Candidate("Batman", 1962);
            candidateObjects[3] = new Candidate("Wonder Woman", 1491);
            candidateObjects[4] = new Candidate("Venom", 1968);

        System.out.println("Original Results: \n");
        printTable(candidateObjects);

        System.out.println("\n<<In position 2, add Nick Fury, 518 votes>>\n");
        insertNewCandidate(candidateObjects, 2, "Nick Fury", 518);
        printTable(candidateObjects);

        System.out.println("\n<<Before Nick Fury, add Clint Barton, 426 votes>>\n");
        insertCandidateBefore(candidateObjects, "Nick Fury", "Clint Barton", 426);
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

    public static void insertNewCandidate(Candidate [] candidateObjects, int location, String addName, int addVotes){
        //move items down in the array - last item is lost
        for(int index = candidateObjects.length - 1; index > location; index--){
            candidateObjects[index] = candidateObjects[index-1];
        }

        candidateObjects[location] = new Candidate(addName, addVotes);
    }

    public static void insertCandidateBefore(Candidate [] candidateObjects, String name, String addName, int addVotes){
        int location = 0;
        for (int i = 0; i < candidateObjects.length; i++){
            if (candidateObjects[i].getName().equals(name)){
                location = i;
            }
        }
        for (int i = candidateObjects.length - 1; i > location; i--){
            candidateObjects[i] = candidateObjects[i - 1];
        }
        candidateObjects[location] = new Candidate(addName, addVotes);
    }
}






















