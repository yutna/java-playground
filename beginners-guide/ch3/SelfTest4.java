/*
 * Show the `for` statement for a loop that counts from 1000 to 0 by -2
 */
class SelfTest4 {
    public static void main(String[] args) {
        for (int i = 1_000; i >= 0; i -= 2) {
            System.out.println(i);
        }
    }
}
