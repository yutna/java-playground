package xyz.yutna.books.abeginnersguide.ch5;

// Demonstrate an array overrun.
public class ArrayErr {
    public static void main(String[] args) {
        int[] sample = new int[10];
        int i;

        // Generate an array overrun
        for (i = 0; i < 100; i = i + 1) {
            sample[i] = i;
        }
    }
}
