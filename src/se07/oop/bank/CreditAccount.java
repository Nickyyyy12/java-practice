package se07.oop.bank;

public class CreditAccount extends Account {
    private double creditLimit;

    public CreditAccount(){

    }

    public CreditAccount(String accountNumber,String ownerName,double balance,double creditLimit){
        super(accountNumber, ownerName, balance);
        setCreditLimit(creditLimit);
    }

    public void setCreditLimit(double creditLimit){
        if (creditLimit<0){
            System.out.println("不能为负数");
            return;
        }
        this.creditLimit = creditLimit;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    @Override
    public void withdraw(double amount){
        if (amount < 0 ){
            System.out.println("金额不能为负");
        }else if (getBalance() - amount<-creditLimit){
            System.out.println("超过余额");
        }else {
            setBalance(getBalance() - amount);
        }
    }

}
