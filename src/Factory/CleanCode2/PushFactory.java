package Factory.CleanCode2;

import Factory.NotificationFactory;
import NotificationProduct.CleanCode.PushNotification;
import NotificationProduct.Notification;

public class PushFactory implements NotificationFactory {  // responsible for creating Push notifications
    @Override
    public Notification createNotification() {
        return new PushNotification();  // returns the product PushNotification
    }
}
