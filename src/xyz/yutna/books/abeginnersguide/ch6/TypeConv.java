package xyz.yutna.books.abeginnersguide.ch6;

// NOTE - Java automatic type conversion also apply to parameters of overlaoded methods.
// NOTE - The automatic conversions apply only if there is no direct match between a parameter and an argument.

public class TypeConv {
    public static void main(String[] args) {
        Overload2 ob = new Overload2();

        int i = 10;
        double d = 10.01;

        byte b = 99;
        short s = 10;
        float f = 11.5F;

        ob.f(i); // calls ob.f(int);
        ob.f(d); // calls ob.f(double);

        ob.f(b); // call ob.f(byte);
        ob.f(s); // call ob.f(int); - type conversion
        ob.f(f); // call ob.f(double) - type conversion
    }
}
