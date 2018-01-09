package net.ed;

/**
 * Make a Car class with properties: colour and manufacturer
 */
public class Car {

    private String colour;
    private String manufacturer;

    /**
     * Default constructor
     */
    public Car() {
    }

    /**
     * Constructor instantiates object with color and manufacturer
     * @param colour
     * @param manufacturer
     */
    public Car(String colour, String manufacturer) {
        this.colour = colour;
        this.manufacturer = manufacturer;
    }

    /**
     * Constructor instantiates object with manufacturer only
     * @param manufacturer
     */
    public Car(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    /**
     * getter for color property
     * @return
     */
    public String getColour() {
        return colour;
    }

    /**
     * getter for manufacturer property
     * @return
     */
    public String getManufacturer() {
        return manufacturer;
    }
}
