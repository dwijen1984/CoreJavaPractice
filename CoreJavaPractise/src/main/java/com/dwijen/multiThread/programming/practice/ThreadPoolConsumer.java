package com.dwijen.multiThread.programming.practice;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by dkirtan on 7/19/17.
 */
public abstract class ThreadPoolConsumer<T> implements Consumer<T> {

    static int threadCount;
    public ThreadPoolConsumer(int threadCount){
        this.threadCount = threadCount;
    }
    ExecutorService ex = Executors.newFixedThreadPool(3);

    @Override
    public void add(T data) {
        ex.execute(new Runnable() {
            @Override
            public void run() {
                try {
                    long threadId = Thread.currentThread().getId();
                    System.out.println("I am thread " + threadId + " of " + threadCount);
                    doAdd(data);

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    protected abstract void doAdd(T data);

}
