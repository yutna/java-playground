// A mutilevel hierarchy
class TwoDShape6 {
    private double width;
    private double height;

    TwoDShape6() {
        width = height = 0;
    }

    TwoDShape6(double w, double h) {
        width = w;
        height = h;
    }

    TwoDShape6(double x) {
        width = height = x;
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
