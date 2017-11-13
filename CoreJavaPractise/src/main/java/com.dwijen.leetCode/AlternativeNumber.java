package com.dwijen.leetCode;

import org.junit.Test;

public class AlternativeNumber {
    public void solution(int n){
        int size = Integer.highestOneBit(n);
        System.out.println(size);
    }
    @Test
    public void test(){
        solution(12);
    }
}
