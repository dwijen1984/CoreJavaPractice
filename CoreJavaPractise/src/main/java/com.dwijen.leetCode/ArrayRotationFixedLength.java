package com.dwijen.leetCode;

import org.junit.Test;

import java.util.Arrays;

public class ArrayRotationFixedLength {
    public void solution(int[] intArray, int arrayLength, int rotationLength){
        for(int i =0 ; i < rotationLength; i++){
            rotate(intArray, arrayLength);
        }
        System.out.println(Arrays.toString(intArray));
    }
    void rotate(int[] intArray , int length){
        int tmp ;
        tmp = intArray[0];
        for(int i=0 ; i < length -1 ; i++){
            intArray[i] = intArray[i+1];
        }
        intArray[length - 1] = tmp;
    }
    @Test
    public void test(){
        int[] a = {1,2,3,4,5,6,7};
        solution(a, 7, 2);
    }
}
