package FactoryPattern.NotificationSystem.User;

import FactoryPattern.NotificationSystem.Notification.EmailNotification;
import FactoryPattern.NotificationSystem.Notification.Notification;
import FactoryPattern.NotificationSystem.Notification.NotificationType;
import FactoryPattern.NotificationSystem.Notification.PushNotification;
import FactoryPattern.NotificationSystem.Notification.SMSNotification;

public class User {
    Notification notification;
    public void NotifyToUser(String msg, NotificationType type){
        notification = createNotification(msg, type);
        notification.sendNotification();
    }
    private Notification createNotification(String msg, NotificationType type){
        switch (type) {
            case EMAIL:
                return new EmailNotification(msg);
            case SMS:
                return new SMSNotification(msg);
            case PUSH:
                return new PushNotification(msg);
            default:
                throw new IllegalArgumentException("Unknown Notification Type:"+type);
        }
    }
}
