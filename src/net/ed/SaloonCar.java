package net.ed;

/**
 * Make new SaloonCar class that inherits froom Car class
 * Add new property called: numberOfSeats
 */
public class SaloonCar extends Car {

    private int numberOfSeats;

    /**
     * Constructor 1 allows assignment of numberOfSeats only
     * @param numberOfSeats
     */
    public SaloonCar(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    /**
     * Constructor 2 allows assignment of numberOfSeats and manufacturer only
     * @param numberOfSeats
     * @param manufacturer
     */
    public SaloonCar(int numberOfSeats, String manufacturer) {
        super(manufacturer);
        this.numberOfSeats = numberOfSeats;
    }

    /**
     * Constructor 3 allows assignment of numberOfSeats, manufacturer and color
     * @param numberOfSeats
     * @param colour
     * @param manufacturer
     */
    public SaloonCar(int numberOfSeats, String colour, String manufacturer) {
        super(colour, manufacturer);
        this.numberOfSeats = numberOfSeats;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }
}
