package xyz.yutna.books.abeginnersguide.ch5;

// Introduce string
class StringDemo {
    public static void main(String[] args) {
        // declare strings in various ways
        String str1 = new String("Java strings are object");
        String str2 = "They are constructed various ways.";
        String str3 = new String(str2);

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
    }
}
