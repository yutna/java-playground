// Private members are **NOT** inherited.
// This example will NOT compile
// A class for two-dimensional objects.
class TwoDShape2 {
    private double width;
    private double height;

    void showDim() {
        System.out.println("Width and Height are " + width + " and " + height);
    }
}
