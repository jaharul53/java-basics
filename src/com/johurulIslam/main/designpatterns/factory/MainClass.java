package com.johurulIslam.main.designpatterns.factory;

import java.util.HashMap;
import java.util.Map;

public class MainClass {
    public static void main(String[] args) {
        Map<String,String>mymap = new HashMap<>();
        mymap.put("a","email@");
        EmailNotification emailNotification = (EmailNotification) NotificationFactory.createNotification("email");
        emailNotification.notifyUser("hello");
        emailNotification.notifyinfo(mymap);

        SmsNotification smsNotification = (SmsNotification) NotificationFactory.createNotification("sms");

        PushNotification pushNotification = (PushNotification) NotificationFactory.createNotification("push");

    }
}
