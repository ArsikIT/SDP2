import AdapterPackage.AdapterFactory;
import Factory.CleanCode2.EmailFactory;
import Factory.CleanCode2.PushFactory;
import Factory.CleanCode2.SmsFactory;
import Factory.NotificationFactory;
import NotificationProduct.CleanCode.EmailNotification;
import NotificationProduct.Notification;

public class Main {
    public static void main(String[] args) {
        NotificationFactory factory = new  SmsFactory();  // use a specific factory (SmsFactory, PushFactory, EmailFactory)
        Notification notification = factory.createNotification();  // factory creates a specific notification
                                                                  // that is selected by changing the factory


        NotificationFactory AdapterFactory = new AdapterFactory();  //  Adapter simply implements an already existing interface Notification
        Notification telegram = AdapterFactory.createNotification();

        telegram.sendNotification();

        notification.sendNotification();  // calling the method on the product

    }
}