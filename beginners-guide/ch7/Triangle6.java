// Use super() to call various forms of the TwoDShape5 constructor.
// A subclass of TwoDShape5 for triangles.
class Triangle6 extends TwoDShape5 {
    private String style;

    // A default constructor.
    Triangle6() {
        super();
        style = "none";
    }

    Triangle6(String s, double w, double h) {
        super(w, h);
        style = s;
    }

    Triangle6(double x) {
        super(x);
        style = "filled";
    }

    double area() {
        return getWidth() * getHeight() / 2;
    }

    void showStyle() {
        System.out.println("Triangle is " + style);
    }
}
