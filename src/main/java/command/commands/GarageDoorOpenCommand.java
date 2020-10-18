package command.commands;

import command.requests.GarageDoor;

public class GarageDoorOpenCommand implements Command {

    GarageDoor garageDoor;

    @Override
    public GarageDoor getSelf() {
        return garageDoor;
    }

    public GarageDoorOpenCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.open();
    }

}
