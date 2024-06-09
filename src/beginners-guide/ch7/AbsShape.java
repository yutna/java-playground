class AbsShape {
    public static void main(String[] args) {
        TwoDShape9[] shapes = new TwoDShape9[4];

        shapes[0] = new Triangle10("outlined", 8.0, 12.0);
        shapes[1] = new Rectangle3(10);
        shapes[2] = new Rectangle3(10, 4);
        shapes[3] = new Triangle10(7.0);

        for (int i = 0; i < shapes.length; i++) {
            System.out.println("object is " + shapes[i].getName());
            System.out.println("Area is " + shapes[i].area());
            System.out.println();
        }
    }
}
