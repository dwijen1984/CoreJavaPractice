package com.dwijen.predicate.practice;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by dkirtan on 7/19/17.
 */
public abstract class  RunnableClass<T> implements Iconsumer<T>{

    ExecutorService ex = Executors.newFixedThreadPool(3);
    public void test(java.util.function.Consumer<String> con){
        ExecutorService ex = Executors.newFixedThreadPool(4);

    }

    public abstract void doAdd(T type);

    @Override
    public void add(T type) {
        ex.execute(new Runnable() {
            @Override
            public void run() {
                doAdd(type);
                System.out.println(Thread.currentThread().getName());
            }
        });
    }
}
