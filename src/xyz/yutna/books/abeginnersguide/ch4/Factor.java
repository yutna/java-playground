package xyz.yutna.books.abeginnersguide.ch4;

public class Factor {
    public boolean isFactor(int a, int b) {
        if ((b % a) == 0)
            return true;
        else
            return false;
    }
}
