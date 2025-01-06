package Behavioral.Command.Interface.Impl;

import Behavioral.Command.Interface.ICommand;
import Behavioral.Command.Receiver.AirConditioner;

public class TurnACOffCommand implements ICommand {
    AirConditioner ac;

    public TurnACOffCommand(AirConditioner ac) {
        this.ac = ac;
    }

    @Override
    public void execute() {
        ac.turnOffAC();
    }

    @Override
    public void undo() {
        ac.turnOnAC();
    }
}
