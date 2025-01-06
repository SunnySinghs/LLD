package Behavioral.Command.Interface.Impl;

import Behavioral.Command.Interface.ICommand;
import Behavioral.Command.Receiver.AirConditioner;

public class TurnACOnCommand implements ICommand {
    AirConditioner ac;

    public TurnACOnCommand(AirConditioner ac) {
        this.ac = ac;
    }

    @Override
    public void execute() {
        ac.turnOnAC();
    }

    @Override
    public void undo() {
        ac.turnOffAC();
    }
}
