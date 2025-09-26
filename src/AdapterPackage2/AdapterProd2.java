package AdapterPackage2;
import NotificationProduct.Notification;

public class AdapterProd2 implements Notification {  // AdapterProd2 implements Notification and adapts OldClass2
    private OldClass2 oldNotifier2;  // variable, type = oldClass2

    public AdapterProd2(OldClass2 oldNotifier2) {  // the constructor accepts the old class2
        this.oldNotifier2 = oldNotifier2;
    }

    @Override
    public void sendNotification() {  // calling a method from the old class2
        oldNotifier2.sendMsg2("Message through Adapter 2 !");
    }
}
