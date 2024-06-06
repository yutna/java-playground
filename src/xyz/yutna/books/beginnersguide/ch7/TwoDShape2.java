package xyz.yutna.books.beginnersguide.ch7;

// Private members are **NOT** inherited.
// This example will NOT compile
// A class for two-dimensional objects.
public class TwoDShape2 {
    private double width;
    private double height;

    public void showDim() {
        System.out.println("Width and Height are " + width + " and " + height);
    }
}
