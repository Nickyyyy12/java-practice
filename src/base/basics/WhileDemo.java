package base.basics;

import java.util.Scanner;

public class WhileDemo {
    public static void main(String[] args) {
        int i = 1 ;
        while (i <=10){
            System.out.println("li");
            i++;

        }

        Scanner sc = new Scanner(System.in);
        int num = -1;
        while (num!=0){
            System.out.println("请输入一个数字（输入0退出）：");
            num = sc.nextInt();
            System.out.println("你输入了：" + num);

        }
        System.out.println("程序结束");
    }
}
