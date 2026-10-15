package se07.SmartHome;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Device livingRoomLamp = new Lamp("livingRoomLamp",false);
        Device bedroomLamp = new Lamp("bedroomLamp",false);
        Device livingRoomTv = new Television("livingRoomTv",true);
        Device washingMachine = new WashingMachine("washingMachine", false);
        SmartHomeController  controller = new SmartHomeController();


        Device[] devices = {livingRoomLamp, bedroomLamp, livingRoomTv, washingMachine};
        for (int i = 0; i < devices.length; i++) {
            System.out.println((i + 1) + " "+devices[i].getName()+ " " +devices[i].isOn());
        }


        Scanner scanner = new Scanner(System.in);
        System.out.println("请选择设备编号（1—4）：");
        int choice = scanner.nextInt();
        if (choice < 1 || choice > devices.length){
            System.out.println("编号不合法");
            return;
        }
        Device selectedDevice = devices[choice - 1];
        System.out.println(selectedDevice.getName() + " " + selectedDevice.isOn());
        System.out.println("请选择操作：1 打开，2 关闭, 3 切换开关");
        int action = scanner.nextInt();


        if(action ==1){
            controller.turnOnDevice(selectedDevice);
            System.out.println(selectedDevice.getName() + " " + selectedDevice.isOn());
        }else if (action ==2){
            controller.turnOffDevice(selectedDevice);
            System.out.println(selectedDevice.getName() + " " + selectedDevice.isOn());
        }else if (action ==3){
            controller.toggleDevice(selectedDevice);
            System.out.println(selectedDevice.getName() + " " + selectedDevice.isOn());
        }else {
            System.out.println("操作无效");
        }

    }
}
