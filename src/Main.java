import Factory.CleanCode2.EmailFactory;
import Factory.CleanCode2.PushFactory;
import Factory.CleanCode2.SmsFactory;
import Factory.NotificationFactory;
import NotificationProduct.CleanCode.EmailNotification;
import NotificationProduct.Notification;

public class Main {
    public static void main(String[] args) {
        NotificationFactory factory = new SmsFactory();
        Notification notification = factory.createNotification();

        notification.sendNotification();

    }
}