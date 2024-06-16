import java.text.DecimalFormat;

public class SavingsCalculator {
    public static void main(String[] args) {
        double salary = 80_000.0; // เงินเดือน
        double savingRate = 40.0 / 100.0; // จะเก็บกี่ % ต่อเดือน
        double P = salary * savingRate * 12; // เงินฝากต่อปี
        double r = 0.75 / 100.0; // อัตราดอกเบี้ยต่อปี
        double inflationRate = 2.5 / 100.0; // อัตราเงินเฟ้อต่อปี
        int t = 60 - 35; // จำนวนปี (อายุที่จะเกษียนหรือเลิกทำงาน - อายุปัจจุบัน)

        double totalAmount = calculateTotalAmount(P, r, t);
        double presentValue = calculatePresentValue(totalAmount, inflationRate, t);
        DecimalFormat formatter = new DecimalFormat("#,###.00");

        System.out.println("Saving per month: " + formatter.format(salary * savingRate) + " Baht");
        System.out.println("Number of years of deposit: " + t + " years");
        System.out.println("Total amount saved by age 60: " + formatter.format(totalAmount) + " Baht");
        System.out.println("Present value of total amount: " + formatter.format(presentValue) + " Baht");
    }

    public static double calculateTotalAmount(double P, double r, int t) {
        double totalAmount = 0.0;

        for (int i = 0; i < t; i++) {
            totalAmount += P * Math.pow(1 + r, t - i);
        }

        return totalAmount;
    }

    public static double calculatePresentValue(double futureValue, double inflationRate, int t) {
        return futureValue / Math.pow(1 + inflationRate, t);
    }
}
