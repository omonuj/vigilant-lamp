package bank;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BikeTest {

    @Test
    public void testBikeCanBeTurnOn () {
        Bike bike = new Bike();
        bike.turnOn();
        assertTrue(bike.isOn(),"The bike should be on after turning on");

    }

    @Test
    public void testBikeCanBeTurnOff () {
        Bike bike = new Bike();
        bike.turnOff();
        assertFalse(bike.isOn(),"The bike should not be on after turning off");
    }

    @Test
    public void whenBikeIsOnGear1ItAcceleratesInIncrementOf1 (){
        Bike bike = new Bike();
        bike.turnOn();
        bike.setGear(1);
        bike.accelerate();
        assertEquals(16, bike.getSpeed(), "The speed be 16 when accelerated in gear 1");

    }

    @Test
    public void whenBikeIsOnGear2ItAcceleratesInIncrementOf2 (){
        Bike bike = new Bike();
        bike.turnOn();
        bike.setGear(2);
        bike.accelerate();
        assertEquals(17, bike.getSpeed(), "The speed be 17 when accelerated in gear 2");
    }

    @Test
    public void whenBikeIsOnGear3ItAcceleratesInIncrementOf3 (){
        Bike bike = new Bike();
        bike.turnOn();
        bike.setGear(3);
        bike.accelerate();
        assertEquals(18, bike.getSpeed(), "The speed be 18 when accelerated in gear 3");
    }

    @Test
    public void whenBikeIsOnGear4ItAcceleratesInIncrementOf4 (){
        Bike bike = new Bike();
        bike.turnOn();
        bike.setGear(4);
        bike.accelerate();
        assertEquals(19, bike.getSpeed(), "The speed be 19 when accelerated in gear 4");
    }

    @Test
    public void whenBikeIsOnGear1ItCanDeceleratesInDecrementOf1 () {
        Bike bike = new Bike();
        bike.turnOn();
        bike.setGear(1);
        bike.decelerate();
        assertEquals(14, bike.getSpeed(), "The speed be 14 when decelerated in gear 1");
    }

    @Test
    public void whenBikeIsOnGear2ItCanDeceleratesInDecrementOf2 () {
        Bike bike = new Bike();
        bike.turnOn();
        bike.setGear(2);
        bike.decelerate();
        assertEquals(13, bike.getSpeed(), "The speed be 13 when decelerated in gear 2");
    }
}
