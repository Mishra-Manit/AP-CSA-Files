/**
 * Purpose: Display a "Hello, World!" message to the screen.
 *
 * @version or date
 * @ Manit Mishra
 */
public class SwapperTester
{
    public static void main(String[] args)
    {
        Swapper swapObj = new Swapper(20, 10);
        swapObj.swap();
        swapObj.print();
    }
}