package xyz.yutna.books.abeginnersguide.ch2;

// Demonstrate automatic conversion from long to double
class LtoD {
    public static void main(String[] args) {
        long L;
        double D;

        L = 100123285L;
        D = L; // automatic conversion from long to double
        // L = D; // No automatic conversion form double to long, compile error.

        System.out.println("L and D: " + L + " " + D);
    }
}
