package xyz.yutna.books.abeginnersguide.ch4;

class Vehicle2 {
    int passengers;
    int fuelcap;
    int mpg;

    // This is a constructor for Vehicle
    Vehicle2(int p, int f, int m) {
        passengers = p;
        fuelcap = f;
        mpg = m;
    }

    // Return the range
    int range() {
        return mpg * fuelcap;
    }

    // Compute fuel needed for a given distance
    double fuelNeeded(int miles) {
        return (double) miles / mpg;
    }
}
