package xyz.yutna.books.abeginnersguide.ch5;

/*
 * Try This 5-2
 * A queue class for characters.
 */

public class Queue {
    public char[] queue; // this array holds the queue
    public int putLocation, getLocation; // the put and get indices

    public Queue(int size) {
        queue = new char[size]; // allocate memory for queue
        putLocation = getLocation = 0;
    }

    // put a character into the queue
    public void put(char ch) {
        if (putLocation == queue.length) {
            System.out.println(" - Queue is full.");
            return;
        }

        queue[putLocation++] = ch;
    }

    // get a character from the queue
    public char get() {
        if (getLocation == putLocation) {
            System.out.println(" - Queue is empty");
            return (char) 0;
        }

        return queue[getLocation++];
    }
}
