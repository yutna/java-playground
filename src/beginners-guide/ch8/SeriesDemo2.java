/*
 * NOTE - Interface Reference (หรือ interface reference variable)
 * You can declare a reference variable of an interface type.
 * In other words, you can create an interface reference variable.
 * Such a variable can refer to any object that implements its interface.
 * When you call a method on an object through an interface reference,
 * it is the version of the method implemented by the object that is executed.
 * This process is similar to using a superclass reference to access a subclass object
 * LINK - src\beginners-guide\ch7\DynDispDemo.java
 *
 * NOTE - An interface reference variable has knowledge only of the methods
 * declared by its interface declaration, Thus, `ob` could NOT be used to access
 * any other variables or methods that might be supported by the object.
 *
 * แปลไทยเป็นไทย
 * คือ ถ้าเรามี interface ชื่อ Series เราสามารถประกาศตัวแปรโดยที่ type เป็น interface ได้แบบนี้
 * Series ob;
 * ซึ่ง ob สามารถ store object reference ของ class ที่ implement interface ในที่นี้คือ Series ได้
 * จากตัวอย่างข้างล่าง ob สามารถ store object reference ทั้ง twoOb และ threeOb ซึ่ง object ทั้งคู่ได้
 * ทำการ implement interface Series ไว้เรียบร้อยแล้ว ทำให้ ob สามารถเรียก method จาก object ของ
 * ทั้งคู่ได้นั่นเอง แต่มีข้อแม้ว่า ob จะรู้จักเฉพาะของที่ประกาศไว้ใน interface เท่านั้น มันไม่สามารถเรียก method
 * ที่คลาสเหล่านั้นประกาศขึ้นมาเองได้ เช่น ob ไม่สามารถเรียก getPrevious() ของ ByTwos ได้นั่นเอง
 */

class SeriesDemo2 {
    public static void main(String[] args) {
        ByTwos twoOb = new ByTwos();
        ByThrees threeOb = new ByThrees();
        Series ob; // Interface References Variable

        // Access an object via an interface reference.
        for (int i = 0; i < 5; i++) {
            ob = twoOb;
            System.out.println("Next ByTwos value is " + ob.getNext());

            ob = threeOb;
            System.out.println("Next ByThrees value is " + ob.getNext());
        }
    }
}
