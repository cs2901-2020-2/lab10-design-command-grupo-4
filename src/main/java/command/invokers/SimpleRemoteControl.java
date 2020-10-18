package command.invokers;

import command.commands.Command;

public class SimpleRemoteControl {

    Command slot;

    public Command getSlot() {
        return slot;
    }

    public void setCommand(Command command){
        slot = command;
    }

    public void executeCommand(){
        slot.execute();
    }
}
