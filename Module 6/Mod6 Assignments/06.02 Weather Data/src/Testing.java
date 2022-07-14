/**
 * Purpose: Display a "Hello, World!" message to the screen.
 *
 * @version or date
 * @ Manit Mishra
 */
public class Testing {
    public static void main(String[] args) {

        String[] mascots = { "Knights", "Seminoles", "Bulls", "Gators" };
        int n = -1;
        String str = "";

        for (String m : mascots)
        {
            n = m.indexOf("i") + 2;
            str += m.substring(n);
        }
        System.out.println(str);
    }
}