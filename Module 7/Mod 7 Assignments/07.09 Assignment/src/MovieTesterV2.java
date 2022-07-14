/**
 * Purpose: Tester class for a class named Movie
 *
 * @version 3/13/2022
 * @ Manit Mishra
 */
public class MovieTesterV2 {
    public static void main(String[] args) {
        Movie [] movieObjects = new Movie[10];
        movieObjects[0] = new Movie("Chipmunk", 1999, "Disney");
        movieObjects[1] = new Movie("Alice Cheese", 1999, "Disney");
        movieObjects[2] = new Movie("Meet the Robinsons", 2021, "Universal Pictures");
        movieObjects[3] = new Movie("World", 1975, "Paramount ");
        movieObjects[4] = new Movie("Cheese", 1863, "Warner Bros");
        movieObjects[5] = new Movie("Choose", 1867, "Disney");
        movieObjects[6] = new Movie("Alive", 1984, "Columbia");
        movieObjects[7] = new Movie("Never", 1993, "Universal Pictures");
        movieObjects[8] = new Movie("Jumped", 2011, "Disney");
        movieObjects[9] = new Movie("Dog", 2007, "Warner Bros");

        System.out.println("<<Original Table>>\n");
        printAllElements(movieObjects);

        System.out.println("<<Sorted with title ascending>>\n");
        Movie[] titleSortedAscending = sortByTitle(movieObjects, 1);
        printAllElements(titleSortedAscending);

        System.out.println("<<Sorted with title descending>>\n");
        Movie[] titleSortedDescending = sortByTitle(movieObjects, 2);
        printAllElements(titleSortedDescending);

        System.out.println("<<Sorted with Year ascending>>\n");
        Movie[] sortByYearAscending = sortByYear(movieObjects, 1);
        printAllElements(sortByYearAscending);

        System.out.println("<<Sorted with Year descending>>\n");
        Movie[] sortByYearDescending = sortByYear(movieObjects, 2);
        printAllElements(sortByYearDescending);

        System.out.println("<<Sorted with Studio ascending>>\n");
        Movie[] sortByStudioAscending = sortByStudio(movieObjects, 1);
        printAllElements(sortByStudioAscending);

        System.out.println("<<Sorted with Studio descending>>\n");
        Movie[] sortByStudioDescending = sortByStudio(movieObjects, 2);
        printAllElements(sortByStudioDescending);
    }

    public static void printAllElements(Movie [] movieObjects){
        for (Movie element : movieObjects){
            System.out.printf("Name: %-25s Year: %-10s Studio: %-10s\n", element.getTitle(), element.getYear(), element.getStudio());
        }
        System.out.println();
    }

    public static Movie [] sortByTitle(Movie [] movieObjects, int parameter) {
        Movie[] dest = new Movie[movieObjects.length];

        if (parameter == 1) {
            for (int i = 0; i < movieObjects.length; i++) {
                Movie next = movieObjects[i];
                int insertindex = 0;
                int k = i;

                while (k > 0 && insertindex == 0) {
                    if (next.getTitle().compareTo(dest[k - 1].getTitle()) < 0) {
                        insertindex = k;
                    } else {
                        dest[k] = dest[k - 1];
                    }
                    k--;
                }
                dest[insertindex] = next;
            }
        }
        else if (parameter == 2) {
            for (int i = 0; i < movieObjects.length; i++) {
                Movie next = movieObjects[i];
                int insertindex = 0;
                int k = i;

                while (k > 0 && insertindex == 0) {
                    if (next.getTitle().compareTo(dest[k - 1].getTitle()) > 0) {
                        insertindex = k;
                    } else {
                        dest[k] = dest[k - 1];
                    }
                    k--;
                }
                dest[insertindex] = next;
            }
        }

        return dest;
    }

    public static Movie[] sortByYear(Movie [] movieObjects, int parameter){
        Movie [] dest = new Movie[movieObjects.length];

        if (parameter == 1){
            for (int i = 0; i < movieObjects.length; i++){
                Movie next = movieObjects[i];
                int insertindex = 0;
                int k = i;

                while (k > 0 && insertindex == 0){
                    if (next.getYear() > dest[k-1].getYear()){
                        insertindex = k;
                    }
                    else {
                        dest[k] = dest[k - 1];
                    }
                    k--;
                }
                dest[insertindex] = next;
            }
        }
        else if (parameter == 2){
            for (int i = 0; i < movieObjects.length; i++){
                Movie next = movieObjects[i];
                int insertindex = 0;
                int k = i;

                while (k > 0 && insertindex == 0){
                    if (next.getYear() < dest[k-1].getYear()){
                        insertindex = k;
                    }
                    else {
                        dest[k] = dest[k - 1];
                    }
                    k--;
                }
                dest[insertindex] = next;
            }
        }
        return dest;
    }

    public static Movie [] sortByStudio(Movie [] movieObjects, int parameter){
        Movie [] dest = new Movie[movieObjects.length];

        if (parameter == 1){
            for (int i = 0; i < movieObjects.length; i++){
                Movie next = movieObjects[i];
                int insertindex = 0;
                int k = i;

                while(k > 0 && insertindex == 0){
                    if (next.getStudio().compareTo(dest[k-1].getStudio()) < 0){
                        insertindex = k;
                    }
                    else {
                        dest[k] = dest[k - 1];
                    }
                    k--;
                }
                dest[insertindex] = next;
            }
        }

        if (parameter == 2){
            for (int i = 0; i < movieObjects.length; i++){
                Movie next = movieObjects[i];
                int insertindex = 0;
                int k = i;

                while(k > 0 && insertindex == 0){
                    if (next.getStudio().compareTo(dest[k-1].getStudio()) > 0){
                        insertindex = k;
                    }
                    else {
                        dest[k] = dest[k - 1];
                    }
                    k--;
                }
                dest[insertindex] = next;
            }
        }

        return dest;
    }
}
