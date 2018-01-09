package net.ed;

/**
 * Make a Car class with properties: color and manufacturer
 */
public class Car {

    private String color;
    private String manufacturer;

    /**
     * Default constructor
     */
    public Car() {
    }

    /**
     * Constructor instantiates object with color and manufacturer
     * @param color
     * @param manufacturer
     */
    public Car(String color, String manufacturer) {
        this.color = color;
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
     * @return String color
     */
    public String getColor() {
        return color;
    }

    /**
     * getter for manufacturer property
     * @return String manufacturer
     */
    public String getManufacturer() {
        return manufacturer;
    }
}
