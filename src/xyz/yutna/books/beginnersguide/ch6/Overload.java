package xyz.yutna.books.beginnersguide.ch6;

// NOTE - Method overloading is one of the ways that Java implements polymorphism.
// NOTE - The type and/or number of the parameters of each overloaded method must differ.
// NOTE - The overloaded methods **MAY** differ in their return type too.
// ถ้า overloaded methods ต่างกันแค่ return type ใน Java ถือว่ามันดูไม่ค่อย sufficient เท่าไหร่ ถ้าจะทำแค่นั้น

// NOTE - Method overloading supports polymorphism because it is one way that Java implements the "one interface, multiple methods" paradigm.

public class Overload {
    public void ovlDemo() { // First version
        System.out.println("No parameters");
    }

    // Overload ovlDemo for one integer parameter.
    public void ovlDemo(int a) { // Second version
        System.out.println("One parameter: " + a);
    }

    // NOTE - return types **CANNOT** be used to differentiate overloaded methods.
    // อย่างที่เขียนไว้ข้างบน overlaod method มี parameter เหมือนกันแต่ต่างกันแค่
    // return type ใน Java ถือว่าไม่มีผล ตัวอย่างข้างล่างนี้ถ้า uncomment จะขึ้น
    // error ทันที
    // int ovlDemo(int a) {
    // System.out.println("One parameter: " + a);
    // return a * a;
    // }

    // Overload ovlDemo for two integer parameters.
    public int ovlDemo(int a, int b) { // Third version
        System.out.println("Two parameters: " + a + " " + b);
        return a + b;
    }

    // Overload ovlDemo for two double parameters.
    public double ovlDemo(double a, double b) { // Fourth version
        System.out.println("Two double parameters: " + a + " " + b);
        return a + b;
    }
}
