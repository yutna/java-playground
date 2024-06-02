package xyz.yutna.books.abeginnersguide.ch4;

public class Vehicle {
    int passengers; // number of passengers
    int fuelcap;    // fuel capacity in gallons
    int mpg;        // fuel consumption in miles per gallon

    // Display the range
    int range() {
        // Notice that fuelcap and mpg are used directly, without the dot
        // operator. 🤔 สมัยก่อนมันต้องใช้ `this` เปล่านะ
        return fuelcap * mpg;
    }

    // Compute fuel needed for a given distance.
    double fuelNeeded(int miles) {
        return (double) miles / mpg;
    }
}
