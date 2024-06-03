package xyz.yutna.books.abeginnersguide.ch5;

class SelfTest4 {
    public static void main(String[] args) {
        String temp;
        String[] strs = {
                "Stock 2 morrow",
                "BenQ",
                "Apress",
                "Acer",
                "Java",
                "PHP",
                "GOOJODOO"
        };

        for (int i = 1; i < strs.length; i++) {
            for (int j = strs.length - 1; j >= i; j--) {
                if (strs[j - 1].compareTo(strs[i]) > 0) {
                    temp = strs[j - 1];
                    strs[j - 1] = strs[j];
                    strs[j] = temp;
                }
            }
        }

        for (String str : strs) {
            System.out.print(str + ", ");
        }

        System.out.println();
    }
}
