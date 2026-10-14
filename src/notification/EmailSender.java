package notification;

public class EmailSender implements Sender{

    @Override
    public void send(String receiver, String content){
        System.out.println("[邮件] 发送给 "+ receiver+"："+content);
    }
}
