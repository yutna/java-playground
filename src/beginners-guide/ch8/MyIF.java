/*
 * Interface Default Method Fundamentals
 *
 * NOTE - An interface default method is defined similar to the way a method is
 * defined by a class. The primary difference is that the declaration is
 * preceded by the keyword **default**.
 */
public interface MyIF {
    // This is a *normal* interface method declaration.
    // It does NOT define a default implementation.
    int getUserID();

    // This is a default method. Notice that it provides
    // a default implementation.
    // Because this method includes a default implementation, it is NOT necessary
    // for an implementing class to override it. In other words, If an implementing
    // class does NOT provide its own implementation, the default is used.
    // LINK - ./MyIFImp.java
    default int getAdminID() {
        return 1;
    }
}
