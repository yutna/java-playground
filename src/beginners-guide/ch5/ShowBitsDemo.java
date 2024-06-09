class ShowBitsDemo {
    public static void main(String[] args) {
        ShowBits2 b = new ShowBits2(8);
        ShowBits2 i = new ShowBits2(32);
        ShowBits2 li = new ShowBits2(64);

        System.out.println("123 in binary: ");
        b.show(123);

        System.out.println("\n87,987 in binary: ");
        i.show(87_987);

        System.out.println("\n237,658,768 in binary: ");
        li.show(237_658_768);

        // You can also show low-order bits of any integer.
        System.out.println("\nLow order 8 bits of 87,987 in binary");
        b.show(87_987);
    }
}
