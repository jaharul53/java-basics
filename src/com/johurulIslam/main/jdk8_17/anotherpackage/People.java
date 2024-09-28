package com.johurulIslam.main.jdk8_17.anotherpackage;

public interface People {
    default void doDefaultActivity(){
        System.out.println("this is a default activity");
    }
    void doActibity();
}
