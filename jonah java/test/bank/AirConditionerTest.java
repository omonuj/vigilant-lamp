package bank;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class AirConditionerTest {

    @Test
    public void iHaveAnACWhenTurnOnItIsOn () {
        AirConditioner ac = new AirConditioner();
        ac.turnOn();
        assertTrue(ac.isOn(), "The a.c should be on after turning on");
    }

    @Test
    public void iHaveAnACWhenTurnOffItIsOff () {
        AirConditioner ac = new AirConditioner();
        ac.turnOff();
        assertFalse(ac.isOn(), "The a.c should be off after turning off");
    }

    @Test
    public void myACIsOnWhenIIncreaseTemperatureTheCoolingReduces () {
        AirConditioner ac = new AirConditioner();
        ac.turnOn();
        int initialCoolingLevel = ac.getCoolingLevel();
        ac.increaseTemperature();
        int reducedCoolingLevel = ac.getCoolingLevel();
        assertTrue(ac.isOn(), "The a.c should be on after turning on");
        assertEquals(initialCoolingLevel - 1,9, reducedCoolingLevel, "The cooling level should reduced when the temperature is increased");

    }

    @Test
    public void myACIsOnWhenIDecreaseTemperatureTheCoolingIncreases () {
        AirConditioner ac = new AirConditioner();
        ac.turnOn();
        int initialCoolingLevel = ac.getCoolingLevel();
        ac.decreaseTemperature();
        int increasedCoolingLevel = ac.getCoolingLevel();
        assertTrue(ac.isOn(), "The a.c should be on after turning on");
        assertEquals(initialCoolingLevel + 1, 9, increasedCoolingLevel, "The cooling level increase when the temperature is reduced");
    }

    @Test
    public void myACIsOnWhenIIncreaseTemperatureBeyond30TemperatureIsStill30 () {
        AirConditioner ac = new AirConditioner();
        ac.turnOn();
        for (int start = 1; start <= 20; start++) {
            ac.increaseTemperature();
        }
        assertEquals(30, ac.getTemperature(), "the temperature should exceed 30 degrees");
    }

    @Test
    public void myACIsOnWhenIDecreaseTemperatureBellow16TemperatureIsStill16 () {
        AirConditioner ac = new AirConditioner();
        ac.turnOn();
        for (int start = 0; start < 20; start++) {
            ac.decreaseTemperature();
        }
        assertEquals(16, ac.getTemperature(), "The temperature should not go bellow 16 degrees");
    }

}
