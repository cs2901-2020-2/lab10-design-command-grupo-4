package command.requests;

import java.util.logging.Logger;

public class LivingRoomLight extends Light implements Request{
    private boolean isOn = Boolean.FALSE;

    Logger logger = Logger.getLogger(LivingRoomLight.class.getName());

    @Override
    public void on() {
        this.isOn = Boolean.TRUE;
    }

    @Override
    public void off() {
        this.isOn = Boolean.FALSE;
    }

    public Boolean getState() {
        return isOn;
    }
    
}