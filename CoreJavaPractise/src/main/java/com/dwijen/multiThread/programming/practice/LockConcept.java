package com.dwijen.multiThread.programming.practice;

import org.junit.Test;;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantLock;
import java.util.stream.IntStream;

/**
 * Created by dkirtan on 8/18/17.
 */
public class LockConcept {
    int count;

    /**
     * @throws InterruptedException Three steps have to be performed in order to increment the number: (i) read the current value,
     *                              (ii) increase this value by one and (iii) write the new value to the variable. If two threads
     *                              perform these steps in parallel it's possible that both threads perform step 1 simultaneously
     *                              thus reading the same current value. This results in lost writes so the actual result is lower.
     *                              In the above sample 35 increments got lost due to concurrent unsynchronized access to count but
     *                              you may see different results when executing the code by yourself.
     */

    @Test
    public void test() throws InterruptedException {
        ReentrantLock lock = new ReentrantLock();
        ExecutorService executor = Executors.newFixedThreadPool(200);
        Long stattime = System.currentTimeMillis();
        IntStream.range(0, 10000)
                .forEach(i -> executor.submit(new Runnable() {
                    @Override
                    public void run() {
                        lock.lock();
                        try {
                            count = count + 1;
                        } finally {
                            lock.unlock();
                        }

                    }
                }));
        Long endTime = System.currentTimeMillis();
        System.out.println("Execution Time:" + (endTime - stattime));
        executor.shutdown();
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(count);  // 10000
    }

}
