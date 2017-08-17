package com.dwijen.multiThread.programming.practice.testingOwn;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * Created by dkirtan on 8/16/17.
 */
public class ConsumerProcessingClass {
    private static <T> void processConsumer(Consumer<T> consumer, List<T> consumerList){
        consumerList.forEach(x ->consumer.accept(x));

    }

    public static void main(String args[]){
        Consumer<String> con = x -> System.out.println(x+" : "+x.length());

        con.accept("hello");

        processConsumer(x-> System.out.println(x+":"+x.length()), Arrays.asList("Hi", "hello"));
    }
}
