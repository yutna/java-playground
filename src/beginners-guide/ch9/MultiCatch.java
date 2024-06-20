// NOTE - This code require JDK 7 or later to compile.
// NOTE - Each multi-catch parameter is implicitly **final**, it can NOT be
// assigned a new value. (You can explicitly specify **final**, if desired, but
// it is not necessary)

// Use the multi-catch feature.
class MultiCatch {
    public static void main(String[] args) {
        int a = 88, b = 0;
        int result;
        char[] chrs = { 'A', 'B', 'C' };

        for (int i = 0; i < 2; i++) {
            try {
                if (i == 0)
                    result = a / b;
                else
                    chrs[5] = 'X';
            } catch (ArithmeticException | ArrayIndexOutOfBoundsException exc) {
                System.out.println("Exception caught: " + exc);
            }
        }

        System.out.println("After multi-catch.");
    }
}
