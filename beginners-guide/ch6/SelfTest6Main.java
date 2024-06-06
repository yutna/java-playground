class SelfTest6Main {
    public static void main(String[] args) {
        String reversedStr = SelfTest6.reverse("This is a test");
        System.out.println(reversedStr);
        System.out.println("Is valid: " + reversedStr.equals("tset a si sihT"));
    }
}
