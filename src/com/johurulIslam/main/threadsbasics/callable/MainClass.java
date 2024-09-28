package com.johurulIslam.main.threadsbasics.callable;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MainClass {
    public static void main(String[] args) {
        //ExecutorService executorService= Executors.newSingleThreadExecutor();
        ExecutorService executorService= Executors.newFixedThreadPool(10);
        User user1=new User();
        User user2=new User();
        User user3=new User();
        Future<String>nameFuture=executorService.submit(user1);
        executorService.submit(user2);
        executorService.submit(user3);
        String name=null;
        try {
            name= nameFuture.get();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println(name);
//        executorService.shutdown();
//        executorService.shutdownNow();
    }
}
