class MyStack {
    private char[] characters;
    private int pushLocation;
    private int popLocation;

    MyStack(int size) {
        characters = new char[size];
        pushLocation = 0;
        popLocation = size - 1;
    }

    boolean push(char character) {
        if (pushLocation < characters.length) {
            characters[pushLocation++] = character;
            return true;
        }

        return false;
    }

    char pop() {
        if (popLocation >= 0) {
            char ch = characters[popLocation--];
            return ch;
        }

        return (char) 0;
    }
}
