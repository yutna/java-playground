package xyz.yutna.books.abeginnersguide.ch6;

// Display a string backwards using recursion.
public class Backwards {
    public String str;

    public Backwards(String s) {
        str = s;
    }

    public void backwards(int idx) {
        if (idx != str.length() - 1)
            backwards(idx + 1);
        System.out.print(str.charAt(idx));
    }
}
