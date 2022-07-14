import java.util.ArrayList;

/**
 * Purpose: Print out the centers of each object
 *
 * @version 3/23/2022
 * @ Manit Mishra
 */
public class CircularTester {
    public static void main(String[] args) {
        ArrayList<Circle2> circles = new ArrayList<Circle2>(4);

        circles.add(new Circle2(2, 4, 5));
        circles.add(new Cylinder2(10, 15, 15, 20));
        circles.add(new Oval2(25, 10, 30, 40));
        circles.add(new OvalCylinder2(40, 10, 10, 20, 30));

        showCenter(circles, "Circle");
        showCenter(circles, "Cylinder");
        showCenter(circles, "Oval");
        showCenter(circles, "OvalCylinder");
    }

    public static void showCenter(ArrayList<Circle2> circles, String shape){
        for (Circle2 element : circles){
            String className = element.getClass().getName();
            String substringClassName = className.substring(0, className.length()-1);

            if (substringClassName.equalsIgnoreCase(shape)){
                System.out.println("For this " + className + " the " + element.getCenter());
            }
        }
    }
}