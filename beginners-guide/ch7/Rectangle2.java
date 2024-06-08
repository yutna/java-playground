class Rectangle2 extends TwoDShape8 {
    Rectangle2() {
        super();
    }

    Rectangle2(double w, double h) {
        super(w, h, "rectangle");
    }

    Rectangle2(double x) {
        super(x, "rectangle");
    }

    Rectangle2(Rectangle2 ob) {
        super(ob);
    }

    boolean isSquare() {
        if (getWidth() == getHeight())
            return true;
        return false;
    }

    double area() {
        return getWidth() * getHeight();
    }
}
