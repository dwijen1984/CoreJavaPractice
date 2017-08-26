package com.dwijen.multiThread.programming.practice;

import org.junit.Test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

/**
 * Created by dkirtan on 8/18/17.
 * <p>
 * In addition to locks the Concurrency API also supports counting semaphores.
 * Whereas locks usually grant exclusive access to variables or resources, a semaphore is
 * capable of maintaining whole sets of permits. This is useful in different scenarios
 * where you have to limit the amount concurrent access to certain parts of your application.
 * <p>
 * Here's an example how to limit access to a long running task simulated by sleep(5)
 */
public class SemaphoreConcept {

    @Test
    public void test() {

        ExecutorService executor = Executors.newFixedThreadPool(10);

        Semaphore semaphore = new Semaphore(5);

        Runnable longRunningTask = () -> {
            boolean permit = false;
            try {
                permit = semaphore.tryAcquire(1, TimeUnit.SECONDS);
                if (permit) {
                    System.out.println("Semaphore acquired");
                    Thread.sleep(5);
                } else {
                    System.out.println("Could not acquire semaphore");
                }
            } catch (InterruptedException e) {
                throw new IllegalStateException(e);
            } finally {
                if (permit) {
                    semaphore.release();
                }
            }
        };

        IntStream.range(0, 10)
                .forEach(i -> executor.submit(longRunningTask));

        executor.shutdown();

    }

}
