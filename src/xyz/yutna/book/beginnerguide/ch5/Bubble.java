package xyz.yutna.book.beginnerguide.ch5;

/*
 * Try This 5-1
 * Demonstrate the Bubble sort.
 */
public class Bubble {
    public static void main(String[] args) {
        int[] numbers = { 99, -10, 100123, 18, -978, 5623, 463, -9, 287, 49 };
        int a, b, t;
        int size;

        size = 10; // Number of elements to sort

        // Display original array
        System.out.print("Original array is:");
        for (int i = 0; i < size; i++)
            System.out.print(" " + numbers[i]);
        System.out.println();

        // This is the bubble sort.
        for (a = 1; a < size; a++) {
            for (b = size - 1; b >= a; b--) {
                if (numbers[b - 1] > numbers[b]) {
                    t = numbers[b - 1];
                    numbers[b - 1] = numbers[b];
                    numbers[b] = t;
                }
            }
        }

        // Display sorted array
        System.out.print("Sorted array is:");
        for (int i = 0; i < size; i++)
            System.out.print(" " + numbers[i]);
        System.out.println();
    }
}

// Bubble sort explain when numbers = { 9, 1, 2, 3 }
// 9 1 2 3 | a = 1 | b = 3 | 3 >= 1 | num[2] > num[3] -> 2 > 3
//                 | b = 2 | 2 >= 1 | num[1] > num[2] -> 1 > 2
//                 | b = 1 | 1 >= 1 | num[0] > num[1] -> 9 > 1 | 1 9 2 3
// 1 9 2 3 | a = 2 | b = 3 | 3 >= 2 | num[2] > num[3] -> 2 > 3
//                 | b = 2 | 2 >= 2 | num[1] > num[2] -> 9 > 2 | 1 2 9 3
//                 | b = 1 | 1 >= 2
// 1 2 9 3 | a = 3 | b = 3 | 3 >= 3 | num[2] > num[3] -> 9 > 3 | 1 2 3 9
//                 | b = 2 | 2 >= 3
