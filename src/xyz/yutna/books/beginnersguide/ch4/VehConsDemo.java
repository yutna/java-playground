package xyz.yutna.books.beginnersguide.ch4;

public class VehConsDemo {
    public static void main(String[] args) {
        Vehicle2 minivan = new Vehicle2(7, 16, 21);
        Vehicle2 sportscar = new Vehicle2(2, 14, 12);

        double gallons;
        int dist = 252;

        gallons = minivan.fuelNeeded(dist);
        System.out.println("To go " + dist + " miles minivan needs " + gallons + " gallons of fuel.");

        gallons = sportscar.fuelNeeded(dist);
        System.out.println("To go " + dist + " miles sportscar needs " + gallons + " gallons of fuel.");
    }
}
