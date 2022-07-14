/**
 * Purpose: Client class for Student Object.
 *
 * @version 3/9/22
 * @ Manit Mishra
 */
public class Student {
    private String name;
    private int score1;
    private int score2;
    private int score3;
    private int score4;
    private int score5;

    public Student(String name, int score1, int score2, int score3, int score4, int score5){
        this.name = name;
        this.score1 = score1;
        this.score2 = score2;
        this.score3 = score3;
        this.score4 = score4;
        this.score5 = score5;
    }

    public int getQuizScore(int quizNumber){
        int quizScore = 0;
        if (quizNumber == 1){
            quizScore = score1;
        }
        else if (quizNumber == 2){
            quizScore = score2;
        }
        else if (quizNumber == 3){
            quizScore = score3;
        }
        else if (quizNumber == 4){
            quizScore = score4;
        }
        else if (quizNumber == 5){
            quizScore = score5;
        }
        return quizScore;
    }

    public void changeQuizScore(int quizNumber, int quizScore){
        if (quizNumber == 1){
            score1 = quizScore;
        }
        else if (quizNumber == 2){
            score2 = quizScore;
        }
        else if (quizNumber == 3){
            score3 = quizScore;
        }
        else if (quizNumber == 4){
            score4 = quizScore;
        }
        else if (quizNumber == 5){
            score5 = quizScore;
        }
    }

    public String getName(){return name;}

    public void setName(String newName){name = newName;}

    public String toString()
    {
        return String.format("%s got %s, %s, %s, %s, %s on their tests.", name, score1, score2, score3, score4, score5);
    }
}