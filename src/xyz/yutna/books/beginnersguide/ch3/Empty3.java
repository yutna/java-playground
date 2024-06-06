package xyz.yutna.books.beginnersguide.ch3;

// The body of a loop can be empty.
public class Empty3 {
    public static void main(String[] args) {
        int i;
        int sum = 0;

        // sum the numbers through 5
        for (i = 1; i <= 5; sum += i++)
            ; // No body in this loop!

        System.out.println("Sum is " + sum);
    }
}
