package xyz.yutna.books.abeginnersguide.ch6;

class Queue2 {
    private char[] q;
    private int putLocation, getLocation;

    Queue2(int size) {
        q = new char[size];
        putLocation = getLocation = 0;
    }

    // Construct a Queue from Queue
    Queue2(Queue2 ob) {
        putLocation = ob.putLocation;
        getLocation = ob.getLocation;
        q = new char[ob.q.length];

        // Copy element
        for (int i = getLocation; i < putLocation; i++) {
            q[i] = ob.q[i];
        }
    }

    // Construct a Queue with initial values.
    Queue2(char[] a) {
        putLocation = 0;
        getLocation = 0;
        q = new char[a.length];

        for (int i = 0; i < a.length; i++) {
            put(a[i]);
        }
    }

    // Put a character into the queue.
    void put(char ch) {
        if (putLocation == q.length) {
            System.out.println(" -- Queue is full.");
            return;
        }

        q[putLocation++] = ch;
    }

    // Get a character from the queue.
    char get() {
        if (putLocation == getLocation) {
            System.out.println(" -- Queue is empty.");
            return (char) 0;
        }

        return q[getLocation++];
    }
}
