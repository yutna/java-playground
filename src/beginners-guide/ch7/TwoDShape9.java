// NOTE - The abstract modifier can be used only on instance methods. It CANNOT be applied to static methods or to constructors.
// NOTE - A class that contains one or more abstract methods must also be declared as abstract by preceding its class declaration with the abstract modifier.
// NOTE - An abstract class does NOT define a complete implementation, there can bo no objects of an abstract class. Thus, attempting to create an object of an
// abstract class by using **new** will result in a compile-time error.
abstract class TwoDShape9 {
    private double width;
    private double height;
    private String name;

    TwoDShape9() {
        width = height = 0;
        name = "none";
    }

    TwoDShape9(double w, double h, String n) {
        width = w;
        height = h;
        name = n;
    }

    TwoDShape9(double x, String n) {
        width = height = x;
        name = n;
    }

    TwoDShape9(TwoDShape9 ob) {
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

    void setWidth(double w) {
        width = w;
    }

    void setHeight(double h) {
        height = h;
    }

    String getName() {
        return name;
    }

    void showDim() {
        System.out.println("Width and height are " + width + " and " + height);
    }

    abstract double area();
}
