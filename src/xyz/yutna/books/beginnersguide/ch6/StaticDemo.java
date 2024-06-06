package xyz.yutna.books.beginnersguide.ch6;

// Use a static variable.
public class StaticDemo {
    public int x; // a normal instance variable
    public static int y; // a static variable

    // Return the sum of the instance variable x and the static variable y
    public int sum() {
        return x + y;
    }
}
