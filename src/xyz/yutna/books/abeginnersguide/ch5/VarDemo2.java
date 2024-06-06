package xyz.yutna.books.abeginnersguide.ch5;

public class VarDemo2 {
    public static void main(String[] args) {
        var mc = new MyClass(10); // Notice the use of var here.

        System.out.println("Value of i in mc is " + mc.geti());
        mc.seti(19);
        System.out.println("Value of i in mc is now " + mc.geti());

        // Check using local variable type inference in a for-loop at `VarDemo3.java`
    }
}
