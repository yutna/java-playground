package xyz.yutna.book.beginnerguide.ch4;

public class HelpClassDemo {
    public static void main(String[] args) throws java.io.IOException {
        char choice, ignore;
        Help help = new Help();

        for (;;) {
            do {
                help.showMenu();
                choice = (char) System.in.read();

                do {
                    ignore = (char) System.in.read();
                } while (ignore != '\n');
            } while (!help.isValid(choice));

            if (choice == 'q') break;

            System.out.println("\n");
            help.helpOn(choice);
        }
    }
}
