package base.basics;

import java.util.Scanner;

public class IfDemo {
    public static void main(String[] args) {
        checkAge();
    }

    public static void checkAge(){
        System.out.println("请输入你的年龄");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if (age >=60){
            System.out.println("老年人");
        }else if (age>=18 && age<=59) {
            System.out.println("成年人");
        }else if (age>=0 && age<=17){
            System.out.println("未成年");
        }else {
            System.out.println("输入有误");
        }
    }
}
