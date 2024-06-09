class Triangle10 extends TwoDShape9 {
    private String style;

    Triangle10() {
        super();
        style = "none";
    }

    Triangle10(String s, double w, double h) {
        super(w, h, "triangle");
        style = s;
    }

    Triangle10(double x) {
        super(x, "triangle");
        style = "filled";
    }

    Triangle10(Triangle10 ob) {
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
