package net.ed;

public class Main {

    public static void main(String[] args) {

        // Make car1 object (instantiate with color Red and manufacturer Toyota)
        Car car1 = new Car("Red", "Toyota");

        // Create object saloonCar1 with 2 seats
        SaloonCar saloonCar1 = new SaloonCar(2);
        System.out.println(saloonCar1.getNumberOfSeats());

        // Create object saloonCar2 with 3 seats and manufacturer Nissan
        SaloonCar saloonCar2 = new SaloonCar(3, "Nissan");
        System.out.println(saloonCar2.getManufacturer() + " with " +
                saloonCar2.getNumberOfSeats() + " seats.");

        // Create object saloonCar3 with 4 seats, manufacturer Ford and color purple
        SaloonCar saloonCar3 = new SaloonCar(4, "Ford", "Purple");
        System.out.println(
                saloonCar3.getManufacturer() + " " +
                saloonCar3.getColour() + " with " +
                saloonCar3.getNumberOfSeats() + " seats.");

    }
}
