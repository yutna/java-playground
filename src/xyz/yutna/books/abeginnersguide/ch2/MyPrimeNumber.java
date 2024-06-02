package xyz.yutna.books.abeginnersguide.ch2;

// My solution for listing prime numbers between 2 and 100.
public class MyPrimeNumber {
    public static void main(String[] args) {
        int a, b, counter = 0;

        for (int i = 2; i <= 100; i++) {
            a = b = i;

            if ((i == 2) || (i == 3)) {
                counter = 0;
            }

            if (i > 3) {
                counter += 1;
                a = (6 * counter) - 1;
                b = (6 * counter) + 1;
            }

            if ((a == b) || (((a % 5) != 0) && (a <= 100))) {
                System.out.println(a + " is prime");
            }

            if ((a != b) && (((b % 5) != 0) && (b <= 100))) {
                System.out.println(b + " is prime");
            }
        }
    }
}
