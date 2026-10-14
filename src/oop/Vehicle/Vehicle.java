package oop.Vehicle;

public abstract class Vehicle {
    private String plateNumber;
    private double balance;
    private static int count;

    public Vehicle(){
        count++;
    }

    public Vehicle(String plateNumber,double balance){
        setPlateNumber(plateNumber);
        setBalance(balance);
        count++;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public String getPlateNumber(){
        return this.plateNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void recharge(double amount){
        if (amount<0){
            System.out.println("不能为负数");
            return;
        }
        setBalance(getBalance()+amount);
    }

    public abstract void pay(double amount);

    public static int getCount(){
        return count;
    }

    public void checkBalance(){
        System.out.println("您的余额："+getBalance());
    }
}
