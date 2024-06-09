// A simple example of recursion.
class Factorial {
    // This is a recursive function.
    int facR(int n) {
        int result;

        if (n == 1)
            return 1;

        result = n * facR(n - 1);

        return result;
    }

    // This is an iterative equivalent.
    int facI(int n) {
        int t, result;

        result = 1;
        for (t = 1; t <= n; t++)
            result *= t;

        return result;
    }
}
