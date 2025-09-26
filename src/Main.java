import AdapterPackage.AdapterFactory;
import AdapterPackage2.AdapterFactory2;
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


        NotificationFactory AdapterFactory = new AdapterFactory();
        Notification telegram = AdapterFactory.createNotification();



        NotificationFactory AdapterFactory2 = new AdapterFactory2();
        Notification instagram = AdapterFactory2.createNotification();


        instagram.sendNotification(); // example adapter pattern 2

        telegram.sendNotification();  // calling the method on the product (adapter pattern1 )

        notification.sendNotification();  // calling the method on the product

    }
}