package xyz.yutna.books.beginnersguide.ch3;

// Read a character from the keyboard.
public class KbIn {
    public static void main(String[] args) throws java.io.IOException {
        char ch;

        System.out.print("Press a key followed by ENTER: ");
        ch = (char) System.in.read(); // get a char, Read a character from keyboard
        System.out.println("Your key is: " + ch);
    }
}
