// NOTE - Varargs can be called with zero or more argument.
// Futuremore, it causes v to be implicitly declared as an array of type int[].
// Thus, inside vaTest(), v is accessed using the normal array syntax.

// NOTE - A method can have `normal` parameters along with a variable-length parameter.
// However, the variable-length parameter must be the last parameter declared by the
// method.
// int doIt(int a, int b, double c, int... vals)
// LINK - ./VarArgs2.java

// Demonstrate variable-length arguments.
class VarArgs {
    public static void main(String[] args) {
        // Notice how vaTest() can be called with a variable number of arguments.
        vaTest(10); // 1 arg
        vaTest(1, 2, 3); // 3 args
        vaTest(); // no args
    }

    static void vaTest(int... v) {
        System.out.println("Number of args: " + v.length);
        System.out.println("Contents: ");

        for (int i = 0; i < v.length; i++)
            System.out.println(" arg " + i + ": " + v[i]);
        System.out.println();
    }
}
