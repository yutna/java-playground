package xyz.yutna.books.abeginnersguide.ch5;

// Demonstrate the Queue class
public class QDemo {
    public static void main(String[] args) {
        Queue bigQ = new Queue(100);
        Queue smallQ = new Queue(4);

        char ch;
        int i;

        // put some numbers into bigQ
        System.out.println("Using bigQ to store the alphabet.");
        for (i = 0; i < 26; i++) {
            bigQ.put((char) ('A' + i));
        }

        // retrieve and display elements from bigQ
        System.out.print("Contents of bigQ: ");
        for (i = 0; i < 26; i++) {
            ch = bigQ.get();
            if (ch != (char) 0) System.out.print(ch);
        }

        System.out.println("\n");

        // Now, use smallQ to generate some errors
        System.out.println("Using smallQ to generate errors");
        for (i = 0; i < 5; i++) {
            System.out.print("Attempting to store " + (char) ('Z' - i));
            smallQ.put((char) ('Z' - i));
            System.out.println();
        }

        System.out.println();

        // more errors on smallQ
        for (i = 0; i < 5; i++) {
            ch = smallQ.get();
            if (ch != (char) 0) System.out.print(ch);
        }
    }
}
