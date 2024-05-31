package xyz.yutna.book.beginnerguide.ch3;

/*
 * Keep in mind that you CANNOT `break` to any label that is NOT defined for an
 * enclosing block.
 */

// this program contains an error
public class BreakErr {
    public static void main(String[] args) {
        one: for (int i = 0; i < 3; i++) {
            System.out.print("Pass " + i + ": ");
        }

        for (int j = 0; j < 100; j++) {
            // Since the loop labeled `one` does NOT enclose the `break`
            // statement, it is NOT possible to transfer control to that block.
            // if (j == 10) break one; // WRONG
            System.out.println(j + " ");
        }
    }
}
