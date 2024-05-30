package xyz.yutna.book.beginnerguide.ch2;

// Side effects can be important.
public class SideEffects {
    public static void main(String[] args) {
        int i;

        i = 0;

        // Here, `i` is still incremented even though the if statement fails.
        if (false & (++i < 100)) {
            System.out.println("this won't be displayed");
        }

        System.out.println("if statement executed: " + i);

        // In this case, `i` is NOT incremented because the short-circuit
        // operator skips the increment.
        if (false && (++i < 100)) {
            System.out.println("this won't be displayed");
        }

        System.out.println("if statement executed: " + i); // still 1!!
    }
}
