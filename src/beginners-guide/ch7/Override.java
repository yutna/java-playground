// NOTE - When a method in a subclass has the same return type and signature as a method in it superclass,
// then the method is the subclass is said to `override` the method in the superclass.

class Override {
    public static void main(String[] args) {
        B2 subOb = new B2(1, 2, 3);
        subOb.show();
    }
}
