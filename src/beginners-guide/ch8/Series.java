// NOTE - For a top-level interface, access is either **public** or NOT used.
// When no access modifier is included, then default access results.

// NOTE - In in interface, methods are implicitly **public**.
// Whenever you implement a method defined by an interface, it must be
// implemented as **public** because all members of an interface are
// implicitly **public**

// NOTE - Variables declared in an interface are NOT instance variables,
// Instead, they are implicitly **public**, **final**, and **static**
// and must be initialized. Thus, they are essentially **constant**.

// NOTE - If a class includes an interface but does NOT fully implement
// the methods defined by that interface, then that class declared **abstract**.
// No objects of such a class can be created, but it can be used as an abstract
// superclass. allowing subclasses to provide the complete implementation.

// NOTE - Private Interface Methods
// - A private interface method can be called only by a default method or
// another private method defined by the same interface
// - It cannot be used by code outside the interface in which it is defined.
// - This restriction includes subinterfaces because a private interface method
// is NOT inherited by a subinterface.
// - The key benefit of a private interface method is that it lets two or more
// default methods use a common piece of code, thus avoiding code duplication.
// พูดง่ายๆ เราสร้าง private method ขึ้นมาเพื่อแตก logic เอาไว้ใช้ใน default method หรือ
// private method เองเท่านั้น จากตัวอย่างข้างล่าง ทั้ง getNextArray() กับ skipAndGetNextArray()
// ต่างก็เรียกใช้ getArray() ที่เป็น private method ซึ่งจะได้ไม่ต้องเขียน logic ซ้ำไปซ้ำมา ก็เหมือนการ
// ที่เราแตก logic เป็น private method ใน class ปกตินั่นแหละ ซึ่ง private method ใช้ได้ตั้งแต่
// JDK9+ เป็นต้นไป

public interface Series {
    int getNext(); // return next number in series

    // An enhanced version of Series that includes a default method.
    // Return an array that contains the next n elements in the series beyond the
    // current element.
    default int[] getNextArray(int n) {
        return getArray(n);
    }

    // Return an array that contains the next n elements in the series,
    // after skipping elements.
    default int[] skipAndGetNextArray(int skip, int n) {
        // Skip the specified number of elements.
        getArray(skip);
        return getArray(n);
    }

    void reset(); // restart

    void setStart(int x); // set starting value

    // A private method that returns an array containing
    // the next n elements.
    private int[] getArray(int n) {
        int[] vals = new int[n];

        for (int i = 0; i < n; i++)
            vals[i] = getNext();

        return vals;
    }
}
