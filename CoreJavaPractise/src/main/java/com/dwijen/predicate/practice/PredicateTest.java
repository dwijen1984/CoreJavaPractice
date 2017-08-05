package com.dwijen.predicate.practice;

import java.util.Arrays;
import java.util.Collection;
import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 * Created by dkirtan on 7/11/17.
 */
public class PredicateTest {
    public static void main(String args[]){
        Predicate<String> p = s-> s.length() >3;
        //boolean b = p.test("ThisisistheTest");
        //System.out.print(b);
        Collection<String> it = Arrays.asList("a","this","letter");
        Collection<Long> it_Long = Arrays.asList(2l,3l,4l);


        it.stream().filter(p).forEach(System.out:: println);
        it_Long.stream().filter(x-> x >3).forEach(System.out:: println);
    }
}
