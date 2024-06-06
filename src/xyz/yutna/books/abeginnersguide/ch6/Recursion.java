package xyz.yutna.books.abeginnersguide.ch6;

public class Recursion {
    public static void main(String[] args) {
        Factorial f = new Factorial();

        System.out.println("Factorials using recursive method.");
        System.out.println("Factorial of 3 is " + f.facR(3));
        System.out.println("Factorial of 4 is " + f.facR(4));
        System.out.println("Factorial of 15 is " + f.facR(15));
        System.out.println();

        System.out.println("Factorials using iterative method.");
        System.out.println("Factorial of 3 is " + f.facI(3));
        System.out.println("Factorial of 4 is " + f.facI(4));
        System.out.println("Factorial of 15 is " + f.facI(15));
        System.out.println();
    }
}
