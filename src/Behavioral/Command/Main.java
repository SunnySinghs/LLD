package Behavioral.Command;

import Behavioral.Command.Interface.Impl.TurnACOnCommand;
import Behavioral.Command.Invoker.MyRemoteControl;
import Behavioral.Command.Receiver.AirConditioner;

public class Main {
    public static void main(String[] args) {
        AirConditioner airConditioner = new AirConditioner();
        MyRemoteControl myRemoteControl = new MyRemoteControl();
        myRemoteControl.setCommand(new TurnACOnCommand(airConditioner));
        myRemoteControl.pressButton();
        myRemoteControl.undo();
    }
}
