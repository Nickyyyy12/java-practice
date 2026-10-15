package se07.SmartHome;

public class SmartHomeController {

    public void turnOnDevice(Device device) {
        device.turnOn();
    }

    public void turnOffDevice(Device device){
        device.turnOff();
    }

    public void toggleDevice(Device device){
        if (device.isOn()){
            device.turnOff();
        }else {
            device.turnOn();
        }
    }
}
