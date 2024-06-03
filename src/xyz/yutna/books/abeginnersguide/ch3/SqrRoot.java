package xyz.yutna.books.abeginnersguide.ch3;

// Show square roots of 1 to 99 and the rounding errors.
class SqrRoot {
    public static void main(String[] args) {
        double num, sroot, reer;

        for (num = 1.0; num < 100.0; num++) {
            sroot = Math.sqrt(num);
            System.out.println("Square root of " + num + " is " + sroot);
            // compute rounding error
            reer = num - (sroot * sroot);
            System.out.println("Rounding error is " + reer);
            System.out.println();
        }
    }
}
