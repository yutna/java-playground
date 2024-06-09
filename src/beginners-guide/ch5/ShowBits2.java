class ShowBits2 {
    int numBits;

    ShowBits2(int n) {
        numBits = n;
    }

    void show(long val) {
        long mask = 1;
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
