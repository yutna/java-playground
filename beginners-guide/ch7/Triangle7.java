class Triangle7 extends TwoDShape6 {
    private String style;

    Triangle7() {
        super();
        style = "none";
    }

    Triangle7(String s, double w, double h) {
        super(w, h);
        style = s;
    }

    Triangle7(double x) {
        super(x);
        style = "filled";
    }

    double area() {
        return getWidth() * getWidth() / 2;
    }

    void showStyle() {
        System.out.println("Triangle is " + style);
    }
}
