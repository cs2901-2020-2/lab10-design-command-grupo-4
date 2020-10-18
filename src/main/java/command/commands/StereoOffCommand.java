package command.commands;

import command.requests.Stereo;

public class StereoOffCommand implements Command {

    Stereo stereo;

    @Override
    public Stereo getSelf() {
        return stereo;
    }

    public StereoOffCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.off();
    }

}
