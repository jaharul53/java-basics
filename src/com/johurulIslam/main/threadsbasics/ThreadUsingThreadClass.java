package com.johurulIslam.main.threadsbasics;

public class ThreadUsingThreadClass extends Thread{
    @Override
    public void run() {
        System.out.println("Starting thread from thread class");
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
