package com.dwijen.PRACTICE;

import org.junit.Test;

public class MaxSubArraySum {

    public int maxSubArraySumFunc(int[] arr){
        int[] maxArraySum = new int[arr.length];
        maxArraySum[0] = arr[0];
        int maxVal = 0;
        for(int i =1; i< arr.length; i++){
            for(int j =0; j< i;j++){
                if(arr[i] + maxArraySum[j] > arr[i]){
                    maxArraySum[i] = arr[i] + maxArraySum[j];
                    maxVal = Math.max(maxArraySum[i], maxVal);
                }else{
                    maxArraySum[i] = arr[i];
                    maxVal = Math.max(maxArraySum[i], maxVal);
                }
            }
        }
        return maxVal;
    }

    @Test
    public void testMaxSA(){
        int[] arr = {1,-2,0,1,1,2};
        System.out.println(maxSubArraySumFunc(arr));
    }
}
