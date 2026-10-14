package oop.bank;

public class SavingsAccount extends Account{
    public SavingsAccount(){

    }

    public SavingsAccount(String accountNumber,String ownerName,double balance){
        super(accountNumber, ownerName, balance);
    }

    @Override
    public void withdraw(double amount){
        if (amount<0 ){
            System.out.println("输入小于0");
            return;
        }else if (amount>getBalance()){
            System.out.println("输入大于余额");
            return;
        }
       setBalance(getBalance() - amount);
    }

}
