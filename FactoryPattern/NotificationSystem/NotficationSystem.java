package FactoryPattern.NotificationSystem;

import FactoryPattern.NotificationSystem.Notification.NotificationType;
import FactoryPattern.NotificationSystem.User.User;

public class NotficationSystem {
    public static void main(String[] args) {
        User user = new User();
        user.NotifyToUser("This is the Notify", NotificationType.EMAIL);
    }
}
