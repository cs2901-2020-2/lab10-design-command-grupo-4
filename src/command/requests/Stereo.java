package command.requests;

import java.util.logging.Logger;

public class Stereo {

    private Boolean isOn = Boolean.FALSE;
    Logger logger = Logger.getLogger(Stereo.class.getName());

    public void on() {
        isOn = Boolean.TRUE;
        logger.info("The stereo is turned on"); 
    }

    public void off() {
        isOn = Boolean.FALSE;
        logger.info("The stereo is turned off"); 
    }

    public Boolean getOn() {
        return isOn;
    }
    
}