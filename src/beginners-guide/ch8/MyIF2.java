/*
 * Use Static Methods in an Interface
 *
 * NOTE - A static method defined by an interface can be called independently of any object.
 * (Like statis methods in a class), Thus, no implementation of the interface is necessary,
 * and no instance of the interface is required in order to call a static method. Instead,
 * a static method is called by specifying the interface name, followed by a period, followed by
 * the method name. Here is the general form
 * -> InterfaceName.staticMethodName
 *
 * NOTE - static interface methods are NOT inherited by either an implementing class or a subinterface.
 *
 * LINK - ./MyIFImp3.java
 */

public interface MyIF2 {
    int getUserID();

    default int getAdminID() {
        return 1;
    }

    // This is a static interface method.
    static int getUniversalID() {
        return 0;
    }
}
