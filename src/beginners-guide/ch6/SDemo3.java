class SDemo3 {
    public static void main(String[] args) {
        new StaticBlock("Inside Constructor");

        System.out.println("Square root of 2 is " + StaticBlock.rootOf2);
        System.out.println("Square root of 3 is " + StaticBlock.rootOf3);

    }
}
