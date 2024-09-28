package com.johurulIslam.main.designpatterns.factory;

public class NotificationFactory{
    public static Notification createNotification(String notificationType){
        return switch (notificationType) {
            case "email" -> new EmailNotification();
            case "sms" -> new SmsNotification();
            case "push" -> new PushNotification();
            default -> null;
        };
    }
}
