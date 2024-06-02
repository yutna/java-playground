package xyz.yutna.books.abeginnersguide.ch2;

// A promotion surprise
public class PromDemo {
    public static void main(String[] args) {
        byte b;
        int i;

        b = 10;
        i = b * b; // OK, no cast needed

        b = 10;
        b = (byte) (b * b); // cast needed here to assign an int to byte 🤔
        // คูณกันได้ 100 ยังไม่เกินขนาดที่ byte จะรับได้ ทำไมมันแปลงไปเป็น int ล่ะ? (surprise สมกับชื่อหัวข้อ 55+)

        System.out.println("i and b: " + i + " " + b);

        char ch1 = 'a', ch2 = 'b';
        ch1 = (char) (ch1 + ch2);

        System.out.println("ch1 is " + ch1 + ", ch2 is " + ch2);
    }
}
