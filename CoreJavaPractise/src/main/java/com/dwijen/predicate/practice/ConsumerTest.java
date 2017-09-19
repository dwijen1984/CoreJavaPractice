package com.dwijen.predicate.practice;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collection;

/**
 * Created by dkirtan on 7/19/17.
 */
public class ConsumerTest {
    /**
     *  This code checks the string size and is the size is greater than 3 char then prints that in multithreaded manner
     *  1. Create a Consumer, which is similar as predicate where you define the function but returns void, where predicate returns boolean
     *  2. Create a abstract class extends a interface.
     *      Now benefit of a abstract class is that while creating a instance you have to implement the abstract menthod
     *  3. In the abstract class create a threadPollExecutor inside a add method
     *  4. while  creating the abstract class pass Consumer.accept() method, so that it will get the consumer
     *  5. now finally get the RunnableClass object and call the add method, which will add objects in the threadpool
     *
     **/
    @Test
    public void main(){
        java.util.function.Consumer<String> consumer = (x->{
            if(x.length() > 3){
                System.out.println(x);
            }
        });
        consumer.accept("Testing");
        Collection<String> it = Arrays.asList("a","this","letter");
        RunnableClass<String> runnableClass =RunnableClassCalling(consumer);
        it.stream().forEach(x->runnableClass.add(x));

    }

    public <T>RunnableClass<T> RunnableClassCalling(java.util.function.Consumer<T> function){
        return new RunnableClass<T>(){
            @Override
            public void doAdd(T type) {
                function.accept(type);
            }
        };

    }



}
