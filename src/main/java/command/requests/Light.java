package command.requests;

public abstract class Light implements Request{

    public boolean isOn = Boolean.FALSE;
    public void on() {}
    public void off() {}
    public Boolean getState() {
        return isOn;
    }

}
