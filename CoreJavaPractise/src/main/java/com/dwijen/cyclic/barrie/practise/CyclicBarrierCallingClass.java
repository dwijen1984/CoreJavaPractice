package com.dwijen.cyclic.barrie.practise;

import java.util.concurrent.CyclicBarrier;

/**
 * Created by dkirtan on 2/22/17.
 */
public class CyclicBarrierCallingClass {
    public static void main(String args[]){
        CyclicBarrier cyclic = new CyclicBarrier(3);
        new Thread(new CyclicBarrierRunnable(cyclic)).start();
        new Thread(new CyclicBarrierRunnable(cyclic)).start();
    }

}
