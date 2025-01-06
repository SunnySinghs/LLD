package Structural.Facade.HomeTheaterSystem;

public class Projector {
    public void turnOn() {
        System.out.println("Projector turned on.");
    }

    public void setInput(String input) {
        System.out.println("Projector input set to: " + input);
    }

    public void turnOff() {
        System.out.println("Projector turned off.");
    }
}
