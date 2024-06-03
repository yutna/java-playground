package xyz.yutna.books.abeginnersguide.ch3;

// Guess the letter game, 3rd version
class Guess3 {
    public static void main(String[] args) throws java.io.IOException {
        char ch, answer = 'K';

        System.out.println("I'm thinking of a letter between A and Z.");
        System.out.print("Can you guess it: ");

        ch = (char) System.in.read();

        if (ch == answer) System.out.println("*** RIGHT ***");
        else {
            System.out.print("...Sorry, you are ");
            if (ch < answer) System.out.println("too low");
            else System.out.println("too high");
        }
    }
}