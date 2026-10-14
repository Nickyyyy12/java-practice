package payment;

public class BankCardPay implements Payment{
    @Override
    public void pay(int amount){
        System.out.println("[银行卡] 支付 "+amount+" "+"元");
    }
}