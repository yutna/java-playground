package xyz.yutna.books.abeginnersguide.ch1;

/*
 * Compute your weight on the moon.
 * Call this file MoonGravity.java
 */

class MoonGravity {
    public static void main(String[] args) {
        double earthWeight;
        double moonWeight;

        earthWeight = 100;
        moonWeight = earthWeight * 0.17;

        System.out.println(earthWeight +
            " earth-kg is equivalent to " +
            moonWeight +
            " moon-kg");
    }
}
