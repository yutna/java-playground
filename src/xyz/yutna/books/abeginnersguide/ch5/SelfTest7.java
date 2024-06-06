package xyz.yutna.books.abeginnersguide.ch5;

public class SelfTest7 {
    public static void main(String[] args) {
        String msg = "This is a test";
        String encMsg = "";
        String decMsg = "";

        String key = "abcdefgh";
        int idx = 0;

        System.out.print("Original message: ");
        System.out.println(msg);

        // Encode the message
        for (int i = 0; i < msg.length(); i++) {
            encMsg += (char) (msg.charAt(i) ^ key.charAt(idx));

            idx++;
            if (idx == key.length())
                idx = 0;
        }

        System.out.print("Encoded message: ");
        System.out.println(encMsg);

        // reset idx
        idx = 0;

        // Decode the message
        for (int i = 0; i < msg.length(); i++) {
            decMsg += (char) (encMsg.charAt(i) ^ key.charAt(idx));

            idx++;
            if (idx == key.length())
                idx = 0;
        }

        System.out.print("Decoded message: ");
        System.out.println(decMsg);
    }
}
