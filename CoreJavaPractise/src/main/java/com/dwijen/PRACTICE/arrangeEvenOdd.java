package com.dwijen.PRACTICE;

import org.junit.Test;

import java.util.*;
import java.util.stream.Collectors;

public class arrangeEvenOdd {
    public void arrange(int[] arr){
        List<Integer> lst = Arrays.stream(arr).boxed().collect(Collectors.toList());
        Collections.sort(lst, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2%2 - o1%2;
            }
        });
        lst.stream().forEach(x-> System.out.print(x));
    }

    @Test
    public void intTest(){
        int[] arr = {1,2,9,8,6,5};
        arrange(arr);
    }
}
