package command.commands;

import command.requests.Light;

public class LightOffCommand implements Command {

    Light light;

    @Override
    public Light getSelf() {
        return light;
    }

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }

}
