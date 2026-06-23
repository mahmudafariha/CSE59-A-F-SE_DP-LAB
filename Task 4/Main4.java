interface MessageSender {
    void sendMessage(String message);
}
class EmailSender implements MessageSender {
    public void sendMessage(String message) {
        System.out.println("Sending email: " + message);
    }
}
class NotificationService {
    private MessageSender messageSender;
    public NotificationService(MessageSender messageSender) {
        this.messageSender = messageSender;
    }
     public void alertUser(String msg) {
        messageSender.sendMessage(msg);
    }
}
public class Main {
    public static void main(String[] args) {
        MessageSender sender = new EmailSender();
        NotificationService service = new NotificationService(sender);
        service.alertUser("Hello User!");
    }
}
