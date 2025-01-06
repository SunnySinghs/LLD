package Behavioral.Momento;

public class Main {
    public static void main(String[] args) {
        ConfigurationCareTaker careTaker = new ConfigurationCareTaker();
        ConfigurationOriginator originator = new ConfigurationOriginator(10, 20);

        ConfigurationMomento snapshot1 = originator.createMomento();
        careTaker.addMomento(snapshot1);

        originator.setHeight(15);
        originator.setWidth(25);

        ConfigurationMomento snapshot2 = originator.createMomento();
        careTaker.addMomento(snapshot2);

        originator.setHeight(9);
        originator.setWidth(13);

        ConfigurationMomento restoreStateMomento = careTaker.undo();
        originator.restoreMomento(restoreStateMomento);

        System.out.println("Height: "+originator.getHeight() + "\nWidth: "+ originator.getWidth());
    }
}
