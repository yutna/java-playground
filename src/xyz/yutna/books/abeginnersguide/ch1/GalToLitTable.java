package xyz.yutna.books.abeginnersguide.ch1;

/*
 * Try this 1-2
 * This program displays a conversion table of gallons to liters.
 * Call this program "GalToListTable.java".
 */

public class GalToLitTable {
    public static void main(String[] args) {
        double gallons, liters;
        int counter;

        counter = 0;
        for (gallons = 1; gallons <= 100; gallons++) {
            liters = gallons * 3.7854; // convert to liters
            System.out.println(gallons + " gallons is " + liters + " liters.");

            counter++;
            if (counter == 10) {
                System.out.println();
                counter = 0; // reset the line counter
            }
        }
    }
}
