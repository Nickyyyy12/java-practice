package base.basics;

import java.util.Scanner;

public class HeightSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] height = new double[5];

        for (int i = 0; i < height.length; i++) {
            System.out.println("请输入第" + (i+1) + "个学生的身高：");
            height[i] = sc.nextDouble();

        }

        double max = height[0];
        for (int j = 1; j < height.length; j++) {
            if (max < height[j]) {
                max = height[j];
            }
        }

        double min = height[0];
        for (int k = 1; k < height.length; k++) {
            if (min > height[k]) {
                min = height[k];

            }
        }
        double sum = height[0];
        for (int a = 1; a < height.length; a++) {
            sum +=height[a];
        }
        double avg = sum/ height.length;

        int pass =0;
        for (int l = 0; l < height.length; l++){
            if (height[l]>=170){
                pass++;
            }
        }
        int fail = height.length - pass;

        System.out.println("========身高统计========");
        System.out.println("最高身高：" + max);
        System.out.println("最低身高：" + min);
        System.out.println("平均身高：" + (double) sum / height.length);
        System.out.println("达标人数：" + pass);
        System.out.println("未达标人数：" + fail);
        System.out.println("========================");
    }

}