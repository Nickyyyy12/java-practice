package basics;

import java.util.Scanner;

public class Taxi {
    public static void main(String[] args) {
        System.out.println("乘客");
        Scanner sc = new Scanner(System.in);

        String passengerName = sc.nextLine();
        System.out.println("距离");

        double 	distance = sc.nextDouble();
        System.out.println("高峰");

        int isPeak = sc.nextInt();

        boolean peak = isPeak == 1;

        double baseFare;
        if (distance <= 3){
            baseFare = 10;
        }else {
            baseFare =  10 + (distance - 3) * 2;
        }

        double AFare = actualFare(baseFare,peak);
        printReport(passengerName,distance,baseFare,peak,AFare);

    }

    public static double actualFare(double baseFare, boolean peak) {
        if (peak){

            return baseFare * 1.2;
        }else {

            return baseFare;
        }
    }

    public static void printReport(String passengerName, double distance,  double baseFare,boolean peak, double AFare) {
        System.out.println("========行程单========");
        System.out.println("乘客：" + passengerName);
        System.out.printf("公里数：%.1f%n",distance);
        System.out.printf("基础费用：%.1f%n",baseFare);
        if (peak){
            System.out.println("是");
        }else {
            System.out.println("不是");
        }
        System.out.printf("实付：%.1f%n",AFare);
    }
}
