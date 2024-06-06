package xyz.yutna.books.abeginnersguide.ch6;

/*
 * NOTE - A static block is executed when the class is first loaded.
 * Thus it is executed before the class can be used for any other purpose.
 */

public class StaticBlock {
    public static double rootOf2;
    public static double rootOf3;

    // This block is executed when the class is loaded.
    static {
        System.out.println("Inside static block.");

        rootOf2 = Math.sqrt(2.0);
        rootOf3 = Math.sqrt(3.0);
    }

    public StaticBlock(String msg) {
        System.out.println(msg);
    }
}
