package command.invokers;

import command.commands.Command;

public class SimpleRemoteControl {

    Command slot;

    public void setCommand(Command command){
        slot = command;
    }

    public void executeCommands(){
        slot.execute();
    }
}
