package command.requests;

import java.util.logging.Logger;

public class LivingRoomLight extends Light {

    Logger logger = Logger.getLogger(LivingRoomLight.class.getName());

    @Override
    public void on() {
        this.isOn = Boolean.TRUE;
    }

    @Override
    public void off() {
        this.isOn = Boolean.FALSE;
    }
    
}