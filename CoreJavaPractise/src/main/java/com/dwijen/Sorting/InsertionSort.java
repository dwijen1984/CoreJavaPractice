package com.dwijen.Sorting;

import org.junit.Test;

import java.util.Arrays;

public class InsertionSort {
    /*

    8,9,6
    i = 1 to array length
        j = i-1 to 0
     So, time complexity is O(n2), not very good for big array with millions data array
     */

    public void insertionSort(int[] inputArray){
        int tmp;
        for(int i = 1; i< inputArray.length; i++){
            int key = inputArray[i];
            int j = i-1;
            while(j>= 0 && key < inputArray[j]){
                tmp = inputArray[j];
                inputArray[j] = inputArray[j+1];
                inputArray[j+1] = tmp;
                j--;
            }
        }
        System.out.printf("Sorted Array: "+ Arrays.toString(inputArray));
    }

    @Test
    public void test(){
        int[] input = {9,8,6,2,4,3,5,1};
        System.out.println("Input Array: "+Arrays.toString(input));
        insertionSort(input);
    }
}
