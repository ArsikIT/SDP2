package AdapterPackage;

import Factory.NotificationFactory;
import NotificationProduct.Notification;

public class AdapterFactory implements NotificationFactory {  // factory for adapter
    @Override
    public Notification createNotification() {
        return new AdapterProd(new OldClass() );
    }
}
