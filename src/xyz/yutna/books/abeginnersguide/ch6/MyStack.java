package xyz.yutna.books.abeginnersguide.ch6;

public class MyStack {
    private char[] characters;
    private int pushLocation;
    private int popLocation;

    public MyStack(int size) {
        characters = new char[size];
        pushLocation = 0;
        popLocation = size - 1;
    }

    public boolean push(char character) {
        if (pushLocation < characters.length) {
            characters[pushLocation++] = character;
            return true;
        }

        return false;
    }

    public char pop() {
        if (popLocation >= 0) {
            char ch = characters[popLocation--];
            return ch;
        }

        return (char) 0;
    }
}
