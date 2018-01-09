package net.ed;

import org.junit.Test;

import static org.junit.Assert.*;

public class SaloonCarTest {

    SaloonCar saloonCar = new SaloonCar(1, "Red", "Toyota");

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
        SaloonCar car = new SaloonCar(6, "Red", "Ford");
        int seats = car.getNumberOfSeats();
        String color = car.getColor();
        String manufacturer = car.getManufacturer();
        System.out.println(color + " " + manufacturer + " with " + seats + " seats");
    }
}