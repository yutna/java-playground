// Local variable type interence with a user-defined class type.
class MyClass {
    private int i;

    MyClass(int k) {
        i = k;
    }

    int geti() {
        return i;
    }

    void seti(int k) {
        if (k >= 0)
            i = k;
    }
}
