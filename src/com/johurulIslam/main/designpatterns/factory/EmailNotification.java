package com.johurulIslam.main.designpatterns.factory;

import java.util.Map;

public class EmailNotification  implements Notification{
    @Override
    public void notifyUser(String message) {
        System.out.println("Email Notification sent to " + message);
    }
    public void notifyinfo(Map<String, String> map) {
        System.out.println(map);
    }

}
