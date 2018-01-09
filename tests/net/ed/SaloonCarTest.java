package net.ed;

import org.junit.Test;

import static org.junit.Assert.*;

public class SaloonCarTest {

    SaloonCar saloonCar = new SaloonCar(2, "Red", "Toyota");

    @Test
    public void getNumberOfSeats() throws Exception{
        int expected = 11;
        int actual = saloonCar.getNumberOfSeats();
        assertEquals(expected, actual);
    }

    @Test
    public void getManufacturer() throws Exception{
        String expected = "Toyota";
        String actual = saloonCar.getManufacturer();
        assertEquals(expected, actual);
    }

    @Test
    public void getColor() throws Exception{
        String expected = "Red";
        String actual = saloonCar.getColor();
        assertEquals(expected, actual);
    }

    @Test
    public void getAllProperties() {
        int seats = saloonCar.getNumberOfSeats();
        String color = saloonCar.getColor();
        String manufacturer = saloonCar.getManufacturer();
        System.out.println(color + " " + manufacturer + " with " + seats + " seats");
        String expected = "Red Toyota with 2 seats";
        String actual = color + " " + manufacturer + " with " + seats + " seats";
        assertEquals(expected, actual);
    }
}