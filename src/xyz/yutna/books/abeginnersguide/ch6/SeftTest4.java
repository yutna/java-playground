package xyz.yutna.books.abeginnersguide.ch6;

class SelfTest4 {
    int a;

    SelfTest4(int i) {
        a = i;
    }

    void swap(SelfTest4 ob) {
        int temp = ob.a;
        ob.a = a;
        a = temp;
    }
}
