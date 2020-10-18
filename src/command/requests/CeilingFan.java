package command.requests;

import java.util.logging.Logger;

public class CeilingFan {

    private Boolean isHigh = Boolean.FALSE;
    Logger logger = Logger.getLogger(CeilingFan.class.getName());

    public void high() {
        isHigh = Boolean.TRUE;
        logger.info("The ceiling fan is set high"); 
    }

    public void low() {
        isHigh = Boolean.FALSE;
        logger.info("The ceiling fan is set low"); 
    }

    public Boolean getHigh() {
        return isHigh;
    }
    
}