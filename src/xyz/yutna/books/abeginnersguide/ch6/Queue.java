package xyz.yutna.books.abeginnersguide.ch6;

// An improved queue class for characters.
public class Queue {
    // These members are now private
    private char[] q; // This array hold the queue
    private int putLocation, getLocation; // The put and get indices

    public Queue(int size) {
        q = new char[size]; // Allowcate memory for queue
        putLocation = getLocation = 0;
    }

    // Put a character into the queue
    public void put(char ch) {
        if (putLocation == q.length) {
            System.out.println(" -- Queue is full.");
            return;
        }

        q[putLocation++] = ch;
    }

    // Get a character from the queue
    public char get() {
        if (getLocation == putLocation) {
            System.out.println(" -- Queue is empty.");
            return (char) 0;
        }

        return q[getLocation++];
    }
}
