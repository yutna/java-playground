import java.text.DecimalFormat;

class MotorcycleInstallment {
    public static void main(String[] args) {
        calculateInstallment(67_900, 50.0, 1.49, 12);
    }

    public static void calculateInstallment(double total, double downPaymentInPercent, double interestRatePerMonth,
            int months) {
        double remaining = total * (downPaymentInPercent / 100);
        double totalInterestRate = 1 + (interestRatePerMonth * months / 100);
        double totalPayment = remaining * totalInterestRate;
        double paymentPerMonth = totalPayment / months;

        DecimalFormat formatter = new DecimalFormat("#,###.00");

        System.out.println("ราคารถ " + formatter.format(total) + " บาท");
        System.out.println("ดาวน์ที่ " + formatter.format(downPaymentInPercent) + "%");
        System.out.println("จะเหลือยอดจัดเท่ากับ " + formatter.format(remaining) + " บาท");
        System.out.println("ดอกเบี้ย " + formatter.format(interestRatePerMonth) + "% ต่อเดือน");
        System.out.println("ระยะเวลาผ่อนชำระทั้งหมด " + months + " เดือน");
        System.out.println("ยอดที่ต้องชำระทั้งหมดเท่ากับ " + formatter.format(totalPayment) + " บาท");
        System.out.println("ยอดดอกเบี้ยทั้งหมดเท่ากับ " + formatter.format(totalPayment - remaining) + " บาท");
        System.out.println("ยอดชำระต่อเดือนเท่ากับ " + formatter.format(paymentPerMonth) + " บาท/เดือน");
    }
}
