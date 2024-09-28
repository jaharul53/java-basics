package com.johurulIslam.main.threadsbasics.lifecycle;

public class MainClass {
    public static void main(String[] args) {
        ThreadUsingRunnable runnable=new ThreadUsingRunnable();
        Thread thread1=new Thread(runnable);
        System.out.println(thread1.getState());
        thread1.start();
        System.out.println(thread1.getState());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println(thread1.getState());
        try {
            thread1.join();
        } catch (InterruptedException ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println("this is the last line");

        System.out.println(thread1.getState());

    }
}
