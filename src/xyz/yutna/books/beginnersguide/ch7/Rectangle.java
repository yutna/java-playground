package xyz.yutna.books.beginnersguide.ch7;

// A subclass of TwoDShape for rectangle
public class Rectangle extends TwoDShape {
    public boolean isSquare() {
        if (width == height)
            return true;

        return false;
    }

    public double area() {
        return width * height;
    }
}
