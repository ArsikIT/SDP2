import Factory.CleanCode2.EmailFactory;
import Factory.CleanCode2.PushFactory;
import Factory.CleanCode2.SmsFactory;
import Factory.NotificationFactory;
import NotificationProduct.CleanCode.EmailNotification;
import NotificationProduct.Notification;

public class Main {
    public static void main(String[] args) {
        NotificationFactory factory = new  EmailFactory();  // use a specific factory (SmsFactory, PushFactory, EmailFactory)
        Notification notification = factory.createNotification();  // The factory creates a specific notification
                                                                  // that is selected by changing the factory

        notification.sendNotification();  // calling the method on the product

    }
}