package net.ed;

/**
 * Make new SaloonCar class that inherits from Car class
 * Add new property called: numberOfSeats
 */
public class SaloonCar extends Car {

    private int numberOfSeats;

    public SaloonCar() {
    }

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
     * @param manufacturer
     * @param colour
     */
    public SaloonCar(int numberOfSeats, String manufacturer, String colour) {
        super(manufacturer, colour);
        this.numberOfSeats = numberOfSeats;
    }

    /**
     * getter for numberOfSeats
     * @return numberOfSeats
     */
    public int getNumberOfSeats() {
        return numberOfSeats;
    }
}
