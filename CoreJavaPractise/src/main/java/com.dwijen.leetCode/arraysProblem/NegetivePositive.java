package com.dwijen.leetCode.arraysProblem;

import org.junit.Test;

import java.util.Arrays;

public class NegetivePositive {
    void solution(int[] intArray){
        int tmp ; int pos = 0;
        for(int i =0; i < intArray.length; i++){
            if(intArray[i] < 0){
                tmp = intArray[pos];
                intArray[pos] = intArray[i];
                intArray[i] = tmp;
                pos++;
            }
        }
        System.out.println(Arrays.toString(intArray));

    }

    @Test
    public void test(){
        int[] a= {-9,-8, 2,-5,-4,3,4,1,-11};
        solution(a);
    }
}
