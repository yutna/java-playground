// Handle errors gracefully and continue.
class ExcDemo3 {
    public static void main(String[] args) {
        int[] number = { 4, 8, 16, 32, 64, 128 };
        int[] denum = { 2, 0, 4, 4, 0, 8 };

        for (int i = 0; i < number.length; i++) {
            try {
                System.out.println(number[i] + " / " + denum[i] + " is " + (number[i] / denum[i]));
            } catch (ArithmeticException exc) {
                // Catch the exception
                System.out.println("Can't devide by Zero!");
            }
        }
    }
}
