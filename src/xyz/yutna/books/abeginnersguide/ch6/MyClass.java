package xyz.yutna.books.abeginnersguide.ch6;

class MyClass {
    private int alpha;
    public int beta;
    int gamma;

    /*
     * Methods to access alpha. It is OK for a member of a class to access a private
     * member of the same class.
     */
    void setAlpha(int a) {
        alpha = a;
    }

    int getAlpha() {
        return alpha;
    }
}
