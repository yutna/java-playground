// NOTE - The finally block is also executed if any code within the try block
// or any of its catch statements return from the method.
// คือต่อให้ใน try-catch มีคำสั่ง return เพื่อออกจาก method แต่ finally ก็ยังจะทำงานอยู่ดี หรือจะพูดได้
// No matter how the try block is exited, the finally block is executed.

// LINK - ./FinallyDemo.java

// Use Finally
class UseFinally {
    public static void genException(int what) {
        int t;
        int[] nums = new int[2];

        System.out.println("Receiving " + what);

        try {
            switch (what) {
                case 0:
                    t = 10 / what; // generate div-by-zero error
                    break;
                case 1:
                    nums[4] = 4; // generate array index error
                    break;
                case 2:
                    return; // return from try-block
            }
        } catch (ArithmeticException exc) {
            System.out.println("Can't divide by Zero!");
            return; // return from catch
        } catch (ArrayIndexOutOfBoundsException exc) {
            System.out.println("No matching element found.");
        } finally {
            System.out.println("Leaving try.");
        }
    }
}
