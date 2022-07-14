/**
 * Purpose: Display a "Hello, World!" message to the screen.
 *
 * @version or date
 * @ Manit Mishra
 */
public class ReverseWord {
    public static void reverseString(String name){

        if (name.isEmpty()){
            System.out.println();
        }
        else{
            System.out.println(name.charAt(name.length()-1));
            reverseString(name.substring(0, name.length()-1));
        }
    }

    public static void main(String[] args){
        reverseString("Manoj");
    }
}