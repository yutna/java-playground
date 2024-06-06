package xyz.yutna.books.beginnersguide.ch7;

// NOTE - super() must always be the first statement executed inside a subclass constructor.

// A subclass of TwoDShape4 for triangles.
public class Triangle5 extends TwoDShape4 {
    private String style;

    public Triangle5(String s, double w, double h) {
        super(w, h); // call superclass constructor
        style = s;
    }

    public double area() {
        return getWidth() * getHeight() / 2;
    }

    public void showStyle() {
        System.out.println("Triangle is " + style);
    }
}
