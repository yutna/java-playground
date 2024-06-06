package xyz.yutna.books.abeginnersguide.ch6;

public class MyClass {
    private int alpha;
    public int beta;
    public int gamma;

    /*
     * Methods to access alpha. It is OK for a member of a class to access a private
     * member of the same class.
     */
    public void setAlpha(int a) {
        alpha = a;
    }

    public int getAlpha() {
        return alpha;
    }
}
