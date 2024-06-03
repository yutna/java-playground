package xyz.yutna.books.abeginnersguide.ch5;

// String are immutable.
// Use substring();
class SubStr {
    public static void main(String[] args) {
        String orgstr = "Java makes web move.";

        // construct a substring
        String substr = orgstr.substring(5, 18);

        System.out.println("orgstr: " + orgstr);
        System.out.println("substr: " + substr);
    }
}
