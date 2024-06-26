// NOTE - The static methods they can directly call only other **static** methods in their class.
// NOTE - The static methods they can directly access only **static** variables in their class.
// NOTE - The static methods they do NOT have a **this** reference.

// Use a static method.
class StaticMeth {
    static int val = 1024; // a static variable

    // a static method
    static int valDiv2() {
        return val / 2;
    }
}
