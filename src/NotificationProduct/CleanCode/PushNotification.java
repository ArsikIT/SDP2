package NotificationProduct.CleanCode;
import NotificationProduct.Notification;

public class PushNotification implements Notification {
    public void sendNotification() {  // method of sending push notifications
        System.out.println("=============================================================");
        System.out.println("Push Notification");
        System.out.println("From: Telegram (ReMoodle)");
        System.out.println("Message: You have a new assignment in LMS");

        System.out.println("From: WhatsApp (Mom) ");
        System.out.println("Message: please, take bread from the store;");
        System.out.println("=============================================================");
    }
}
