package xyz.yutna.books.abeginnersguide.ch4;

public class Vehicle {
    public int passengers; // number of passengers
    public int fuelcap; // fuel capacity in gallons
    public int mpg; // fuel consumption in miles per gallon

    // Display the range
    public int range() {
        // Notice that fuelcap and mpg are used directly, without the dot
        // operator. 🤔 สมัยก่อนมันต้องใช้ `this` เปล่านะ
        return fuelcap * mpg;
    }

    // Compute fuel needed for a given distance.
    public double fuelNeeded(int miles) {
        return (double) miles / mpg;
    }
}
