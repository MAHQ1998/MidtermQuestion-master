package math.problems;

public class Factorial<i, number> {

    public static void main(String[] args) {

        /*
         * factorial of 5! = 5 x 4 x 3 x 2 x 1 = 120.
         * write a java program to find factorial of a given number using recursion as well as iteration.
         *
         */


        int i, factorial = 1;
        int number = 5;
        factorial = factorial(number);
        System.out.println("Factorial of " + number + " is: " + factorial);
    }

    static int factorial(int n) {
        if (n == 0)
            return 1;
        else
            return (n * factorial(n - 1));
    }

}










