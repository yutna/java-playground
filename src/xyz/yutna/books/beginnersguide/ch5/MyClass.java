package xyz.yutna.books.beginnersguide.ch5;

// Local variable type interence with a user-defined class type.
public class MyClass {
    private int i;

    public MyClass(int k) {
        i = k;
    }

    public int geti() {
        return i;
    }

    public void seti(int k) {
        if (k >= 0)
            i = k;
    }
}
