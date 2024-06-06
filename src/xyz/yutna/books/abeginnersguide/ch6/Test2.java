package xyz.yutna.books.abeginnersguide.ch6;

// Objects are passed through their references.
public class Test2 {
    public int a, b;

    public Test2(int i, int j) {
        a = i;
        b = j;
    }

    // Pass an object, Now, ob.a and ob.b in object used in the call will be
    // chagned.
    public void change(Test2 ob) {
        ob.a = ob.a + ob.b;
        ob.b = -ob.b;
    }
}
