package com.dwijen.PRACTICE;

import org.junit.Test;

import java.util.Arrays;

public class MinCoinsForDenimination {
    public int findMinCoinsForANyDenomination(int[] S, int target){
        int[] arr = new int[target+1];
        Arrays.fill(arr, Integer.MAX_VALUE);
        arr[0] = 0;
        int m = S.length;
        for(int i=1; i<=target; i++){
            for(int j = 0; j< m; j++){
                if(i - S[j] >= 0)
                    arr[i]  = Math.min(arr[i], arr[i - S[j]]);
            }
            arr[i] = arr[i]+1;
        }
        return arr[target];
    }

    @Test
    public void testMinCoind(){
        int[] arr = {1,2,5};
        System.out.println(findMinCoinsForANyDenomination(arr, 11));
    }
}
