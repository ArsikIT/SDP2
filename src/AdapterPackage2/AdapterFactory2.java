package AdapterPackage2;
import Factory.NotificationFactory;
import NotificationProduct.Notification;

public class AdapterFactory2 implements NotificationFactory {  // factory for adapter2
    @Override
    public Notification createNotification() {
        return new AdapterProd2(new OldClass2());
    }
}
