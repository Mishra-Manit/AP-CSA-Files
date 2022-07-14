/**
 * Purpose: Methods to make the Student Objects
 *
 * @version 1/8/2022
 * @ Manit Mishra
 */

public class Student {
    private String n;
    private double g1;
    private double g2;

    //Only 1 parameter construcor
    public Student(String name){
        n = name;
        g1 = 0.0;
        g2 = 0.0;
    }

    //3 parameter constructor
    public Student(String name, double grade1, double grade2){
        n = name;
        g1 = grade1;
        g2 = grade2;
    }

    //Accessor Methods
    public String getName(){return n;}

    public double getGrade1(){return g1;}

    public double getGrade2(){return g2;}

    //Setter Methods
    public void setName(String name){n = name;}

    public void setGrade1(double grade1){g1 = grade1;}

    public void setGrade2(double grade2){g2 = grade2;}


    public double calcDifference(){
        double difference = g1 - g2;
        return difference;
    }

    //OverLoaded Method
    public double calcDifference(double g1, double g2){
        double difference = g1 - g2;
        return difference;
    }

    public double calcAverage(){
        double average = (g1 + g2) / 2;
        return average;
    }

    //OverloadedMethod
    public double calcAverage(double g1, double g2){
        double average = (g1 + g2) / 2;
        return average;
    }

    public String toString() {

        return String.format("%-18s %-14.1f %-13.1f", getName(), getGrade1(), getGrade2());
    }

}