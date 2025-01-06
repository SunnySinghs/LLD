package Behavioral.Command.Invoker;

import Behavioral.Command.Interface.ICommand;

import java.util.Stack;

public class MyRemoteControl {
    ICommand command;
    Stack<ICommand> stack = new Stack<>();
    public void setCommand(ICommand command) {
        this.command = command;
    }

    public void pressButton() {
        command.execute();
        stack.push(command);
    }

    public void undo() {
        if(!stack.isEmpty()) {
            ICommand lastCommand = stack.pop();
            lastCommand.undo();
        }
    }
}
