package command.invokers;

import java.util.ArrayList;
import java.util.List;
import command.commands.Command;

public class RemoteControl {

    private List<Command> commands = new ArrayList<>();

    public void addCommand(Command command) {
        this.commands.add(command);
    }

    public void executeCommands() {
        for (Command command : this.commands) {
            command.execute();
        }
        this.commands.clear();
    }

    public List<Command> getCommands() {
        return commands;
    }
}
