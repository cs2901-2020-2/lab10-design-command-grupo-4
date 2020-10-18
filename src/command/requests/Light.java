package command.requests;

public abstract class Light {

    public boolean isOn = Boolean.FALSE;
    public void on() {}
    public void off() {}
    public Boolean getOn() {
        return isOn;
    }

}
