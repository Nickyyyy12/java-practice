package notification;

public interface Sender {
    void send(String receiver, String content);
}
