import NotificationProduct.CleanCode.EmailNotification;
import NotificationProduct.Notification;

public class Main {
    public static void main(String[] args) {
        Notification notification = new EmailNotification();
        notification.sendNotification();

    }
}