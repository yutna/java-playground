package xyz.yutna.books.beginnersguide.ch5;

// Use for-each style for on a two-dimensional array.
public class ForEach2 {
    public static void main(String[] args) {
        int sum = 0;
        int[][] numbers = new int[3][5];

        // give numbers some values
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                numbers[i][j] = (i + 1) * (j + 1);
            }
        }

        // Use for-each for loop to display and sum the values.
        for (int[] x : numbers) { // notice how x is declared.
            for (int y : x) {
                System.out.println("Value is: " + y);
                sum += y;
            }
        }

        System.out.println("Summation: " + sum);
    }
}
