package net.ed;

/**
 * Make a Car class with properties: colour and manufacturer
 */
public class Car {

    private String colour;
    private String manufacturer;

    public Car() {
    }

    public Car(String colour, String manufacturer) {
        this.colour = colour;
        this.manufacturer = manufacturer;
    }

    public Car(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getColour() {
        return colour;
    }

    public String getManufacturer() {
        return manufacturer;
    }
}
