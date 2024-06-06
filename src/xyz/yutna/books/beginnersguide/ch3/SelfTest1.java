package xyz.yutna.books.beginnersguide.ch3;

/*
 * Write a program that reads characters from the keyboard until a period is
 * received. Have the program count the number of spaces. Report the total at
 * the end of the program.
 */

public class SelfTest1 {
    public static void main(String[] args) throws java.io.IOException {
        char ch;
        int spaces = 0;

        System.out.println("Enter a period to stop.");

        do {
            ch = (char) System.in.read();
            if (ch == ' ')
                spaces++;
        } while (ch != '.');

        System.out.println("Spaces: " + spaces);
    }
}
