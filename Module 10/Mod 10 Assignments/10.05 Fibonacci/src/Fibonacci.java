/**
 * Purpose: Calculate the fibonacci number for the userInput given.
 *
 * @version 4/11/22
 * @ Manit Mishra
 */
public class Fibonacci {
    public static int fibonacciNumber;

    public Fibonacci(int fibonacciNumber){
        this.fibonacciNumber = fibonacciNumber;
    }

    public void setFibonacciNumber(int fibonacciNumber) {
        Fibonacci.fibonacciNumber = fibonacciNumber;
    }

    public int getFibonacciNumber() {
        return fibonacciNumber;
    }

    public int calcFibonacci(int n){
        if (n == 0){
            return 0;
        }
        else if (n == 1){
            return 1;
        }
        else {
            return (calcFibonacci(n-1) + calcFibonacci(n-2));
        }
    }

}