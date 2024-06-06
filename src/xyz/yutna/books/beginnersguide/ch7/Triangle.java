package xyz.yutna.books.beginnersguide.ch7;

// A subclass of TwoDShape for triangles.
public class Triangle extends TwoDShape {
    public String style;

    public double area() {
        // Triangle can refer to the memebers of TwoDShape as if they were declared by
        // Triangle
        return (width * height) / 2;
    }

    public void showStyle() {
        System.out.println("Triangle is " + style);
    }
}
