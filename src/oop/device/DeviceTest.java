package oop.device;


public class DeviceTest {
    public static void main(String[] args) {
        Device p1 = new Phone("苹果",21,18);
        Device f1 = new Fan("格力",118,8);

        p1.start();
        p1.printInfo();

        f1.start();
        f1.printInfo();

        System.out.println("--------");

        Device[] device = new Device[2];
        device[0] = new Phone("苹果",21,18);
        device[1] = new Fan("格力",118,8);

        for (int i = 0;i<device.length;i++){
            device[i].start();
            device[i].printInfo();
        }

        System.out.println("--------");

        Chargeable[] devices = new Chargeable[2];
        devices[0] = new Phone("苹果", 6999, 6.1);
        devices[1] = new Fan("美的", 199, 3);

        for (int i = 0; i < devices.length; i++) {
            devices[i].charge();
        }
    }
}
