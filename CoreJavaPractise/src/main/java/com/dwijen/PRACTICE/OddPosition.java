package com.dwijen.PRACTICE;

import org.junit.Test;

import java.util.Arrays;

public class OddPosition {
    public int[] arrange(int arr[]){
        int evenPosition = 0;
        int oddPosition = 1;
        int size = arr.length;
        while(evenPosition < size && oddPosition < size){
            while(evenPosition< size && arr[evenPosition]%2 ==0){
                evenPosition = evenPosition+2;
            }
            while( oddPosition< size && arr[oddPosition]%2 ==1 ){
                oddPosition = oddPosition+2;
            }
            if(oddPosition < size && evenPosition < size){
                int tmp = arr[evenPosition];
                arr[evenPosition]  = arr[oddPosition];
                arr[oddPosition] = tmp;
            }

        }
        return arr;
    }
    @Test
    public void test(){
        int[] arr = {0,2,3,4};
        int[] res = arrange(arr);
        Arrays.stream(res).boxed().forEach(x-> System.out.println(x));
    }
}
