package com.johurulIslam.main.threadsbasics.concurrent.deadlock;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MainClass {
    public static Integer num=10;
    public static Integer num2=20;
    public static void main(String[] args) {
        Thread1 thread1 = new Thread1();
        Thread2 thread2 = new Thread2();
        ExecutorService executorService= Executors.newFixedThreadPool(10);
        executorService.submit(thread1);
        executorService.submit(thread2);
    }
}
