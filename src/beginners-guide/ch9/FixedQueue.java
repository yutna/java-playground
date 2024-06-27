// A fixed-size queue class for characters that uses exceptions.
class FixedQueue implements ICharQ {
    private char[] q;
    private int putLocation, getLocation;

    public FixedQueue(int size) {
        q = new char[size];
        putLocation = getLocation = 0;
    }

    public void put(char ch) throws QueueFullException {
        if (putLocation == q.length)
            throw new QueueFullException(q.length);

        q[putLocation++] = ch;
    }

    public char get() throws QueueEmptyException {
        if (getLocation == putLocation)
            throw new QueueEmptyException();

        return q[getLocation++];
    }
}
