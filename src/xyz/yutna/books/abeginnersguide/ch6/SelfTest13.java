package xyz.yutna.books.abeginnersguide.ch6;

public class SelfTest13 {
    public static void main(String[] args) {
        int result = sum(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println("Result: " + result);
    }

    public static int sum(int... n) {
        int sum = 0;

        for (int i = 0; i < n.length; i++) {
            sum += n[i];
        }

        return sum;
    }
}
