package xyz.yutna.books.beginnersguide.ch3;

// Move more out of the for loop:
public class Empty2 {
    public static void main(String[] args) {
        int i;

        i = 0; // move initialization out of loop
        for (; i < 10;) {
            System.out.println("Pass #" + i);
            i++; // increment the loop control var
        }
    }
}
