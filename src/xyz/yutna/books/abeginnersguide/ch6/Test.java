package xyz.yutna.books.abeginnersguide.ch6;

// Primitive types are passed by value.
public class Test {
    // This method causes no change to the arugments used in the call.
    public void noChange(int i, int j) {
        i = i + j;
        j = -j;
    }
}
