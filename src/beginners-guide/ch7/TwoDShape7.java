class TwoDShape7 {
    private double width;
    private double height;

    // A default constructor
    TwoDShape7() {
        width = height = 0;
    }

    // Parameterized constructor
    TwoDShape7(double w, double h) {
        width = w;
        height = h;
    }

    // Construct an object with equal width and height
    TwoDShape7(double x) {
        width = height = x;
    }

    // Constructor an object from an object.
    TwoDShape7(TwoDShape7 ob) {
        width = ob.width;
        height = ob.height;
    }

    double getWidth() {
        return width;
    }

    double getHeight() {
        return height;
    }

    void setWidth(double w) {
        width = w;
    }

    void setHeight(double h) {
        height = h;
    }

    void showDim() {
        System.out.println("Width and height are " + width + " and " + height);
    }
}
