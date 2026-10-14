package oop.exception;

import java.util.Scanner;

public class ExceptionDemo {
    public static void main(String[] args) {
        // 练习1：除以0
        try {
            int a =10/0;
            System.out.println(a);
        }catch (ArithmeticException e){
            System.out.println("错误：除数不能为0");
        }
        System.out.println("--------");

        // 练习2：数组越界
        try {
            int[] arr = {1,2,3};
            System.out.println(arr[5]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("错误：数组索引越界");
        }
        System.out.println("--------");

        // 练习3：finally
        try {
            int a = 10 / 2;
            System.out.println("计算结果：" + a);
        } catch (ArithmeticException e) {
            System.out.println("出错了");
        } finally {
            System.out.println("finally 一定会执行");
        }
        System.out.println("--------");

        // 练习4：Scanner 输入非数字
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("请输入一个数字：");
            int num = sc.nextInt();
            System.out.println("你输入的是：" + num);
        } catch (Exception e) {
            System.out.println("错误：请输入数字，不是文字");
        }

        System.out.println("程序正常结束");
    }

}
