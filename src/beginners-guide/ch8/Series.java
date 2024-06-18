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

public interface Series {
    int getNext(); // return next number in series

    void reset(); // restart

    void setStart(int x); // set starting value
}
