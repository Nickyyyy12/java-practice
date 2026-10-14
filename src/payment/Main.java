package payment;

public class Main {
    public static void main(String[] args) {
        Alipay a1 = new Alipay();
        BankCardPay b1 = new BankCardPay();
        OrderService c1 = new OrderService();

        c1.checkout(a1,100);
        c1.checkout(b1, 250);
    }
}
