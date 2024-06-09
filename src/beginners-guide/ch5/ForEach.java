// Use a for-each style for loop.
class ForEach {
    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int sum = 0;

        // Use for-each style for to display and sum the values.
        for (int number : numbers) {
            System.out.println("Value is: " + number);
            sum += number;
        }

        System.out.println("Summation: " + sum);
    }
}
