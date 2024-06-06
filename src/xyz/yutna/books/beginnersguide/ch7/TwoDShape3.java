package xyz.yutna.books.beginnersguide.ch7;

// Use accessor methods to set and get private members.
// A class for two-dimensional objects.
public class TwoDShape3 {
    private double width;
    private double height;

    // Access methods for width and height.

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setWidth(double w) {
        width = w;
    }

    public void setHeight(double h) {
        height = h;
    }

    public void showDim() {
        System.out.println("Width and height are " + width + " and " + height);
    }
}
