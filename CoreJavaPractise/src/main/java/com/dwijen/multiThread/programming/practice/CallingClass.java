package com.dwijen.multiThread.programming.practice;

import java.util.Arrays;
import java.util.Collection;

/**
 * Created by dkirtan on 7/19/17.
 */
public class CallingClass {

    private  int threadCounts= 3;

    public static void main(String args[]){
        new CallingClass().onMessage(2);
    }
    public void onMessage( int i) {
        ThreadPoolConsumer<Deal> processor = consumer(deal -> {
            if (!(deal.getDealStatus() == "DEAL_KILL") ) {
                System.out.println("In if");

            } else if ((deal.getDealStatus() == "DEAL_KILL")) {
                System.out.println("In Else");
            }
        });
        Collection<Deal> sellerDealsWithCriteria  = Arrays.asList(
                new Deal("KILL_DEAL"),
                new Deal("KILL_DEAL_1"),
                new Deal("KILL_DEAL_2"),
                new Deal("KILL_DEAL_3"));
        sellerDealsWithCriteria.forEach(processor::add);

    }

    private <T> ThreadPoolConsumer<T> consumer(java.util.function.Consumer<T> function) {
        return new ThreadPoolConsumer<T>(threadCounts) {
            @Override
            protected void doAdd(T item) {
                function.accept(item);
            }
        };
    }


}
