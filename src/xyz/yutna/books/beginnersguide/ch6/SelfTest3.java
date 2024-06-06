package xyz.yutna.books.beginnersguide.ch6;

public class SelfTest3 {
    public static void main(String[] args) {
        MyStack s = new MyStack(3);
        MyStack s1 = new MyStack(10);

        s.push('T');
        s.push('o');
        s.push('m');

        for (int i = 0; i < 3; i++) {
            System.out.print(s.pop() + " ");
        }

        System.out.println();

        for (int i = 0; i < 10; i++) {
            s1.push((char) ('A' + i));
        }

        for (int i = 0; i < 10; i++) {
            System.out.print(s1.pop() + " ");
        }

        System.out.println();
    }
}
