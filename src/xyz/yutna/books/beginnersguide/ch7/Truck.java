package xyz.yutna.books.beginnersguide.ch7;

// Extend Vehicle to create a Truck specialization.
public class Truck extends Vehicle {
    private int cargoCap; // cargo capacity in pounds

    public Truck(int p, int f, int m, int c) {
        super(p, f, m);
        cargoCap = c;
    }

    public int getCargo() {
        return cargoCap;
    }

    void putCargo(int c) {
        cargoCap = c;
    }
}
