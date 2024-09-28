package com.johurulIslam.main.jdk8_17;

public class User {
    private String userName;
    private String userId;
    private String country;

    public User(String userName, String userId, String country) {
        this.userName = userName;
        this.userId = userId;
        this.country = country;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", userId='" + userId + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
