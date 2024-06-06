package xyz.yutna.books.abeginnersguide.ch6;

public class SelfTest6 {
    public static String reverse(String message) {
        return r(message, message.length() - 1);
    }

    private static String r(String message, int index) {
        if (index < 0) {
            return "";
        }

        return message.charAt(index) + r(message, index - 1);
    }
}
