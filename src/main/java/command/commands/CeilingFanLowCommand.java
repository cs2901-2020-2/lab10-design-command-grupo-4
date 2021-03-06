package command.commands;

import command.requests.CeilingFan;

public class CeilingFanLowCommand implements Command {

    CeilingFan ceilingFan;

    @Override
    public CeilingFan getSelf() {
        return ceilingFan;
    }

    public CeilingFanLowCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        ceilingFan.low();
    }
    
}