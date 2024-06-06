// A subclass of TwoDShape for triangles.
class Triangle extends TwoDShape {
    String style;

    double area() {
        // Triangle can refer to the memebers of TwoDShape as if they were declared by
        // Triangle
        return (width * height) / 2;
    }

    void showStyle() {
        System.out.println("Triangle is " + style);
    }
}
