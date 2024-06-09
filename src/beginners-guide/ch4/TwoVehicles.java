class TwoVehicles {
    public static void main(String[] args) {
        Vehicle minivan = new Vehicle();
        Vehicle sportscar = new Vehicle();

        int range1, range2;

        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        sportscar.passengers = 2;
        sportscar.fuelcap = 14;
        sportscar.mpg = 12;

        range1 = minivan.fuelcap * minivan.mpg;
        range2 = sportscar.fuelcap * sportscar.mpg;

        System.out.println("Minivan can carry " + minivan.passengers + " with a range of " + range1);
        System.out.println("sportscar can carry " + sportscar.passengers + " with a range of " + range2);

        Vehicle car1 = new Vehicle();
        Vehicle car2 = car1;
        Vehicle car3 = new Vehicle();

        car1.mpg = 26;

        System.out.println(car1.mpg); // 26
        System.out.println(car2.mpg); // 26

        car3.mpg = 30;
        car2 = car3;

        System.out.println(car1.mpg); // 26
        System.out.println(car2.mpg); // 30
        System.out.println(car3.mpg); // 30
    }
}
