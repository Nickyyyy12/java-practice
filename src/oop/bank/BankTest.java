package oop.bank;

import java.util.Scanner;

public class BankTest {
    public static void main(String[] args) {

        Account[] accounts = new Account[2];
        accounts[0] = new SavingsAccount("102118", "李准", 10086);
        accounts[1] = new CreditAccount("112111", "张三", 1000, 5000);
        System.out.println("银行总共开设账户数：" + Account.getCount());

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("========");
            System.out.println("1. 储蓄账户");
            System.out.println("2. 信用卡账户");
            System.out.println("3. 退出");
            System.out.println("========");
            System.out.println("请选择：");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    while (true) {
                        System.out.println("存款");
                        System.out.println("取款");
                        System.out.println("查余额");
                        System.out.println("返回");
                        int choice2 = sc.nextInt();

                        switch (choice2) {
                            case 1:
                                try {
                                    System.out.println("请输入存款金额：");
                                    double amount = sc.nextDouble();
                                    accounts[0].deposit(amount);
                                }catch (Exception e){
                                    System.out.println("输入有误，请输入数字");
                                    sc.nextLine();
                                }
                                break;
                            case 2:
                                try {
                                    System.out.println("请输入取款金额：");
                                    double amount = sc.nextDouble();
                                    accounts[0].withdraw(amount);
                                }catch (Exception e){
                                    System.out.println("输入有误，请输入数字");
                                    sc.nextLine();
                                }
                                break;
                            case 3:
                                System.out.println("查余额");
                                accounts[0].checkBalance();
                                break;
                            case 4:
                                System.out.println("这里是返回");
                                break;

                            default:
                                System.out.println("输入有误，请重新选择");
                        }

                        if (choice2 == 4) {
                            break;
                        }
                    }
                    break;

                case 2:
                    while (true) {
                        System.out.println("存款");
                        System.out.println("取款");
                        System.out.println("查余额");
                        System.out.println("返回");
                        int choice2 = sc.nextInt();

                        switch (choice2) {
                            case 1:
                                try {
                                    System.out.println("请输入存款金额：");
                                    double amount = sc.nextDouble();
                                    accounts[1].deposit(amount);
                                }catch (Exception e){
                                    System.out.println("输入有误，请输入数字");
                                    sc.nextLine();
                                }
                                break;
                            case 2:
                                try {
                                    System.out.println("请输入取款金额：");
                                    double amount = sc.nextDouble();
                                    accounts[1].withdraw(amount);
                                }catch (Exception e){
                                    System.out.println("输入有误，请输入数字");
                                    sc.nextLine();
                                }
                                break;
                            case 3:
                                System.out.println("查余额");
                                accounts[1].checkBalance();
                                break;
                            case 4:
                                System.out.println("这里是返回");
                                break;

                            default:
                                System.out.println("输入有误，请重新选择");
                        }

                        if (choice2 == 4) {
                            break;
                        }
                    }
                    break;

                case 3:
                    System.out.println("退出程序");
                    break;

                default:
                    System.out.println("输入有误，请重新选择");
            }

            if (choice == 3) {
                break;
            }
        }
    }
}

