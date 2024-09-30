package bank;

public class AirConditioner {
    private boolean isOn;
    private int temperature;
    private int coolingLevel;

    public AirConditioner() {
        this.isOn = false;
        this.temperature = 24;
        this.coolingLevel = 10;
    }

    public void turnOn() {
        this.isOn = true;
    }

    public boolean isOn() {
        return this.isOn;
    }

    public void turnOff() {
        this.isOn = false;
    }

    public void increaseTemperature() {
        if (isOn && temperature < 30) {
            temperature++;
            coolingLevel--;
        }
    }

    public int getCoolingLevel() {
        return this.coolingLevel;
    }

    public void decreaseTemperature() {
        if (isOn && temperature > 16) {
            temperature--;
            coolingLevel++;
        }
    }

    public int getTemperature() {
        return this.temperature;
    }
}
