/**
 * Purpose: Create a gradebook with an ArrayList of Students.
 *
 * @version 3/9/22
 * @ Manit Mishra
 */
import java.util.ArrayList;
public class GradeBook{
    public static void main(String[] args) {
        ArrayList <Student> studentObjects = new ArrayList<Student>();

        studentObjects.add(new Student("Jack Smith", 67, 23, 78, 45, 78));
        studentObjects.add(new Student("Joe Smith", 34, 89, 56, 90, 99));
        studentObjects.add(new Student("Jill Smith", 56, 65, 45, 34, 84));
        studentObjects.add(new Student("Sam Smith", 74, 36, 45, 64, 99));
        studentObjects.add(new Student("Patrick Smith", 45, 87, 64, 86, 35));


        System.out.println("Starting Gradebook: \n");
        printTable(studentObjects);


        System.out.println("\n<<Changing name of Sam Smith to Samuel Smith>>\n");
        changeName(studentObjects, "Sam Smith", "Samuel Smith");
        printTable(studentObjects);

        System.out.println("\n<<Changing Quiz 1 score of Jill Smitch to 100>>\n");
        changeOneQuizScore(studentObjects, "Jill Smith", 1, 100);
        printTable(studentObjects);

        System.out.println("\n<<Replacing Joe Smith with Manit Mishra, he will have all 99s and 100s>>\n");
        replaceStudent(studentObjects, "Joe Smith", "Manit Mishra", 99, 98, 97, 96, 100);
        printTable(studentObjects);

        System.out.println("\n<<Inserting a student before Patrick Smith named Wolf Smith>>\n");
        insertStudentBefore(studentObjects, "Patrick Smith", "Wolf Smith", 56, 45, 34, 78, 78);
        printTable(studentObjects);

        System.out.println("\n<<Removing Patrick Smith>>\n");
        removeStudent(studentObjects, "Patrick Smith");
        printTable(studentObjects);
    }

    public static void printTable(ArrayList<Student> studentObjects){
        System.out.println("Student name\t\t\tQ1\t\tQ2\t\tQ3\t\tQ4\t\tQ5");
        System.out.println("----------------------------------------------------------");

        for (Student element : studentObjects){
            System.out.printf("%-23s %s\t%6s\t%6s\t%6s\t%6s \n", element.getName(), element.getQuizScore(1),
                    element.getQuizScore(2), element.getQuizScore(3), element.getQuizScore(4),
                    element.getQuizScore(5));

        }
    }

    public static void changeName(ArrayList <Student> studentObjects, String findName, String replaceName){
        for (Student element : studentObjects){
            if (element.getName().equals(findName)){
                element.setName(replaceName);
            }
        }
    }

    public static void changeOneQuizScore(ArrayList <Student> studentObjects, String name, int quizNumber, int quizScore){
        for (Student element : studentObjects){
            if(element.getName().equals(name)){
                element.changeQuizScore(quizNumber, quizScore);
            }
        }
    }

    public static void replaceStudent(ArrayList <Student> studentObjects, String name, String newName, int quizScore1, int quizScore2,
                                      int quizScore3, int quizScore4, int quizScore5){
        for (Student element : studentObjects){
            if (element.getName().equals(name)){
                element.setName(newName);
                element.changeQuizScore(1, quizScore1);
                element.changeQuizScore(2, quizScore2);
                element.changeQuizScore(3, quizScore3);
                element.changeQuizScore(4, quizScore4);
                element.changeQuizScore(5, quizScore5);
            }
        }
    }

    public static void insertStudentBefore(ArrayList <Student> studentObjects, String nameToFind, String newName, int quizScore1,
                                           int quizScore2, int quizScore3, int quizScore4, int quizScore5){
        int location = 0;
        for (Student element : studentObjects){
            if(element.getName().equals(nameToFind)){
                location = studentObjects.indexOf(element);
            }
        }

        studentObjects.add(location, new Student(newName, quizScore1, quizScore2, quizScore3, quizScore4, quizScore5));
    }

    public static void removeStudent(ArrayList <Student> studentObjects, String name){
        int location = 0;
        for (Student element : studentObjects){
            if(element.getName().equals(name)){
                location = studentObjects.indexOf(element);
            }
        }

        studentObjects.remove(location);
    }
}