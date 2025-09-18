package Factory.CleanCode2;

import Factory.NotificationFactory;
import NotificationProduct.CleanCode.EmailNotification;
import NotificationProduct.Notification;

public class EmailFactory implements NotificationFactory {
    @Override
    public Notification createNotification() {
        return new EmailNotification();
    }
}
