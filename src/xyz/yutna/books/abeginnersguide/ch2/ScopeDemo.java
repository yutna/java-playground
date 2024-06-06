package xyz.yutna.books.abeginnersguide.ch2;

// Demonstrate block scope.
public class ScopeDemo {
    public static void main(String[] args) {
        int x; // known to all code within main

        x = 10;
        if (x == 10) { // start new scope
            int y = 20; // known only to this block
            // x and y both known here.
            System.out.println("x and y: " + x + " " + y);
            x = y * 2;
        }
        // y = 100; // Error! y NOT known here

        // x still known here.
        System.out.println("x is " + x);
    }
}
