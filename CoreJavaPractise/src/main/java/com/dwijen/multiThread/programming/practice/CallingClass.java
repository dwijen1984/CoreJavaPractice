package com.dwijen.multiThread.programming.practice;

import java.util.Arrays;
import java.util.Collection;

/**
 * Created by dkirtan on 7/19/17.
 */
public class CallingClass {

    /**
     * This CallingClass class process the Deals in multi-threaded way
     * 1. ThreadPoolRunnable<Deal> processor : here define your process
     * 2. You can define N number of processor
     * 3. Each processor will process the deal in multithreaded way
     *
     * Use of java.util.function.Consumer is that -
     *          1. its a functional Interface, so you can pass that as argument(line 40) and later you can
     *              implement whatver you want like (line 24)
     *
     */

    private  int threadCounts= 3;

    public static void main(String args[]){
        new CallingClass().onMessage(2);
    }
    public void onMessage( int i) {
        // Solid implementation of Consumer interface
        ThreadPoolConsumer<Deal> processor = consumerTest(deal -> {
            if (!(deal.getDealStatus() == "DEAL_KILL") ) {
                System.out.println("In if");

            } else if ((deal.getDealStatus() == "DEAL_KILL")) {
                System.out.println("In Else");
            }
        });
        // This is another implementation, but no need to change the consumer
        ThreadPoolConsumer<Deal> processor2 = consumerTest(deal -> {
            if (!(deal.getDealStatus() == "DEAL_KILL_1") ) {
                System.out.println("In processor2 if");

            } else if ((deal.getDealStatus() == "DEAL_KILL_2")) {
                System.out.println("In processor2Else");
            }
        });
        Collection<Deal> sellerDealsWithCriteria  = Arrays.asList(
                new Deal("KILL_DEAL"),
                new Deal("KILL_DEAL_1"),
                new Deal("KILL_DEAL_2"),
                new Deal("KILL_DEAL_3"));
        sellerDealsWithCriteria.forEach(processor::add);
        //sellerDealsWithCriteria.forEach(processor2::add);

    }

    private <T> ThreadPoolConsumer<T> consumerTest(java.util.function.Consumer<T> function) {
        return new ThreadPoolConsumer<T>(threadCounts) {
            @Override
            protected void doAdd(T item) {
                function.accept(item);
            }
        };
    }


}
