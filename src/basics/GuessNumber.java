package basics;

import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        int num = 1;
        int i = 0;

        Scanner sc = new Scanner(System.in);
        while (num != 88){
            System.out.println("请输入你猜的数字：");
            num = sc.nextInt();
            if (num > 88){
                System.out.println("太大了，请重新猜！");
            }else if(num < 88){
                System.out.println("太小了，请重新猜！");
            }
            i++;

        }
        System.out.println("恭喜你，猜对了!一共猜了"+ i +"次");
    }


}
