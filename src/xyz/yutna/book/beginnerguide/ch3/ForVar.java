package xyz.yutna.book.beginnerguide.ch3;

// Declare loop control variable inside the for.
public class ForVar {
    public static void main(String[] args) {
        int sum = 0;
        int fact = 1;

        // compute the factorial of the numbers through 5
        // The variable i is declared inside the `for` statement.
        for (int i = 1; i <= 5; i++) {
            sum += i;
            fact *= i;
        }

        // but, `i` is NOT known here

        System.out.println("Sum is " + sum);
        System.out.println("Factorial is " + fact);
    }
}
