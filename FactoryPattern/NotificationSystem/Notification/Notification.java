package FactoryPattern.NotificationSystem.Notification;

public abstract class Notification {
    String msg;
    public Notification(String msg){
        this.msg = msg;
    }
    public abstract void sendNotification();
}
