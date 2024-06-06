// An improved queue class for characters.
class Queue {
    // These members are now private
    private char[] q; // This array hold the queue
    private int putLocation, getLocation; // The put and get indices

    Queue(int size) {
        q = new char[size]; // Allowcate memory for queue
        putLocation = getLocation = 0;
    }

    // Put a character into the queue
    void put(char ch) {
        if (putLocation == q.length) {
            System.out.println(" -- Queue is full.");
            return;
        }

        q[putLocation++] = ch;
    }

    // Get a character from the queue
    char get() {
        if (getLocation == putLocation) {
            System.out.println(" -- Queue is empty.");
            return (char) 0;
        }

        return q[getLocation++];
    }
}
