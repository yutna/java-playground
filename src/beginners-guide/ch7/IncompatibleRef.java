class IncompatibleRef {
    public static void main(String[] args) {
        X x = new X(10);
        X x2;
        Y y = new Y(5);

        x2 = x; // OK, both the same type
        // x2 = y; // Error, not of same type

        System.out.println(x2.a);
        System.out.println(y.a);
    }
}
