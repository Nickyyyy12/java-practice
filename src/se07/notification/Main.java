package se07.notification;

public class Main {
    public static void main(String[] args) {
        EmailSender a1 = new EmailSender();
        SmsSender b1 = new SmsSender();
        NotificationService c1 = new NotificationService();

        c1.sendNotification(a1,"a@qq.com","您的订单已发货");
        c1.sendNotification(b1,"13800000000","您的订单已发货");
    }

}
