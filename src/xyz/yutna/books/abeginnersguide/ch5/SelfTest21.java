package xyz.yutna.books.abeginnersguide.ch5;

public class SelfTest21 {
    public static void main(String[] args) {
        int numBits = 64;
        long val = 123_456;

        var mask = 1L;
        int spacer = 0;

        // left-shift a 1 into the proper postion.
        mask <<= numBits - 1;

        for (; mask != 0; mask >>>= 1) {
            if ((val & mask) != 0)
                System.out.print("1");
            else
                System.out.print("0");

            spacer++;

            if ((spacer % 8) == 0) {
                System.out.print(" ");
                spacer = 0;
            }
        }

        System.out.println();
    }
}
