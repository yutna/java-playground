class Triangle9 extends TwoDShape8 {
    private String style;

    Triangle9() {
        super();
        style = "none";
    }

    Triangle9(String s, double w, double h) {
        super(w, h, "triangle");
        style = s;
    }

    Triangle9(double x) {
        super(x, "triangle");
        style = "filled";
    }

    Triangle9(Triangle9 ob) {
        super(ob);
        style = ob.style;
    }

    double area() {
        return getWidth() * getHeight() / 2;
    }

    void showStyle() {
        System.out.println("Triangle is " + style);
    }
}
