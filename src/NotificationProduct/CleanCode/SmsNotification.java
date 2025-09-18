package NotificationProduct.CleanCode;
import NotificationProduct.Notification;

public class SmsNotification implements Notification {
    public void sendNotification() {
        System.out.println("Sms Notification");
    }
}
