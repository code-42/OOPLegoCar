package net.ed;

import org.junit.Test;

import static org.junit.Assert.*;

public class CarTest {

    @Test
    public void getColour() throws Exception{
        Car car1 = new Car("Red", "Toyota");
        String expected = "Redd";
        String actual = car1.getColour();
        assertEquals(expected, actual);
    }

    @Test
    public void getManufacturer() throws Exception {
        Car car1 = new Car("Red", "Toyotera");
        String expected = "Toyota";
        String actual = car1.getManufacturer();
        assertEquals(expected, actual);
    }
}