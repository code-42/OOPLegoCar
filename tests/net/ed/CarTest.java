package net.ed;

import org.junit.Test;
import static org.junit.Assert.*;

public class CarTest {

    @Test
    public void getColor() throws Exception{
        Car car1 = new Car("Red", "Toyota");
        String expected = "Red";
        String actual = car1.getColor();
        assertEquals(expected, actual);
    }

    @Test
    public void getManufacturer() throws Exception {
        Car car1 = new Car("Red", "Toyota");
        String expected = "Toyota";
        String actual = car1.getManufacturer();
        assertEquals(expected, actual);
    }
}