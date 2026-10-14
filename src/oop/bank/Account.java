package oop.bank;

public abstract class Account {
    private String accountNumber;
    private String ownerName;
    private double balance;
    private static int count = 0;

    public Account(){
        count++;
    }

    public Account(String accountNumber, String ownerName, double balance){
        count++;
        setAccountNumber(accountNumber);
        setOwnerName(ownerName);
        setBalance(balance);
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountNumber() {
        return this.accountNumber;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getOwnerName() {
        return this.ownerName;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return this.balance;
    }

    public static int getCount(){
        return count;
    }

    public void deposit(double amount){
        if (amount<0){
            System.out.println("不能是负数");
            return;
        }
        setBalance(getBalance() + amount);
    }
    public abstract void withdraw(double amount);

    public void checkBalance(){
        System.out.println("你的余额还有"+balance);
    }

    public void printInfo(){
        System.out.println("姓名："+getOwnerName());
        System.out.println("账户号："+getAccountNumber());
        System.out.println("余额："+getBalance());
    }
}
