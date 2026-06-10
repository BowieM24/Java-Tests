public class Device {

    private String name;
    private boolean isOn;

    public Device(String name) {
        this.name = name;
        this.isOn = false;
    }

    public void turnOn() {
        isOn = true;
    }
    
    public void turnOff() {
        isOn = false;
    }

    public boolean isOn() {
        return isOn;
    }

    public String getStatus() {
        if (isOn) {
            return "On";
        } else {
            return "Off";
        }
    }

}