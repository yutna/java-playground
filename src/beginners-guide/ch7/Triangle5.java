// NOTE - super() must always be the first statement executed inside a subclass constructor.
// A subclass of TwoDShape4 for triangles.
class Triangle5 extends TwoDShape4 {
    private String style;

    Triangle5(String s, double w, double h) {
        super(w, h); // call superclass constructor
        style = s;
    }

    double area() {
        return getWidth() * getHeight() / 2;
    }

    void showStyle() {
        System.out.println("Triangle is " + style);
    }
}
