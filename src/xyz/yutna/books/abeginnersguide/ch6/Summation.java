package xyz.yutna.books.abeginnersguide.ch6;

// NOTE - One of the most reason that constructors are overloaded is to allow one object to initialize another.

// Initialize one object with another.
public class Summation {
    public int sum;

    // Construct from an int.
    public Summation(int num) {
        sum = 0;
        for (int i = 0; i <= num; i++) {
            sum += i;
        }
    }

    // Construct from another object.
    public Summation(Summation ob) {
        sum = ob.sum;
    }
}
