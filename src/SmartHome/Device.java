package SmartHome;

public abstract class Device {
    private String name;
    private boolean on;

    public Device(String name,boolean on){
        this.name = name;
        this.on = on;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void turnOn(){
        on = true;
    }

    public void turnOff(){
        on = false;
    }

    public boolean isOn(){
        return on;
    }
}
