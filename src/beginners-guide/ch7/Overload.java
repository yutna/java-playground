// NOTE - Method overriding occurs only when signatures of the two methods are identical.
// If they are NOT, then the two methods are simply overloaded.
class Overload {
    public static void main(String[] args) {
        B3 subOb = new B3(1, 2, 3);

        subOb.show("This is k: "); // This calls `show()` in B
        subOb.show(); // This calls `show()` in A
    }
}
