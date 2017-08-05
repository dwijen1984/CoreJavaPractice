package com.dwijen.cyclic.barrie.practise;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * Created by dkirtan on 2/22/17.
 */
public class CyclicBarrierRunnable implements Runnable{

    CyclicBarrier c;
    public CyclicBarrierRunnable(CyclicBarrier c){
        this.c = c;
    }
    @Override
    public void run() {
        try {
            System.out.println("This is waiting at the barrier");
            c.await();
            Thread.sleep(1000);
            System.out.println("The waiting is over");
            System.out.println("Done..");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (BrokenBarrierException e) {
            e.printStackTrace();
        }
    }
}
