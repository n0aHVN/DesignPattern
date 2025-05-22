package FactoryPattern.NotificationSystem.Notification;

public class PushNotification extends Notification{
    public PushNotification(String msg){
        super(msg);
    }
    @Override
    public void sendNotification(){
        System.out.println("Push Notification: "+this.msg);
    }
}
