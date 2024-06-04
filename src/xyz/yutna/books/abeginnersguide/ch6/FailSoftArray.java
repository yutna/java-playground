package xyz.yutna.books.abeginnersguide.ch6;

// This class implements a "fail-soft" array which prevents runtime errors.
class FailSoftArray {
    public int length;

    private int[] a; // reference to array
    private int errVal; // value to return if get() fails

    // Construct array given its size and the value to return if get() fails.
    public FailSoftArray(int size, int errVal) {
        this.a = new int[size];
        this.errVal = errVal;
        this.length = size;
    }

    // Return value at given index.
    public int get(int index) {
        if (indexOK(index))
            return a[index];
        return errVal;
    }

    // Put a value at an index, Return false on failure.
    public boolean put(int index, int val) {
        if (indexOK(index)) {
            a[index] = val;
            return true;
        }

        return false;
    }

    // Return true if index is within bounds.
    private boolean indexOK(int index) {
        if ((index >= 0) & (index < length))
            return true;
        return false;
    }
}
