package xyz.yutna.book.beginnerguide.ch2;

// Demonstrate dynamic initialization.
public class DynInit {
    public static void main(String[] args) {
        double radius  = 4, height = 5;

        // dynamically initialize volume
        double volume = Math.PI * radius * radius * height;

        System.out.println("Volume is " + volume);
    }
}
