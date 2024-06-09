// NOTE - In a class hierarchy, if a superclass constructor requires parameters,
// then all subclasses must pass those parameters "up the line".
// This is true whether or not a subclass needs parameters of its own.

class Shape6 {
    public static void main(String[] args) {
        ColorTriangle t1 = new ColorTriangle("Blue", "outlined", 8.0, 12.0);
        ColorTriangle t2 = new ColorTriangle("Red", "filled", 2.0, 2.0);

        System.out.println("Info for t1: ");
        t1.showStyle();
        t1.showDim();
        t1.showColor();
        System.out.println("Area is " + t1.area());

        System.out.println();

        System.out.println("Info for t2: ");
        t2.showStyle();
        t2.showDim();
        t2.showColor();
        System.out.println("Area is " + t2.area());
    }
}
