package xyz.yutna.books.beginnersguide.ch6;

// Demonstrate an overloaded constructor.
public class MyClass2 {
    public int x;

    public MyClass2() {
        System.out.println("Inside MyClass2().");
        x = 0;
    }

    public MyClass2(int i) {
        System.out.println("Inside MyClass2(int).");
        x = i;
    }

    public MyClass2(double d) {
        System.out.println("Inside MyClass2(double).");
        x = (int) d;
    }

    public MyClass2(int i, int j) {
        System.out.println("Inside MyClass2(int, int).");
        x = i * j;
    }
}
