class TwoDShape8 {
    private double width;
    private double height;
    private String name;

    TwoDShape8() {
        width = height = 0.0;
        name = "none";
    }

    TwoDShape8(double w, double h, String n) {
        width = w;
        height = h;
        name = n;
    }

    TwoDShape8(double x, String n) {
        width = height = x;
        name = n;
    }

    TwoDShape8(TwoDShape8 ob) {
        width = ob.width;
        height = ob.height;
        name = ob.name;
    }

    double getWidth() {
        return width;
    }

    double getHeight() {
        return height;
    }

    String getName() {
        return name;
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

    double area() {
        System.out.println("area() must be overridden");
        return 0.0;
    }
}
