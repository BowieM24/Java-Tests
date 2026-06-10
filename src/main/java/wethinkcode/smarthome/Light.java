package wethinkcode.smarthome;

public class Light extends Device {
    
    private int brightness;

    public Light(String name) {
        super(name);
        this.brightness = 0;
    }

    public void setBrightness(int brightness) {
        if (brightness < 0) {
            this.brightness = 0;
        } elif (brightness > 100) {
            this.brightness = 100;
        } else {
            this.brightness = brightness;

        }
        }
    }
    
}
