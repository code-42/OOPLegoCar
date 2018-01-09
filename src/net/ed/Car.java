package net.ed;

public class Car {

    private String colour;
    private String manufacturer;

    public Car(String colour, String manufacturer) {
        this.colour = colour;
        this.manufacturer = manufacturer;
    }

    public String getColour() {
        return colour;
    }

    public String getManufacturer() {
        return manufacturer;
    }
}
