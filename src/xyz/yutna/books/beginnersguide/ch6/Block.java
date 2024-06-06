package xyz.yutna.books.beginnersguide.ch6;

// Objects can be passed to methods.
public class Block {
    public int a, b, c;
    public int volume;

    public Block(int i, int j, int k) {
        a = i;
        b = j;
        c = k;

        volume = a * b * c;
    }

    // Return true if ob defines same block.
    public boolean sameBlock(Block ob) { // Use object type for parameter.
        if ((ob.a == a) & (ob.b == b) & (ob.c == c))
            return true;
        else
            return false;
    }

    // Return true if ob has same volume.
    public boolean sameVolume(Block ob) {
        if (ob.volume == volume)
            return true;
        else
            return false;
    }
}
