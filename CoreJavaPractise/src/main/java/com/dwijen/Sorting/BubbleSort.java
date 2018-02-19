package com.dwijen.Sorting;

import org.junit.Test;

import java.util.Arrays;

public class BubbleSort {

    public int[] bubbleSorting(int[] intArray){
        int length = intArray.length;
        for(int i = 0 ; i < length; i++){
            for(int j = 0 ; j< length -i-1; j++){
                if(intArray[j] > intArray[j+1]){
                    int tmp = intArray[j+1];
                    intArray[j+1] = intArray[j];
                    intArray[j] = tmp;
                }
            }
        }
        return intArray;
    }

    @Test
    public void test(){
        int[] a = {1,4,3,2,7,7,5,6};
        int[]  b= bubbleSorting(a);
        System.out.println(Arrays.toString(b));
    }
}
