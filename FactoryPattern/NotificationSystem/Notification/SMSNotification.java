package FactoryPattern.NotificationSystem.Notification;

public class SMSNotification extends Notification{
    public SMSNotification(String msg){
        super(msg);
    }
    @Override
    public void sendNotification(){
        System.out.println("SMS Notification: "+this.msg);
    }
}
