package com.dwijen.java.practice.DesignPrimitiveDatastructure;

import org.junit.Test;

import java.util.Collections;
import java.util.LinkedList;

public class ReverseLinkedList {

    public void reverse(LinkedList<String> linked_list){
        LinkedList<String> reverseList = new         LinkedList<String> ();

        while(!linked_list.isEmpty()){
            reverseList.add(linked_list.removeLast());
        }
        reverseList.stream().forEach(x-> System.out.println(x));
    }

    @Test
    public void test(){
        LinkedList<String> OriginalList = new         LinkedList<String> ();
        OriginalList.add("1");
        OriginalList.add("2");
        OriginalList.add("3");

        reverse(OriginalList);
    }
}
