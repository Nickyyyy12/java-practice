package se07.payment;

public class Alipay implements Payment{

    @Override
    public void pay(int amount){
        System.out.println("[支付宝] 支付 "+amount+" "+"元");
    }
}
