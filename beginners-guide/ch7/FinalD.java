// NOTE - If you precede an instance variable's name with final,
// its value CANNOT be changed throughout the **LIFETIME** of your program.
// NOTE - Making a **final** member variable **static** lets you refer to the
// constant through its class name rather than through an object. e.g.
// System.out.println(err.getErrorMsg(ErrorMsg.OUTERR));
// NOTE - Declaring a parameter **final** prevents it from being changed within the method.
// NOTE - Declaring a local variable **final** prevents it from being assigned a value more than once.
// NOTE - As a point of style, many Java programmers use UPPERCASE indentifiers for **final** constants.
class FinalD {
    public static void main(String[] args) {
        final String STR = "test final local variable";
        ErrorMsg err = new ErrorMsg();

        System.out.println(err.getErrorMsg(err.OUTERR, 0));
        System.out.println(err.getErrorMsg(err.DISKERR, 1));
        System.out.println(err.getErrorMsg(ErrorMsg.TESTERR, 2)); // static final
        System.out.println(STR); // final local variable
    }
}
