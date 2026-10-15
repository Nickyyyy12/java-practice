package base.basics;

import java.util.Scanner;

public class scanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入N1");
        double N1 = sc.nextDouble();
        System.out.println("输入N2");
        double N2 = sc.nextDouble();
        System.out.println("输入N3");
        double N3 = sc.nextDouble();
        System.out.println("平均数是" + (N1+N2+N3)/3);

    }
}
