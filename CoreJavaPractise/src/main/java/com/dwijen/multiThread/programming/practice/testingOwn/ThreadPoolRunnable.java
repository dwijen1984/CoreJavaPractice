package com.dwijen.multiThread.programming.practice.testingOwn;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by dkirtan on 8/16/17.
 */
public class ThreadPoolRunnable<T> {
    ExecutorService ex = Executors.newFixedThreadPool(3);
    public void thConsumerAddConsumer(T data){
        ex.execute(
        new Runnable(){
            @Override
            public void run() {


            }
        });
    }
}
