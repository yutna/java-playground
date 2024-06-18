class DefaultMethodDemo {
    public static void main(String[] args) {
        MyIFImp obj = new MyIFImp();
        MyIFImp2 obj2 = new MyIFImp2();

        // Can call getUserID(), because it is explicitly implemented by MyIFImp.
        System.out.println("User ID is " + obj.getUserID());

        // Can also call getAdminID(), because of default implementation:
        System.out.println("Administrator ID is " + obj.getAdminID());

        // Can call getUserID(), because it is explicitly implemented by MyIFImp.
        System.out.println("User ID is " + obj2.getUserID());

        // Can also call getAdminID(), but this is an overrided version.
        System.out.println("Administrator ID is " + obj2.getAdminID());
    }
}
