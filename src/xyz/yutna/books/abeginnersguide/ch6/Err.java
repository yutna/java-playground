package xyz.yutna.books.abeginnersguide.ch6;

// Return a programmer-defined object.
public class Err {
    public String msg; // error message
    public int severity; // code indicating severity of error

    public Err(String m, int s) {
        msg = m;
        severity = s;
    }
}
