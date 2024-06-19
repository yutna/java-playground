package qpack;

// A dynamic queue
public class DynQueue implements ICharQ {
    private char[] q; // this array holds the queue
    private int putLocation, getLocation; // the put and get indices

    // Construct an empty queue given its size.
    public DynQueue(int size) {
        q = new char[size]; // allocate memory for queue
        putLocation = getLocation = 0;
    }

    // Put a character into the queue.
    public void put(char ch) {
        if (putLocation == q.length) {
            // increase queue size
            char[] t = new char[q.length * 2];

            // copy elements into new queue
            for (int i = 0; i < q.length; i++) {
                t[i] = q[i];
            }

            q = t;
        }

        q[putLocation++] = ch;
    }

    // Get a character from the queue.
    public char get() {
        if (getLocation == putLocation) {
            System.out.println(" -- Queue is empty.");
            return (char) 0;
        }

        return q[getLocation++];
    }
}
