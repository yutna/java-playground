// Extend Vehicle to create a Truck specialization.
class Truck extends Vehicle {
    private int cargoCap; // cargo capacity in pounds

    Truck(int p, int f, int m, int c) {
        super(p, f, m);
        cargoCap = c;
    }

    int getCargo() {
        return cargoCap;
    }

    void putCargo(int c) {
        cargoCap = c;
    }
}
