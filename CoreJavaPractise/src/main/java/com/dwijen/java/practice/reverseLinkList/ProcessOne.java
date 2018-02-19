package com.dwijen.java.practice.reverseLinkList;

import org.junit.Test;

import java.util.Arrays;
import java.util.LinkedList;

/**
 * Created by dkirtan on 8/24/17.
 */
public class ProcessOne {
    public <E> LinkedList<E> reverseListOne(LinkedList<E> linkedList){
         E e = linkedList.getLast();
         LinkedList l = new LinkedList();
         LinkedList<E> copyList = new LinkedList<E>();
//         linkedList.stream().forEach(x -> copyList.addFirst(x));

         while(linkedList.peekLast() != null){
            copyList.addLast(linkedList.removeLast());
         }
        return copyList;
    }

    @Test
    public void TestReverse(){
        LinkedList<Long> ls = new LinkedList<>();
        ls.addAll(Arrays.asList(1l, 2l, 3l));
        System.out.println("before change:"+ls);
        System.out.println("After change:"+reverseListOne(ls));
    }
}
