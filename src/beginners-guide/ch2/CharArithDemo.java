/*
 * Character variables can be handled like integers.
 */
class CharArithDemo {
    public static void main(String[] args) {
        char ch;

        ch = 'X';
        System.out.println("ch character " + ch);

        ch++; // increment ch
        System.out.println("ch is now " + ch);

        // A char can be assigned an integer value
        // A char is an unsigned 16-bit types, (0-65,535), It is Unicode range.
        ch = 90; // give ch the value Z
        System.out.println("ch is now " + ch);
    }
}
