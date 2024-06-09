// The for-each loop is essentially read-only.
class NoChange {
    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        for (int number : numbers) {
            System.out.print(number + " ");
            number = number * 10; // no effect on numbers
        }

        System.out.println();

        for (int number : numbers) {
            System.out.print(number + " ");
        }

        System.out.println();
    }
}
