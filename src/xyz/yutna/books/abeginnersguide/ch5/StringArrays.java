package xyz.yutna.books.abeginnersguide.ch5;

// Demonstrate String arrays.
class StringArrays {
    public static void main(String[] args) {
        String[] strs = { "This", "is", "a", "test." };

        System.out.println("Original array: ");
        for (String s: strs)
            System.out.print(s + " ");
        System.out.println("\n");

        // Change a string
        strs[1] = "was";
        strs[3] = "test, too!";

        System.out.println("Modified array: ");
        for (String s: strs)
            System.out.print(s + " ");
    }
}
