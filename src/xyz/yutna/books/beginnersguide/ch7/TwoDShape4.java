package xyz.yutna.books.beginnersguide.ch7;

// Add constructors to TwoDShape4
public class TwoDShape4 {
    private double width;
    private double height;

    public TwoDShape4(double w, double h) {
        width = w;
        height = h;
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
