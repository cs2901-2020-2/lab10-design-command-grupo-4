package command.commands;

import command.requests.GarageDoor;

public class GarageDoorCloseCommand implements Command {

    GarageDoor garageDoor;

    @Override
    public GarageDoor getSelf() {
        return garageDoor;
    }

    public GarageDoorCloseCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.close();
    }

}
