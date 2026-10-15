package base.basics;

import java.util.Scanner;

public class SwitchDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入月份");
        int mouth = sc.nextInt();

        switch (mouth){
            case 3,4,5:
                System.out.println("春季");
                break;
            case 6,7,8:
                System.out.println("夏季");
                break;
            case 9,10,11:
                System.out.println("秋季");
                break;
            case 12,1,2:
                System.out.println("冬季");
                break;
            default:
                System.out.println("请输入1到12");
        }
    }
}
