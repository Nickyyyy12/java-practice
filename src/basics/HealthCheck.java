package basics;

import java.util.Scanner;

public class HealthCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入姓名");
        String name = sc.nextLine();

        System.out.println("请输入年龄");
        int age = sc.nextInt();

        System.out.println("请输入身高");
        double hight = sc.nextDouble();

        System.out.println("请输入体重");
        double weight = sc.nextDouble();

        double bmi = calcBMI(hight, weight);
        printReport(name, age,bmi);

    }

    public static double calcBMI(double height, double weight) {
        double BMI = weight/(height*height);
        return BMI;

    }

    public static void printReport(String name, int age,double BMI ) {
        String isAdult = age >= 18 ? "成年" : "未成年";

        System.out.println("========健康报告========");
        System.out.println("姓名："+ name);
        System.out.println("年龄："+ age + "("+isAdult+")");
        System.out.printf("BMI：%.2f%n",BMI);

        if (BMI < 18.5) {
            System.out.println("状态：偏瘦");
        } else if (BMI < 24.9) {
            System.out.println("状态：正常");
        } else if (BMI < 29.9) {
            System.out.println("状态：偏胖");
        } else {
            System.out.println("状态：肥胖");
        }
        System.out.println("========================");

    }
}
