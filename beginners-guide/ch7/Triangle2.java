// NOTE - Remember that a class member that has been declared **private** will remain private to its class.
// It is NOT accessible by any code outside its class, including subclass.
class Triangle2 extends TwoDShape2 {
    String style;

    double area() {
        // Can NOT access a private member of a superclass
        // return (width * height) / 2; // Error! can't access
        return 0.0;
    }

    void showStyle() {
        System.out.println("Triangle is " + style);
    }
}
