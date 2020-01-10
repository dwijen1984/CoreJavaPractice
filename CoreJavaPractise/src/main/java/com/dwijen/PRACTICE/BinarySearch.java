package com.dwijen.PRACTICE;

import org.junit.Test;

public class BinarySearch {

    public boolean binarySearch(int[] arr, int start, int end, int numToFound){

            if(start >= end){
                return false;
            }
            int maiden = (start+end)/2;
            if(arr[maiden] == numToFound) {
                return true;
            }

            if(arr[maiden] > numToFound){
                return binarySearch(arr, start, maiden, numToFound);
            }if(arr[maiden] < numToFound){
                return binarySearch(arr, maiden, end, numToFound);
            }
            return false;
    }
    @Test
    public void testBA(){
        int[] arr = {1,2,3,4,5,6};
        System.out.println(binarySearch(arr, 0, arr.length-1, 2));
    }
}
