class B3 extends A3 {
    int k;

    B3(int a, int b, int c) {
        super(a, b);
        k = c;
    }

    // Overload `show()`
    // Because signatures differ, this `show()` simply overloads `show()` in
    // superclass A.
    void show(String msg) {
        System.out.println(msg + k);
    }
}
