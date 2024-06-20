class UseThrowableMethods {
    public static void main(String[] args) {
        try {
            ExcTest.genException();
        } catch (ArrayIndexOutOfBoundsException exc) {
            System.out.println("Standard message is: ");
            System.out.println(exc);

            System.out.println();

            System.out.println("Stack trace: ");
            exc.printStackTrace();
        }

        System.out.println("After catch statement.");
    }
}
