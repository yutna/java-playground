// NOTE - Remember, the varargs parameter must be last.
// NOTE - There is one more restriction to be aware of: there must be only **one** varargs parameter.

// Use varargs with standard arguments.
class VarArgs2 {
    public static void main(String[] args) {
        vaTest("One vararg: ", 10);
        vaTest("Three varargs: ", 1, 2, 3);
        vaTest("No varargs: ");
    }

    // Here, msg is a normal parameter and v is a varargs parameter.
    static void vaTest(String msg, int... v) {
        System.out.println(msg + v.length);
        System.out.println("Contents: ");

        for (int i = 0; i < v.length; i++)
            System.out.println("  arg " + i + ": " + v[i]);
        System.out.println();
    }
}
