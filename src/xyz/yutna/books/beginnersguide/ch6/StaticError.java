package xyz.yutna.books.beginnersguide.ch6;

public class StaticError {
    public int denom = 3; // a normal instance variable
    public static int val = 1024; // a static variable

    // Error! Can't access a non-static variable from within a static method.
    // static int valDivDenom() {
    // return val / denom; // won't compile.
    // }
}
