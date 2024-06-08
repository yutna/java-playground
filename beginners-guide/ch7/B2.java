class B2 extends A2 {
    int k;

    B2(int a, int b, int c) {
        super(a, b);
        k = c;
    }

    // This show() in B2 overrides the one defined by A
    void show() {
        super.show(); // Use `super` to call the version of `show()` defined by superclass A.
        System.out.println("k: " + k);
    }
}
