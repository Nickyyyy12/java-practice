package se07.notification;

public class SmsSender implements Sender{

    @Override
    public void send(String receiver, String content){
        System.out.println("[短信] 发送给 "+ receiver+"："+content);
    }
}
