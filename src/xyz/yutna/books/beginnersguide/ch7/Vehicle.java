package xyz.yutna.books.beginnersguide.ch7;

public class Vehicle {
    private int passengers; // number of passengers
    private int fuelCap; // fuel capacity in gallons
    private int mpg; // fuel consumption in miles per gallon

    public Vehicle(int p, int f, int m) {
        passengers = p;
        fuelCap = f;
        mpg = m;
    }

    public int range() {
        return mpg * fuelCap;
    }

    // Compute fuel needed for a given distance.
    public double fuelNeeded(int miles) {
        return (double) miles / mpg;
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int p) {
        passengers = p;
    }

    public int getFuelCap() {
        return fuelCap;
    }

    public void setFuelCap(int f) {
        fuelCap = f;
    }

    public int getMpg() {
        return mpg;
    }

    public void setMpg(int m) {
        mpg = m;
    }
}
