package com.johurulIslam.main.threadsbasics.concurrent;

import java.util.concurrent.atomic.AtomicInteger;

public class AnotherClass  implements  Runnable{
    private Integer num=10;
    //Atomic Integer is a thread safe variable
    private AtomicInteger num2=new AtomicInteger(20);
    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            synchronized (this) {
                increments();
                incrementsNumber();
            }
        }

    }
    public void increments() {
        num++;
    }
    public void incrementsNumber(){
        num2.getAndIncrement();
    }

    public Integer getNum() {
        return num;
    }

    public Integer getNum2() {
        return num2.get();
    }
}
