package command.commands;

import command.requests.Stereo;

public class StereoOnCommand implements Command {

    Stereo stereo;

    @Override
    public Stereo getSelf() {
        return stereo;
    }

    public StereoOnCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.on();
    }

}
