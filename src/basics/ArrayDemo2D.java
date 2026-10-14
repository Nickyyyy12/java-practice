package basics;

import java.util.Scanner;

public class ArrayDemo2D {
    public static void main(String[] args) {
        int[][] arr = new int[3][3];

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++){
            System.out.println("请输入"+(i+1)+"行");
            for (int j = 0; j < 3; j++){
                System.out.println("请输入"+(j+1)+"列");
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("你输入的表格：");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
            }
    }

}
