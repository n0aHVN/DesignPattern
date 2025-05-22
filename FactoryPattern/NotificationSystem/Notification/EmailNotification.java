package FactoryPattern.NotificationSystem.Notification;

public class EmailNotification extends Notification{
    public EmailNotification(String msg){
        super(msg);
    }
    @Override
    public void sendNotification(){
        System.out.println("Email Notification: "+this.msg);
    }
}
