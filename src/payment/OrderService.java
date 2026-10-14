package payment;

public class OrderService {
    public void checkout(Payment payment,int amount){
        payment.pay(amount);

    }
}
