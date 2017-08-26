package com.dwijen.funtional.Interface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * Created by dkirtan on 8/17/17.
 */
public class TestConsumer {
    public static void main(String args[]){
        Consumer<String> c = x-> System.out.println(x.toLowerCase());
        c.accept("DWIJEN");
        checkConsumer(x-> System.out.print(x.toUpperCase()), Arrays.asList("hello","i","am", " here"));
    }
    public static <T>void checkConsumer(java.util.function.Consumer<T> consumer, List<T> listOfUnknown){
        listOfUnknown.forEach(x->consumer.accept(x));
    }
}
