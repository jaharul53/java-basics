package com.johurulIslam.main.threadsbasics.concurrent.deadlock;

public class Thread2 implements Runnable{
    @Override
    public void run() {
        printNum();
    }
    public void printNum(){
        synchronized (MainClass.num2){
            System.out.println(MainClass.num2);
            System.out.println(Thread.currentThread().getName()+" Is Lock");
            synchronized (MainClass.num) {
                System.out.println(MainClass.num);
            }
        }
    }
}
