package xyz.yutna.books.abeginnersguide.ch3;

/*
 * NOTE: when used inside a set of nested loops, the `break` statement will
 * break out of only the **innermost** loop.
 *
 * NOTE: the `break` that terminates a `switch` statement affects only that
 * `switch` statement and NOT any enclosing loops.
 */

// Using break with nested loops.
class Break3 {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            System.out.println("Outer loop count: " + i);
            System.out.print("    Inner loop count: ");

            int t = 0;
            while (t < 100) {
                if (t == 10) break; // terminate loop if t is 20
                System.out.print(t + " ");
                t++;
            }

            System.out.println();
        }

        System.out.println("Loops complete.");
    }
}
