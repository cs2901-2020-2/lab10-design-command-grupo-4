package command.commands;

import command.requests.Light;

public class LightOnCommand implements Command {

    Light light;

    @Override
    public Light getSelf() {
        return light;
    }

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }

}
