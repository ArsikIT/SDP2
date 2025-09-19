package NotificationProduct.CleanCode;
import NotificationProduct.Notification;

public class SmsNotification implements Notification {
    public void sendNotification() {  // method of sending SMS
        System.out.println("=============================================================");
        System.out.println("SMS Notification");
        System.out.println("From: 102");
        System.out.println("Message: Storm warning!");
        System.out.println("=============================================================");
    }
}
