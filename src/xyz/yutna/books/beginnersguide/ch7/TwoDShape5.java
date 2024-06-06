package xyz.yutna.books.beginnersguide.ch7;

// Add more constructors to TwoDShape5
public class TwoDShape5 {
    private double width;
    private double height;

    // A default constructor
    public TwoDShape5() {
        width = height = 0;
    }

    // Parameterized constructor
    public TwoDShape5(double w, double h) {
        width = w;
        height = h;
    }

    // Construct object with equal width and height
    public TwoDShape5(double x) {
        width = height = x;
    }

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
