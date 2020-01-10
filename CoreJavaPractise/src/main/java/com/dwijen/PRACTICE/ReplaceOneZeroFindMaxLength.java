package com.dwijen.PRACTICE;

import org.junit.Test;

public class ReplaceOneZeroFindMaxLength {

    public int findMaxSize(int[] arr, int k){
        int count0 = 0 ; int l =0;
        int maxLength = 0;
        for(int i = 0 ; i< arr.length; i++){
            if(arr[i] == 0)
                count0++;

            while(count0 > k){
                if(arr[l] == 0)
                    count0--;
                l++;
            }
            maxLength = Math.max(maxLength, i-l+1);
        }
        return maxLength;
    }
    @Test
    public void test(){
        int[] arr = {0,0,0,1};
        System.out.println(findMaxSize(arr, 2));
    }
}
