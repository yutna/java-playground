package xyz.yutna.books.beginnersguide.ch6;

public class SelfTest4 {
    public int a;

    public SelfTest4(int i) {
        a = i;
    }

    public void swap(SelfTest4 ob) {
        int temp = ob.a;
        ob.a = a;
        a = temp;
    }
}
