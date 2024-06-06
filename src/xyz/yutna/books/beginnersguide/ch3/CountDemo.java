package xyz.yutna.books.beginnersguide.ch3;

// Use continue
public class CountDemo {
    public static void main(String[] args) {
        int i;

        // print even numbers between 0 and 100
        for (i = 0; i <= 100; i++) {
            if ((i % 2) != 0)
                continue; // iterate
            System.out.println(i);
        }
    }
}
