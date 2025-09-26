package AdapterPackage;
import NotificationProduct.Notification;
public class AdapterProd implements Notification {  //  Adapter simply implements an already existing interface Notification
    private OldClass oldNotifier;  // variable, type = oldClass

    public AdapterProd(OldClass oldNotifier) {  // the constructor accepts the old class
        this.oldNotifier = oldNotifier;
    }


    @Override
    public void sendNotification() {  // calling a method from the old class
        oldNotifier.sendMsg("Message through Adapter!");
    }

}
