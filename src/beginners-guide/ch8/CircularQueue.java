// A circular queue.
class CircularQueue implements ICharQ {
    private char[] q; // This array holds the queue
    private int putLocation, getLocation; // the put and get indices

    // Construct an empty queue given its size.
    public CircularQueue(int size) {
        q = new char[size + 1]; // Allocate memory for queue
        putLocation = getLocation = 0;
    }

    // Put a character into the queue.
    public void put(char ch) {
        /*
         * Queue is full if either putLocation is one less than getLocation,
         * or if putLocation is at the end of the array and getLocation is at
         * the beginning.
         */
        if ((putLocation + 1) == getLocation | ((putLocation == q.length - 1) & (getLocation == 0))) {
            System.out.println(" -- Queue is full.");
            return;
        }

        q[putLocation++] = ch;

        // Loop back
        if (putLocation == q.length)
            putLocation = 0;
    }

    // Get a character from the queue.
    public char get() {
        if (getLocation == putLocation) {
            System.out.println(" -- Queue is empty.");
            return (char) 0;
        }

        char ch = q[getLocation++];

        if (getLocation == q.length)
            getLocation = 0; // Loop back

        return ch;
    }
}
