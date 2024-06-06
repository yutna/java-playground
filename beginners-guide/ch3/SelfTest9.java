class SelfTest9 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10_000; i += i) {
            System.out.println(i);
        }
    }
}
