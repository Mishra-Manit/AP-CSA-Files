/**
 * Purpose: Tester class for a class named Movie
 *
 * @version 3/14/2022
 * @ Manit Mishra
 */
public class MovieTesterV3 {
    public static void main(String[] args) {
        Movie[] movieObjects = new Movie[10];
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

        sortByTitle(movieObjects, 1);
        System.out.println("\n<<Sorted with title ascending>>\n");
        for (int i = 0; i < movieObjects.length; i++) {
            System.out.println(movieObjects[i]);
        }

        sortByTitle(movieObjects, 2);
        System.out.println("\n<<Sorted with title descending>>\n");
        for (int i = 0; i < movieObjects.length; i++) {
            System.out.println(movieObjects[i]);
        }

        sortByYear(movieObjects, 1);
        System.out.println("\n<<Sorted with Year ascending>>\n");
        for (int i = 0; i < movieObjects.length; i++) {
            System.out.println(movieObjects[i]);
        }

        sortByYear(movieObjects, 2);
        System.out.println("\n<<Sorted with Year descending>>\n");
        for (int i = 0; i < movieObjects.length; i++) {
            System.out.println(movieObjects[i]);
        }

        sortByStudio(movieObjects, 1);
        System.out.println("\n<<Sorted with Studio ascending>>\n");
        for (int i = 0; i < movieObjects.length; i++) {
            System.out.println(movieObjects[i]);
        }

        sortByStudio(movieObjects, 2);
        System.out.println("\n<<Sorted with Studio descending>>\n");
        for (int i = 0; i < movieObjects.length; i++) {
            System.out.println(movieObjects[i]);
        }
        }


    public static void printAllElements(Movie[] movieObjects) {
        for (Movie element : movieObjects) {
            System.out.printf("Name: %-25s Year: %-10s Studio: %-10s\n", element.getTitle(), element.getYear(), element.getStudio());
        }
        System.out.println();
    }

    public static void sortByTitle(Movie[] movieObjects, int parameter) {
        if (parameter == 1) {
            int i, k, posmax;
            Movie temp;

            for (i = movieObjects.length - 1; i >= 0; i--) {
                posmax = 0;
                for (k = 0; k <= i; k++) {
                    if (movieObjects[k].getTitle().compareTo(movieObjects[posmax].getTitle()) < 0) {
                        posmax = k;
                    }
                }
                temp = movieObjects[i];
                movieObjects[i] = movieObjects[posmax];
                movieObjects[posmax] = temp;
            }
        }

        else if (parameter == 2) {
            int i, k, posmax;
            Movie temp;

            for (i = movieObjects.length - 1; i >= 0; i--) {
                posmax = 0;

                for (k = 0; k <= i; k++) {
                    if ((movieObjects[k].getTitle()).compareTo(movieObjects[posmax].getTitle()) > 0) {
                        posmax = k;
                    }
                }
                temp = movieObjects[i];
                movieObjects[i] = movieObjects[posmax];
                movieObjects[posmax] = temp;
            }
        }
    }

    public static void sortByYear(Movie[] movieObjects, int parameter) {
        if (parameter == 1) {
            int i, k, posmax;
            Movie temp;

            for (i = movieObjects.length - 1; i >= 0; i--) {
                posmax = 0;
                for (k = 0; k <= i; k++) {
                    if (movieObjects[k].getYear() > movieObjects[posmax].getYear()) {
                        posmax = k;
                    }
                }
                temp = movieObjects[i];
                movieObjects[i] = movieObjects[posmax];
                movieObjects[posmax] = temp;
            }
        }

        else if (parameter == 2) {
            int i, k, posmax;
            Movie temp;

            for (i = movieObjects.length - 1; i >= 0; i--) {
                posmax = 0;

                for (k = 0; k <= i; k++) {
                    if ((movieObjects[k].getYear()) < movieObjects[posmax].getYear()) {
                        posmax = k;
                    }
                }
                temp = movieObjects[i];
                movieObjects[i] = movieObjects[posmax];
                movieObjects[posmax] = temp;
            }
        }
    }

    public static void sortByStudio(Movie[] movieObjects, int parameter) {
        if (parameter == 1) {
            int i, k, posmax;
            Movie temp;

            for (i = movieObjects.length - 1; i >= 0; i--) {
                posmax = 0;
                for (k = 0; k <= i; k++) {
                    if (movieObjects[k].getStudio().compareTo(movieObjects[posmax].getStudio()) < 0){
                        posmax = k;
                    }
                }
                temp = movieObjects[i];
                movieObjects[i] = movieObjects[posmax];
                movieObjects[posmax] = temp;
            }
        }

        else if (parameter == 2) {
            int i, k, posmax;
            Movie temp;

            for (i = movieObjects.length - 1; i >= 0; i--) {
                posmax = 0;

                for (k = 0; k <= i; k++) {
                    if (movieObjects[k].getStudio().compareTo(movieObjects[posmax].getStudio()) > 0) {
                        posmax = k;
                    }
                }
                temp = movieObjects[i];
                movieObjects[i] = movieObjects[posmax];
                movieObjects[posmax] = temp;
            }
        }
    }
}
