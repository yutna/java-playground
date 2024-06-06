// NOTE - One of the most reason that constructors are overloaded is to allow one object to initialize another.

// Initialize one object with another.
class Summation {
    int sum;

    // Construct from an int.
    Summation(int num) {
        sum = 0;
        for (int i = 0; i <= num; i++) {
            sum += i;
        }
    }

    // Construct from another object.
    Summation(Summation ob) {
        sum = ob.sum;
    }
}
