package Factory.CleanCode2;
import Factory.NotificationFactory;
import NotificationProduct.CleanCode.SmsNotification;
import NotificationProduct.Notification;

public class SmsFactory implements NotificationFactory {

    @Override
    public Notification createNotification() {
        return new SmsNotification();
    }
}
