package com.johurulIslam.main.threadsbasics.concurrent;

public class MainClass {
    public static void main(String[] args) {
        AnotherClass anotherClass = new AnotherClass();
        Thread thread = new Thread(anotherClass);
        Thread thread2 = new Thread(anotherClass);
        thread.start();
        thread2.start();
        try {
            thread.join();
            thread2.join();
        } catch (InterruptedException ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println(anotherClass.getNum());
        System.out.println(anotherClass.getNum2());
    }
}
