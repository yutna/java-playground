package xyz.yutna.books.abeginnersguide.ch6;

public class SelfTest4Main {
    public static void main(String[] args) {
        SelfTest4 ob1 = new SelfTest4(1);
        SelfTest4 ob2 = new SelfTest4(2);

        System.out.println("Before swap: ");
        System.out.println("ob1.a = " + ob1.a);
        System.out.println("ob2.a = " + ob2.a);

        ob1.swap(ob2);

        System.out.println("After swap: ");
        System.out.println("ob1.a = " + ob1.a);
        System.out.println("ob2.a = " + ob2.a);
    }
}
