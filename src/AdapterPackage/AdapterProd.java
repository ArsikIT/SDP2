package AdapterPackage;
import NotificationProduct.Notification;
public class AdapterProd implements Notification {
    private OldClass oldNotifier; // variable, type = oldClass

    // the constructor accepts the old class
    public AdapterProd(OldClass oldNotifier) {
        this.oldNotifier = oldNotifier;
    }

    @Override
    public void sendNotification() {
        // calling a method from the old class
        oldNotifier.sendMsg("Message through Adapter!");
    }
}
