package xyz.yutna.books.beginnersguide.ch4;

public class AddMeth {
    public static void main(String[] args) {
        Vehicle minivan = new Vehicle();
        Vehicle sportscar = new Vehicle();

        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        sportscar.passengers = 2;
        sportscar.fuelcap = 14;
        sportscar.mpg = 12;

        System.out.print("Minivan can carry " + minivan.passengers + ". ");
        minivan.range(); // Display range of minivan

        System.out.print("SportCar can carry " + sportscar.passengers + ". ");
        sportscar.range(); // Display range of sportscar
    }
}
