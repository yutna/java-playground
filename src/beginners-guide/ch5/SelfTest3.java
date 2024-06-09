class SelfTest3 {
    public static void main(String[] args) {
        double[] numbers = { 1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 10.0 };
        double sum = 0.0;

        for (double number : numbers) {
            sum += number;
        }

        System.out.println("Average: " + (sum / numbers.length)); // 5.5
    }
}
