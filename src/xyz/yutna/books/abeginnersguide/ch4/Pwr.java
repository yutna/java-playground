package xyz.yutna.books.abeginnersguide.ch4;

public class Pwr {
    public double b;
    public int e;
    public double val;

    public Pwr(double b, int e) {
        this.b = b;
        this.e = e;
        this.val = 1;

        if (e == 0)
            return;

        for (; e > 0; e--)
            val *= b;
    }

    public double getVal() {
        return this.val;
    }
}
