package xyz.yutna.books.beginnersguide.ch7;

public class Triangle3 extends TwoDShape3 {
    public String style;

    public double area() {
        return getWidth() * getHeight() / 2;
    }

    public void showStyle() {
        System.out.println("Triangle is " + style);
    }
}
