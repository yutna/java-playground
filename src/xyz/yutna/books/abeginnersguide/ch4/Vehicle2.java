package xyz.yutna.books.abeginnersguide.ch4;

public class Vehicle2 {
    public int passengers;
    public int fuelcap;
    public int mpg;

    // This is a constructor for Vehicle
    public Vehicle2(int p, int f, int m) {
        passengers = p;
        fuelcap = f;
        mpg = m;
    }

    // Return the range
    public int range() {
        return mpg * fuelcap;
    }

    // Compute fuel needed for a given distance
    public double fuelNeeded(int miles) {
        return (double) miles / mpg;
    }
}
