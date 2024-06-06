package xyz.yutna.books.beginnersguide.ch7;

// Use super() to call various forms of the TwoDShape5 constructor.

// A subclass of TwoDShape5 for triangles.
public class Triangle6 extends TwoDShape5 {
    private String style;

    // A default constructor.
    public Triangle6() {
        super();
        style = "none";
    }

    public Triangle6(String s, double w, double h) {
        super(w, h);
        style = s;
    }

    public Triangle6(double x) {
        super(x);
        style = "filled";
    }

    public double area() {
        return getWidth() * getHeight() / 2;
    }

    public void showStyle() {
        System.out.println("Triangle is " + style);
    }
}
