package xyz.yutna.book.beginnerguide.ch1;

public class InchesToMeters {
    public static void main(String[] args) {
        double meters;
        int inches;
        int maxInches = 12 * 12;
        int counter = 0;

        for (inches = 1; inches <= maxInches; inches++) {
            meters = inches / 39.37;
            System.out.println(inches + " Inches, " + meters + " meters.");

            counter++;
            if (counter == 12) {
                System.out.println();
                counter = 0;
            }
        }
    }
}
