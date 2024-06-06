package xyz.yutna.books.beginnersguide.ch6;

// Use an inner class
public class Outer {
    public int[] nums;

    public Outer(int[] n) {
        nums = n;
    }

    public void analyze() {
        Inner inOb = new Inner();

        System.out.println("Minimum: " + inOb.min());
        System.out.println("Maximum: " + inOb.max());
        System.out.println("Average: " + inOb.avg());
    }

    // This is an inner class
    public class Inner {
        public int min() {
            int m = nums[0];

            for (int i = 1; i < nums.length; i++)
                if (nums[i] < m)
                    m = nums[i];

            return m;
        }

        public int max() {
            int m = nums[0];

            for (int i = 1; i < nums.length; i++)
                if (nums[i] > m)
                    m = nums[i];

            return m;
        }

        public int avg() {
            int a = 0;

            for (int i = 0; i < nums.length; i++)
                a += nums[i];

            return a / nums.length;
        }
    }
}
