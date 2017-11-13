package com.dwijen.leetCode.arraysProblem;

import org.junit.Test;

public class RotationArray {
    public int location(int[] intArray){
        for(int i = 0 ; i< intArray.length ;i++){
            if(intArray[i] > intArray[i+1]){
                return i;
            }
        }
        return -1;
    }
    @Test
    public void test(){
        int[] intArray = {4,5,6,1,2};
        System.out.println("pivot Location :"+location(intArray));
    }
}
