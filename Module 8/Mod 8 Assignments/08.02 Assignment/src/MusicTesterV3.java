/**
 * Purpose: Use binary search with the Music class
 *
 * @version 3/18/2022
 * @ Manit Mishra
 */
public class MusicTesterV3 {
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

        System.out.println("\n<<Find song titled Living Life>>");
        System.out.println("\nTitle                     Year   Artist");
        System.out.println("------------------------------------------");
        insertionSortTitle(songs);
        findTitle(songs, "Living Life");

        System.out.println("\n<<Find song titled CCCHHHHESE>>");
        System.out.println("\nTitle                     Year   Artist");
        System.out.println("------------------------------------------");
        insertionSortTitle(songs);
        findTitle(songs, "CCCHHHHESE");

        System.out.println("\n<<Find Artist named Drake>>");
        System.out.println("\nTitle                     Year   Artist");
        System.out.println("------------------------------------------");
        insertionSortArtist(songs);
        findArtist(songs, "Drake");

        System.out.println("\n<<Find Artist named Kanye>>");
        System.out.println("\nTitle                     Year   Artist");
        System.out.println("------------------------------------------");
        insertionSortArtist(songs);
        findArtist(songs, "Kanye");

        System.out.println("\n<<Find Songs from year 1986>>");
        System.out.println("\nTitle                     Year   Artist");
        System.out.println("------------------------------------------");
        insertionSortYear(songs);
        findYear(songs, 1986);

        System.out.println("\n<<Find Songs from year 2022>>");
        System.out.println("\nTitle                     Year   Artist");
        System.out.println("------------------------------------------");
        insertionSortYear(songs);
        findYear(songs, 2022);
    }

    public static void printResults(Music[] songs){
        for (int i = 0; i < songs.length; i++){
            System.out.println(songs[i]);
        }
    }

    public static void insertionSortTitle (Music[] songs){
        Music dest[] = new Music[songs.length];

        for (int i = 0; i < songs.length; i++){
            Music next = songs[i];
            int insertindex = 0;
            int k = i;

            while (k > 0 && insertindex == 0){
                if (next.getTitle().compareTo(dest[k-1].getTitle()) > 0){
                    insertindex = k;
                }
                else{
                    dest[k] = dest[k-1];
                }
                k--;
            }
            dest[insertindex] = next;
        }

        for (int i = 0; i < songs.length; i++){
            songs[i] = dest[i];
        }
    }

    public static void insertionSortYear (Music[] songs){
        Music dest[] = new Music[songs.length];

        for (int i = 0; i < songs.length; i++){
            Music next = songs[i];
            int insertindex = 0;
            int k = i;

            while (k > 0 && insertindex == 0){
                if (next.getYear() > dest[k-1].getYear()){
                    insertindex = k;
                }
                else{
                    dest[k] = dest[k-1];
                }
                k--;
            }
            dest[insertindex] = next;
        }
        for (int i = 0; i < songs.length; i++){
            songs[i] = dest[i];
        }
    }

    public static void insertionSortArtist (Music[] songs){
        Music dest[] = new Music[songs.length];

        for (int i = 0; i < songs.length; i++){
            Music next = songs[i];
            int insertindex = 0;
            int k = i;

            while (k > 0 && insertindex == 0){
                if (next.getArtist().compareTo(dest[k-1].getArtist()) > 0){
                    insertindex = k;
                }
                else{
                    dest[k] = dest[k-1];
                }
                k--;
            }
            dest[insertindex] = next;
        }
        for (int i = 0; i < songs.length; i++){
            songs[i] = dest[i];
        }
    }

    public static void findTitle (Music[] songs, String target){
        int high = songs.length;
        int low = -1;
        int probe;

        while (high - low > 1){
            probe = (high + low) / 2;

            if (songs[probe].getTitle().compareTo(target) > 0){
                high = probe;
            }
            else{
                low = probe;
            }
        }

        if (low >= 0 && songs[low].getTitle().compareTo(target) == 0){
            System.out.println(songs[low]);
        }
        else{
            System.out.println("Song not found");
        }
    }

    public static void findArtist (Music[] songs, String target){
        int high = songs.length;
        int low = -1;
        int probe;

        while (high - low > 1){
            probe = (high + low) / 2;

            if (songs[probe].getArtist().compareTo(target) > 0){
                high = probe;
            }
            else{
                low = probe;
                if (songs[probe].getArtist().compareTo(target) == 0){
                    break;
                }
            }
        }

        if (low >= 0 && songs[low].getArtist().compareTo(target) == 0){
            linearPrintLoc(songs, low, target);
        }
        else{
            System.out.println("This artist is not part of the collection");
        }
    }

    public static void findYear (Music[] songs, int target){
        int high = songs.length;
        int low = -1;
        int probe;

        while (high - low > 1){
            probe = (high + low) / 2;

            if (songs[probe].getYear() > target){
                high = probe;
            }
            else{
                low = probe;
                if (songs[probe].getYear() == target){
                    break;
                }
            }
        }

        if ((low >= 0) && (songs[low].getYear() == target)){
            linearPrintLocInt(songs, low, target);
        }
        else{
            System.out.println("There are no songs from the year " + target);
        }
    }

    public static void linearPrintLoc(Music [] songs, int low, String target){
        int i;
        int start = low;
        int end = low;

        i = low-1;

        //Find starting point
        while ((i >= 0) && (songs[i].getArtist().compareTo(target) == 0)){
            start = i;
            i--;
        }

        //Find ending point
        i = low + 1;
        while ((i < songs.length) && (songs[i].getArtist().compareTo(target) == 0)){
            end = i;
            i++;
        }

        for (i = start; i <= end; i++){
            System.out.println(songs[i]);
        }
    }

    public static void linearPrintLocInt(Music [] songs, int low, int target){
        int i;
        int start = low;
        int end = low;

        i = low-1;

        //Find starting point
        while ((i >= 0) && (songs[i].getYear() == target)){
            start = i;
            i--;
        }

        //Find ending point
        i = low + 1;
        while ((i < songs.length) && (songs[i].getYear() == target)){
            end = i;
            i++;
        }

        for (i = start; i <= end; i++){
            System.out.println(songs[i]);
        }
    }
}