package xyz.yutna.books.abeginnersguide.ch6;

// Varargs, overloading and ambiguity.
// This program contains an error and will NOT compile
class VarArgs4 {
    public static void main(String[] args) {
        vaTest(1, 2, 3); // OK
        vaTest(true, false, false); // OK

        // vaTest(); // Error: Ambiguous;
    }

    // Use an int vararg parameter.
    static void vaTest(int... v) {
        // ...
    }

    // Use a boolean vararg parameter
    static void vaTest(boolean... v) {
        // ...
    }
}
