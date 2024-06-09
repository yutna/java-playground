class Circle extends TwoDShape9 {
    Circle() {
        super();
    }

    Circle(double r) {
        super(r, "circle");
    }

    Circle(Circle ob) {
        super(ob);
    }

    double area() {
        return Math.PI * (getWidth() / 2) * (getWidth() / 2);
    }
}
