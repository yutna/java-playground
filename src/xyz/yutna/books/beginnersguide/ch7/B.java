package xyz.yutna.books.beginnersguide.ch7;

// NOTE - Although the instance variable `i` in `B` hides the `i` in `A`.
// `super` allows access to the `i` defined in the superclass.
// `super` can also be used to call methods that are hidden by a subclass.

public class B extends A {
    public int i; // this i hides the i in A

    public B(int a, int b) {
        super.i = a; // i in A
        i = b; // i in B
    }

    public void show() {
        System.out.println("i in superclass: " + super.i);
        System.out.println("i in subclass: " + i);
    }
}
