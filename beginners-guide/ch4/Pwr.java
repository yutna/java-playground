class Pwr {
    double b;
    int e;
    double val;

    Pwr(double b, int e) {
        this.b = b;
        this.e = e;
        this.val = 1;

        if (e == 0)
            return;

        for (; e > 0; e--)
            val *= b;
    }

    double getVal() {
        return this.val;
    }
}
