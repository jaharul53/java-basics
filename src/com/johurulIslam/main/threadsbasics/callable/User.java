package com.johurulIslam.main.threadsbasics.callable;

import java.util.concurrent.Callable;

public class User implements Callable <String>{
    @Override
    public String call() throws Exception {
        for(int i = 1; i <= 10; i++){
            System.out.println(Thread.currentThread().getName()+"   "+i);
        }
        return "Hello World!";
    }
}
