package com.johurulIslam.main.designpatterns.factory;

public class SmsNotification implements Notification{
    @Override
    public void notifyUser(String message) {
        System.out.println("SMS Notification sent to " + message);
    }
}
