package com.johurulIslam.main.threadsbasics.lifecycle;

public class ThreadUsingRunnable implements Runnable{

    @Override
    public void run() {
        System.out.println("Starting thread from Runnable class");
        printNumber();
    }
    public void printNumber(){
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName()+"  "+i);
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            System.out.println(ex.getMessage());
        }
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName()+"  "+i);
        }
    }
}
