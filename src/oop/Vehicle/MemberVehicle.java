package oop.Vehicle;

public class MemberVehicle extends Vehicle {
    private double discount;

    public MemberVehicle(){

    }

    public MemberVehicle(String plateNumber,double balance,double discount){
        super(plateNumber, balance);
        setDiscount(discount);
    }

    public void setDiscount(double discount){
        this.discount = discount;
    }

    public double getDiscount() {
        return discount;
    }

    @Override
    public void pay(double amount){
        if (amount*getDiscount()>getBalance()){
            System.out.println("大于余额");
            return;
        }else if (amount<0) {
            System.out.println("不能为0");
            return;
        }

        setBalance(getBalance()-(amount*getDiscount()));
    }
}
