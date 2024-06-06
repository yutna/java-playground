package xyz.yutna.books.beginnersguide.ch6;

public class Overload2 {
    public void f(byte x) {
        System.out.println("Inside f(byte): " + x);
    }

    public void f(int x) {
        System.out.println("Inside f(int): " + x);
    }

    public void f(double x) {
        System.out.println("Inside f(double): " + x);
    }
}
