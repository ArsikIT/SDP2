package NotificationProduct.CleanCode;
import NotificationProduct.Notification;

public class EmailNotification implements Notification {
    public void sendNotification() {
        System.out.println("Email Notification");
    }
}
