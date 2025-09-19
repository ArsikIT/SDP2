package NotificationProduct.CleanCode;
import NotificationProduct.Notification;

public class EmailNotification implements Notification {
    public void sendNotification() {  // method of sending email notifications
        System.out.println("=============================================================");
        System.out.println("Email Notification");
        System.out.println("From: GMAIL");
        System.out.println("Message: A suspicious login attempt has been detected.");
        System.out.println("=============================================================");
    }
}
