package wk3;

class Lamp {
    boolean isOn;

    public Lamp() {
        this.isOn = false;
    }

    public void turnOn() {
        this.isOn = true;
        System.out.println("Lamp is turned ON.");
    }

    public void turnOff() {
        this.isOn = false;
        System.out.println("Lamp is turned OFF.");
    }

    public boolean isOn() {
        return isOn;
    }
}

public class Task6 {
    public static void main(String[] args) {
        Lamp lamp = new Lamp();
        lamp.turnOn();
        System.out.println("Lamp is currently: " + lamp.isOn());
        lamp.turnOff();
        System.out.println("Lamp is currently: " + lamp.isOn());
    }
}
