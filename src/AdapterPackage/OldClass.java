package AdapterPackage;

public class OldClass {  // the old class that dont have connections with any interface and class
    public void sendMsg(String text) {  // method sendMsg
        System.out.println("=============================================================");
        System.out.println("Push Notification");
        System.out.println("From: Telegram (ReMoodle)");
        System.out.println("Message: " + text);
        System.out.println("=============================================================");
    }
}
