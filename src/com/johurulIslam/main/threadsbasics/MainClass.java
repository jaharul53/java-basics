package com.johurulIslam.main.threadsbasics;

public class MainClass {
    public static void main(String[] args) {
//        long startTime = System.currentTimeMillis();
//        ThreadUsingThreadClass thread1=new ThreadUsingThreadClass();
//        ThreadUsingThreadClass thread2=new ThreadUsingThreadClass();
//        thread1.start();
//        thread2.start();
//        thread1.printNumber();
//        thread2.printNumber();
//        try {
//            thread1.join();
//            thread2.join();
//        } catch (InterruptedException ex) {
//            System.out.println(ex.getMessage());
//        }
//        long endTime = System.currentTimeMillis();
//        System.out.println(endTime - startTime);

//        ThreadUsingThreadClass thread1=new ThreadUsingThreadClass();
//        ThreadUsingThreadClass thread2=new ThreadUsingThreadClass();
//        ThreadUsingThreadClass thread3=new ThreadUsingThreadClass();
//        thread1.start();
//        thread2.start();
//        thread3.start();

        ThreadUsingRunnable runnable = new ThreadUsingRunnable();
        Thread thread4 = new Thread(runnable);
        Thread thread5 = new Thread(runnable);
        Thread thread6 = new Thread(runnable);
        thread4.start();
        thread5.start();
        thread6.start();





    }
}
