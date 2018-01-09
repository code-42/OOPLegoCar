package net.ed;

import org.junit.Test;

import static org.junit.Assert.*;

public class SaloonCarTest {

    SaloonCar saloonCar = new SaloonCar(1, "Red", "Toyota");

    @Test
    public void getNumberOfSeats() {
        int expected = 11;
        int actual = saloonCar.getNumberOfSeats();
        assertEquals(expected, actual);
    }

    @Test
    public void getManufacturer() {
        String expected = "Toyotea";
        String actual = saloonCar.getManufacturer();
        assertEquals(expected, actual);
    }
}