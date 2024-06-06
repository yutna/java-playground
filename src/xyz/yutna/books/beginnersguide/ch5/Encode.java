package xyz.yutna.books.beginnersguide.ch5;

public class Encode {
    public static void main(String[] args) {
        String msg = "This is a test";
        String encMsg = "";
        String decMsg = "";

        int key = 88;

        System.out.print("Original message: ");
        System.out.println(msg);

        // Encode the message
        for (int i = 0; i < msg.length(); i++) {
            encMsg += (char) (msg.charAt(i) ^ key);
        }

        System.out.print("Encoded message: ");
        System.out.println(encMsg);

        // Decode the message
        for (int i = 0; i < msg.length(); i++) {
            decMsg += (char) (encMsg.charAt(i) ^ key);
        }

        System.out.print("Decoded message: ");
        System.out.println(decMsg);
    }
}
