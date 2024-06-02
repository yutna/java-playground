package xyz.yutna.books.abeginnersguide.ch3;

/*
 * NOTE: As with the `break` statement, `continue` may specify a label to
 * describe which enclosing **loop** to continue.
 *
 * จากที่สังเกตนะความแตกต่างการใช้ label ระหว่าง break กับ continue คือ continue จะไม่ได้
 * label ที่ block เหมือนกับ break แต่จะ label ที่ตัวคำสั่ง loop แบบในตัวอย่างข้างล่าง
 * พอลองใช้ block แบบ break จะขึ้น error เลย
 * เหมือนกับว่าเรามา label เพื่อให้มัน continue มาที่ loop เพื่อให้ทำ iteration statement และ
 * conditional statement นี้นะว่าผ่านไหม ถ้าผ่านจะได้ดำเนินการต่อ อะไรทำนองนั้น
 */

// Use continue with a label.
public class ContToLabel {
    public static void main(String[] args) {
        outer: for (int i = 1; i < 10; i++) {
            System.out.print("\nOuter loop pass " + i + ", inner loop: ");
            for (int j = 1; j < 10; j++) {
                if (j == 5) continue outer;
                System.out.print(j);
            }
        }
    }
}
