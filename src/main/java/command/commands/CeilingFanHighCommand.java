package command.commands;

import command.requests.CeilingFan;
import command.requests.Request;

public class CeilingFanHighCommand implements Command {

    CeilingFan ceilingFan;


    @Override
    public Request getSelf() {
        return ceilingFan;
    }

    public CeilingFanHighCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        ceilingFan.high();
    }
    
}