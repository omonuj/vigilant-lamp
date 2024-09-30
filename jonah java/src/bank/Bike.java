package bank;

public class Bike {
    private boolean isOn;
    private int speed;
    private int gear;

    public Bike() {
        this.isOn = false;
        this.speed = 15;
        this.gear = 1;
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

    public void accelerate() {
        if (isOn) {
            switch (gear) {
                case 1:
                    speed += 1;
                    break;
                case 2:
                    speed += 2;
                    break;
                case 3:
                    speed += 3;
                    break;
                case 4:
                    speed += 4;
                    break;


            }
        }
    }
    public void setGear(int gear) {
        if (gear >= 1 && gear <= 4) {
            this.gear = gear;
        }
    }

    public int getSpeed() {
        return speed;
    }
    public int getGear() {
        return gear;
    }

    public void decelerate() {
        if (isOn) {
            switch (gear) {
                case 1:
                    speed -= 1;
                    break;
                case 2:
                    speed -= 2;
                    break;
                case 3:
                    speed -= 3;
                    break;
                case 4:
                    speed -= 4;
                    break;
            }
        }
    }
}

