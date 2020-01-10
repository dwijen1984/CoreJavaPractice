package com.dwijen.PRACTICE;

import org.junit.Test;

public class longestIncresingSubsequence {

    public int lengthOfIncresingSubsequesnce(int[] arr){
        int[] duplicateArr = new int[arr.length];
        duplicateArr[0] = 1;
        int overAllMax = 0;

        for(int i =1; i< arr.length; i++){
            int max_val = 0;
            for(int j = 0; j< i; j++){
                if(arr[i] > arr[j]){
                    max_val = Math.max(duplicateArr[j], max_val);
                }
            }
            duplicateArr[i] = max_val+1;
            overAllMax = Math.max(overAllMax, duplicateArr[i]);
        }
        return overAllMax;
    }

    @Test
    public void testLISS(){
        int[] arr = {1,3,4,2,5};
        System.out.println(lengthOfIncresingSubsequesnce(arr));
    }



}
