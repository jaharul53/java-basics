package com.johurulIslam.main.threadsbasics;

public class ThreadUsingRunnable implements Runnable{

    @Override
    public void run() {
        System.out.println("Starting thread from Runnable class");
        printNumber();
    }
    public void printNumber(){
//        try {
//            Thread.sleep(2000);
//        } catch (InterruptedException ex) {
//            System.out.println(ex.getMessage());
//        }
        for (int i = 1; i <= 10; i++) {
            System.out.println(Thread.currentThread().getName()+"  "+i);
        }
    }
}
