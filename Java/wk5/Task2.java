package wk5;

abstract class Vehicle {
    abstract void wheel();
    void door() {
        System.out.println("Vehicle has doors.");
    }
}

class Bus extends Vehicle {
    @Override
    void wheel() {
        System.out.println("Bus has wheels.");
    }
    @Override
    void door() {
        System.out.println("Bus has doors.");
    }

}

public class Task2 {
    public static void main(String[] args) {
        Bus bus = new Bus();
        bus.wheel();
        bus.door();
    }
}
