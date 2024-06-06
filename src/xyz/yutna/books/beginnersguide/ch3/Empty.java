package xyz.yutna.books.beginnersguide.ch3;

// Parts of the for can be empty.
public class Empty {
    public static void main(String[] args) {
        int i;

        // The iteration expression is missing
        for (i = 0; i < 10;) {
            System.out.println("Pass #" + i);
            i++; // increment loop control var
        }
    }
}
