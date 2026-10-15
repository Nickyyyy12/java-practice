package base.basics;

import java.util.Scanner;

public class ScoreSystem {
    public static void main(String[] args) {
        int [] scores = new int [5];
        Scanner sc = new Scanner(System.in);
        for (int i =0; i< scores.length; i++){
            System.out.println("请输入第"+(i+1)+"个学生的成绩：");
            scores[i] = sc.nextInt();
        }
        int max = scores[0];
        for (int j = 1; j<scores.length; j++){
            if (scores[j]>max){
                max = scores[j];
            }
        }

        int min = scores[0];
        for (int j = 1; j<scores.length; j++){
            if (scores[j]<min){
                min = scores[j];
            }
        }

        int sum = scores[0];
        for (int k = 1; k<scores.length; k++){
            sum +=scores[k];
        }

        int pass = 0;
        for (int n =0; n<scores.length; n++){
            if (scores[n]>=60){
                pass++;
            }

        }

        int fail = scores.length - pass;

        System.out.println("========成绩统计========");
        System.out.println("最高分：" + max);
        System.out.println("最低分：" + min);
        System.out.println("平均分：" + (double) sum / scores.length);
        System.out.println("及格人数：" + pass);
        System.out.println("不及格人数：" + fail);
        System.out.println("========================");


    }

}
