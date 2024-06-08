class Rectangle3 extends TwoDShape9 {
    Rectangle3() {
        super();
    }

    Rectangle3(double w, double h) {
        super(w, h, "rectangle");
    }

    Rectangle3(double x) {
        super(x, "reactangle");
    }

    Rectangle3(Rectangle3 ob) {
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
