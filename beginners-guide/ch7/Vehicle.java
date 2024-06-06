class Vehicle {
    private int passengers; // number of passengers
    private int fuelCap; // fuel capacity in gallons
    private int mpg; // fuel consumption in miles per gallon

    Vehicle(int p, int f, int m) {
        passengers = p;
        fuelCap = f;
        mpg = m;
    }

    int range() {
        return mpg * fuelCap;
    }

    // Compute fuel needed for a given distance.
    double fuelNeeded(int miles) {
        return (double) miles / mpg;
    }

    int getPassengers() {
        return passengers;
    }

    void setPassengers(int p) {
        passengers = p;
    }

    int getFuelCap() {
        return fuelCap;
    }

    void setFuelCap(int f) {
        fuelCap = f;
    }

    int getMpg() {
        return mpg;
    }

    void setMpg(int m) {
        mpg = m;
    }
}
