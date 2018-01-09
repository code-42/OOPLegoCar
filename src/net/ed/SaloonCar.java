package net.ed;

import java.util.ArrayList;

/**
 * Make new SaloonCar class that inherits from Car class
 * Add new property called: numberOfSeats
 */
public class SaloonCar extends Car {

    private int numberOfSeats;

    /**
     * Default constructor
     */
    public SaloonCar() {
    }

    /**
     * Constructor 1 allows assignment of numberOfSeats only
     * @param numberOfSeats int
     */
    public SaloonCar(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    /**
     * Constructor 2 allows assignment of numberOfSeats and manufacturer only
     * @param numberOfSeats int
     * @param manufacturer String
     */
    public SaloonCar(int numberOfSeats, String manufacturer) {
        super(manufacturer);
        this.numberOfSeats = numberOfSeats;
    }

    /**
     * Constructor 3 allows assignment of numberOfSeats, manufacturer and color
     * @param numberOfSeats int
     * @param manufacturer String
     * @param color String
     */
    public SaloonCar(int numberOfSeats, String manufacturer, String color) {
        super(manufacturer, color);
        this.numberOfSeats = numberOfSeats;
    }

    /**
     * getter for numberOfSeats
     * @return int numberOfSeats
     */
    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public Car getAllProperties() throws Exception {
        SaloonCar car = null;
        String color = this.getColor();
        String manufacturer = this.getManufacturer();
        int seats = this.getNumberOfSeats();
        return car;
    }
}
