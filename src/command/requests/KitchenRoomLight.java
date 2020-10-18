package command.requests;

import java.util.logging.Logger;

public class KitchenRoomLight extends Light {

    Logger logger = Logger.getLogger(KitchenRoomLight.class.getName());

    @Override
    public void on() {
        this.isOn = Boolean.TRUE;
    }

    @Override
    public void off() {
        this.isOn = Boolean.FALSE;
    }
    
}