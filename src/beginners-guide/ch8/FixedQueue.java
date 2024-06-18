// A fixed-size queue class for characters.
class FixedQueue implements ICharQ {
    private char[] q; // this array holds the queue
    private int putLocation, getLocation; // the put and get indices

    // Construct an empty queue given its size.
    public FixedQueue(int size) {
        q = new char[size]; // allocate memory for queue
        putLocation = getLocation = 0;
    }

    // Put a character into the queue.
    public void put(char ch) {
        if (putLocation == q.length) {
            System.out.println(" -- Queue is full.");
            return;
        }

        q[putLocation++] = ch;
    }

    // Get a character from this queue
    public char get() {
        if (getLocation == putLocation) {
            System.out.println(" -- Queue is empty.");
        }

        return q[getLocation++];
    }
}
