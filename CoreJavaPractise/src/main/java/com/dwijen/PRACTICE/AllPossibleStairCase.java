package com.dwijen.PRACTICE;

import org.junit.Test;

public class AllPossibleStairCase {

    public int countAllPossibleWays(int[] steps, int finalDestination){
        int[] arr = new int[finalDestination+1];
        arr[0] =1; arr[1]=1; arr[2]=2;

        for(int i=3; i<= finalDestination ; i++){
            arr[i] = arr[i-1]+arr[i-2]+arr[i-3];
        }
        return arr[finalDestination];
    }

    @Test
    public void test(){
        int[] arr ={1,2,3};
        System.out.println(countAllPossibleWays(arr, 4));
    }
}
