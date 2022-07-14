/**
 * Purpose: Display a "Hello, World!" message to the screen.
 *
 * @version or date
 * @ Manit Mishra
 */
public class Testing {
    public static void main(String[] args) {
        String a = "Mathematics";
        String b = "Computer Science";
        String c = (a + " and " + b);
        int n = c.length();
        int m = a.indexOf( "the" );
        int p = a.indexOf( "math" );
        String d = b.substring( 3, 5 );
        String e = b.substring( b.indexOf( "S" ) );

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(n);
        System.out.println(m);
        System.out.println(p);
        System.out.println(d);
        System.out.println(e);


    }
}