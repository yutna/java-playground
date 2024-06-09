// NOTE - A reference variable of a superclass can be assigned a reference to an object of any subclass derived from that superclass.
// NOTE - In other words, a superclass reference can refer to a subclass object.
class SupSubRef {
    public static void main(String[] args) {
        X2 x = new X2(10);
        X2 x2;
        Y2 y = new Y2(5, 6);

        x2 = x; // OK, both of same type
        System.out.println("x2.a: " + x2.a);

        x2 = y; // still OK because Y is derived from x
        System.out.println("x2.a: " + x2.a);

        // X references know only about X members
        x2.a = 19; // OK
        // x2.b = 27; // Error, X does NOT have a `b` member.
    }
}
