package base.basics;

public class DataTypes {
    public static void main(String[] args) {
        // ===== 整数类型 =====
        byte level = 5;
        short year = 2026;
        int age = 22;
        long population = 1400000000L;

        // ===== 小数类型 =====
        float weight = 65.5f;
        double price = 19.99;

        // ===== 字符 =====
        char gender = '男';

        // ===== 布尔 =====
        boolean isStudent = true;

        // ===== 字符串 =====
        String name = "Zhun";

        // ===== 打印所有变量 =====
        System.out.println("等级：" + level);
        System.out.println("年份：" + year);
        System.out.println("年龄：" + age);
        System.out.println("人口：" + population);
        System.out.println("体重：" + weight);
        System.out.println("价格：" + price);
        System.out.println("性别：" + gender);
        System.out.println("是学生：" + isStudent);
        System.out.println("姓名：" + name);
    }
}