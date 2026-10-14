package notification;

public class NotificationService {

    public void sendNotification(Sender sender, String receiver, String content){
       sender.send(receiver,content);
    }
}
