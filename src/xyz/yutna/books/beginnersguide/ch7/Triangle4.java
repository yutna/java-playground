package xyz.yutna.books.beginnersguide.ch7;

// Add a constructor to Triangle
public class Triangle4 extends TwoDShape3 {
    private String style;

    public Triangle4(String s, double w, double h) {
        setWidth(w);
        setHeight(h);
        style = s;
    }

    public double area() {
        return getWidth() * getHeight() / 2;
    }

    public void showStyle() {
        System.out.println("Triangle is " + style);
    }
}
