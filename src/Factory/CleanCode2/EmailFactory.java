package Factory.CleanCode2;

import Factory.NotificationFactory;
import NotificationProduct.CleanCode.EmailNotification;
import NotificationProduct.Notification;

public class EmailFactory implements NotificationFactory {  // responsible for creating Email notifications
    @Override
    public Notification createNotification() {
        return new EmailNotification();  // returns the product EmailNotification
    }
}
