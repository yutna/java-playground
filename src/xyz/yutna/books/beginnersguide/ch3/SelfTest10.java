package xyz.yutna.books.beginnersguide.ch3;

public class SelfTest10 {
    public static void main(String[] args) throws java.io.IOException {
        char ch;
        int changes = 0;

        System.out.println("Enter period to stop.");

        do {
            ch = (char) System.in.read();

            if (ch >= 'a' & ch <= 'z') {
                ch -= 32;
                changes++;
                System.out.print(ch);
            } else if (ch >= 'A' & ch <= 'Z') {
                ch += 32;
                changes++;
                System.out.print(ch);
            } else {
                System.out.print(ch);
            }
        } while (ch != '.');

        System.out.println("\nCase changes: " + changes);
    }
}
