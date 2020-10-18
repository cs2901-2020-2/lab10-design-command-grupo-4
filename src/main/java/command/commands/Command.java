package command.commands;

import command.requests.Request;

public interface Command {
    public void execute();

    public Request getSelf();
}

