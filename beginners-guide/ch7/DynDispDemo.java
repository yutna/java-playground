// NOTE - If a superclass contains a method that is overriden by a subclass,
// then when different types of objects are referred to through a superclass reference variable,
// different version of the mothod are executed.

// แปลไทยให้เข้าใจง่ายๆ เราต้องทบทวนเรื่องนี้ตาม step ต่อไปนี้
// 1) เรามี superclass กับ subclass
// 2) เรามีกฏอยู่ว่า superclass reference variable สามารถ ref หา subclass ของมันได้ทั้งหมด
//    แต่ superclass จะ call ได้เฉพาะ member ของมันเท่านั้น มันไม่สามารถ call member ของ subclass ได้
// 3) ดังนั้นจะเกิดอะไรขึ้น ถ้า member ที่เป็น method ที่มี signature เดียวกัน ซึ่งมีในทั้ง superclass และ subclass ซึ่งก็คือ method นั้นมันถูก override ใน supclass นั่นแหละ
//    ตัวไหนจะเป็นคนถูกเรียกกันแน่
// 4) Java จึงมี mechanism ที่เรียกว่า dynamic method dispatch โดยเจ้าสิ่งนี้จะเป็นตัดสินใจว่าจะเรียกตัวไหนที่เป็นตัวที่ถูกต้องในขณะ runtime ไม่ใช่ compile time
// 5) ดังนั้น สรุปได้ว่า superclass reference variable จะเรียก method ของ object reference ที่ถูกชี้อยู่ ซึ่งก็คือเรียกตัว overrided method ของ subclass นั่นเอง

// Demonstrate dynamic method dispatch
public class DynDispDemo {
    public static void main(String[] args) {
        Sup superOb = new Sup();
        Sub1 subOb1 = new Sub1();
        Sub2 subOb2 = new Sub2();

        Sup supRef;

        supRef = superOb;
        supRef.who();

        supRef = subOb1;
        supRef.who();

        supRef = subOb2;
        supRef.who();
    }
}
