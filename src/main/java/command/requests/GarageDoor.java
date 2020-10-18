package command.requests;

import java.util.logging.Logger;

public class GarageDoor implements Request{

    private Boolean isClosed = Boolean.TRUE;
    Logger logger = Logger.getLogger(GarageDoor.class.getName());

    public void open() {
        isClosed = false;
        logger.info("The garage door has been opened"); 
    }

    public void close() {
        isClosed = true;
        logger.info("The garage door has been closed"); 
    }

    public Boolean getState() {
        return isClosed;
    }

}