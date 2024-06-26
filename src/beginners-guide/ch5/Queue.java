/*
 * Try This 5-2
 * A queue class for characters.
 */
class Queue {
    char[] queue; // this array holds the queue
    int putLocation, getLocation; // the put and get indices

    Queue(int size) {
        queue = new char[size]; // allocate memory for queue
        putLocation = getLocation = 0;
    }

    // put a character into the queue
    void put(char ch) {
        if (putLocation == queue.length) {
            System.out.println(" - Queue is full.");
            return;
        }

        queue[putLocation++] = ch;
    }

    // get a character from the queue
    char get() {
        if (getLocation == putLocation) {
            System.out.println(" - Queue is empty");
            return (char) 0;
        }

        return queue[getLocation++];
    }
}
