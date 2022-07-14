/**
 * Purpose: Use the sequential search with the Music class
 *
 * @version 3/17/2022
 * @ Manit Mishra
 */
public class MusicTesterV1 {
    public static void main(String[] args) {
        Music [] songs = new Music[10];
        songs[0] = new Music("Livin' on a prayer", 1986, "Bon Jovi");
        songs[1] = new Music("Cheese is great", 2010, "Drake");
        songs[2] = new Music("I love food", 1986, "Ed Sheeran");
        songs[3] = new Music("Living Life", 1986, "Bon Jovi");
        songs[4] = new Music("AP CSA is a course", 2010, "Jack Harlow");
        songs[5] = new Music("This chapter is cool", 1995, "Eminem");
        songs[6] = new Music("AP CSAAAAAA", 2010, "Eminem");
        songs[7] = new Music("AP Test seems", 1995, "Drake");
        songs[8] = new Music("LIKE PAIN", 2006, "Bon Jovi");
        songs[9] = new Music("HAHAHAHA", 2006, "Drake");

        System.out.println("<<Original Table>>");
        System.out.println("\nTitle                     Year   Artist");
        System.out.println("------------------------------------------");
        printResults(songs);

        System.out.println("\n<<Search by the title \"Living Life\">>");
        System.out.println("\nTitle                     Year   Artist");
        System.out.println("------------------------------------------");
        searchByTitle(songs, "Living Life");

        System.out.println("\n<<Searching for title \"CHEEEEESE\">>");
        System.out.println("\nTitle                     Year   Artist");
        System.out.println("------------------------------------------");
        searchByTitle(songs, "CHEEEEESE");

        System.out.println("\n<<Search by the year 1986>>");
        System.out.println("\nTitle                     Year   Artist");
        System.out.println("------------------------------------------");
        searchByYear(songs, 1986);

        System.out.println("\n<<Search by the year 2022>>");
        System.out.println("\nTitle                     Year   Artist");
        System.out.println("------------------------------------------");
        searchByYear(songs, 2022);

        System.out.println("\n<<Search by Artist Drake>>");
        System.out.println("\nTitle                     Year   Artist");
        System.out.println("------------------------------------------");
        searchByArtist(songs, "Drake");

        System.out.println("\n<<Search by Artist Kanye>>");
        System.out.println("\nTitle                     Year   Artist");
        System.out.println("------------------------------------------");
        searchByArtist(songs, "Kanye");
    }

    public static void printResults(Music[] songs){
        for (int i = 0; i < songs.length; i++){
            System.out.println(songs[i]);
        }
    }

    public static void searchByTitle (Music[] songs, String title){
        int index = 0;

        for (int i = 0; i < songs.length; i++){
            if(songs[i].getTitle().compareTo(title) == 0) {
                index = i;
                break;
            }
        }
        if (index != 0){
            System.out.println(songs[index]);
        }
        else{
            System.out.println("A song by the title of " + title + " is not in this collection");
        }
    }

    public static void searchByYear (Music[] songs, int year){
        int found = 0;

        for(int i = 0; i < songs.length; i++)
        {
            if(songs[i].getYear() == year)
            {
                System.out.println(songs[i]);
                found++;
            }
        }

        if(found == 0)
        {
            System.out.println("None of these songs are from the following year: " + year);
        }
    }

    public static void searchByArtist (Music[] songs, String artist){
        int found = 0;

        for (int i = 0; i < songs.length; i++){
            if (songs[i].getArtist().compareTo(artist) == 0){
                System.out.println(songs[i]);
                found++;
            }
        }

        if (found == 0){
            System.out.print("The artist " + artist + " is not in this collection");
        }
    }
}