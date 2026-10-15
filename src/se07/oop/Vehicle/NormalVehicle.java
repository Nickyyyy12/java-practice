package se07.oop.Vehicle;

public class NormalVehicle extends Vehicle {
    public NormalVehicle(){

    }

    public NormalVehicle(String plateNumber,double balance){
        super(plateNumber, balance);

    }

    @Override

    public void pay(double amount){
        if (amount>getBalance()){
            System.out.println("大于余额");
            return;
        }else if (amount<0){
            System.out.println("不能为0");
            return;
        }
        setBalance((getBalance()-amount));
    }
}
