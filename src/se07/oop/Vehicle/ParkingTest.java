package se07.oop.Vehicle;

import java.util.*;

public class ParkingTest {
    public static void main(String[] args) {

        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new NormalVehicle("0021",0));
        vehicles.add(new MemberVehicle("2111",0,0.8));
        vehicles.add(new MemberVehicle("0721",6,0.9));
        Map<String, Vehicle> vehicleMap = new HashMap<>();
        vehicleMap.put("0721",new MemberVehicle("0721",6,0.9));
        vehicleMap.put("0021", new NormalVehicle("0021",0));
        vehicleMap.put("2111", new MemberVehicle("2111",0,0.8));

        Vehicle v = vehicleMap.get("0721");
        System.out.println("查到的车牌号是：" + v.getPlateNumber());

        Vehicle c = vehicleMap.get("0021");
        System.out.println("查到的车牌号是：" + c.getPlateNumber());

        if (vehicleMap.containsKey("9999")){
            Vehicle b = vehicleMap.get("9999");
            System.out.println(b.getPlateNumber());
        }else {
            System.out.println("查无此车");
        }

        for (Map.Entry<String, Vehicle> entry : vehicleMap.entrySet()){
           String key = entry.getKey();
           Vehicle value = entry.getValue();
            System.out.println("车牌号：" + key + "，对应车对象车牌：" + value.getPlateNumber());
        }

        for (int i = 0;i<vehicles.size();i++){
            System.out.println("车牌号是："+vehicles.get(i).getPlateNumber());
        }

        vehicles.remove(1);
        for (int i = 0;i<vehicles.size();i++){
            System.out.println("车牌号是："+vehicles.get(i).getPlateNumber());
        }

        System.out.println("现在一共有：" + Vehicle.getCount()+"辆车");


        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.println("1选择普通车");
            System.out.println("2选择会员车");
            System.out.println("3退出");

            int input = sc.nextInt();

            switch (input){
                case 1:
                    while (true) {
                        System.out.println("您选择普通车");
                        System.out.println("输入1：充值");
                        System.out.println("输入2：缴费");
                        System.out.println("输入3：查看余额");
                        System.out.println("输入4：退出");
                        int input2 = sc.nextInt();

                        switch (input2) {
                            case 1:
                                try {
                                    System.out.println("请输入充值数目");
                                    double amount = sc.nextDouble();
                                    vehicles.get(0).recharge(amount);
                                } catch (Exception e) {
                                    System.out.println("输入有误，请输入数字");
                                    sc.nextLine();
                                }
                                break;

                            case 2:
                                try {
                                    System.out.println("请输入缴费数目");
                                    double amount = sc.nextDouble();
                                    vehicles.get(0).pay(amount);
                                } catch (Exception e) {
                                    System.out.println("输入有误，请输入数字");
                                    sc.nextLine();
                                }
                                break;

                            case 3:
                                System.out.println("查余额");
                                vehicles.get(0).checkBalance();
                                break;

                            case 4:
                                System.out.println("这里是返回");
                                break;

                            default:
                                System.out.println("输入有误，请重新选择");
                                break;
                        }

                        if (input2 == 4) {
                            break;
                        }
                    }
                    break;

                case 2:
                    while (true){
                        System.out.println("您选择会员车");
                        System.out.println("输入1：充值");
                        System.out.println("输入2：缴费");
                        System.out.println("输入3：查看余额");
                        System.out.println("输入4：退出");
                        int input3 = sc.nextInt();
                        switch (input3){
                            case 1:
                                try {
                                    System.out.println("请输入充值数目");
                                    double amount = sc.nextDouble();
                                    vehicles.get(1).recharge(amount);
                                }catch (Exception e){
                                    System.out.println("输入有误，请输入数字");
                                    sc.nextLine();
                                }
                                break;

                            case 2:
                                try {
                                    System.out.println("请输入缴费数目");
                                    double amount = sc.nextDouble();
                                    vehicles.get(1).pay(amount);
                                }catch (Exception e) {
                                    System.out.println("输入有误，请输入数字");
                                    sc.nextLine();
                                }
                                break;

                            case 3:
                                System.out.println("查余额");
                                vehicles.get(1).checkBalance();
                                break;

                            case 4:
                                System.out.println("这里是返回");
                                break;

                            default:
                                System.out.println("输入有误，请重新选择");
                                break;
                        }

                        if (input3 == 4){
                            break;
                        }
                    }
                    break;

                case 3:
                    System.out.println("这里是退出");
                    break;

                default:
                    System.out.println("输入有误，请重新选择");
                    break;

            }
            if (input == 3){
                break;
            }
        }
    }
}
