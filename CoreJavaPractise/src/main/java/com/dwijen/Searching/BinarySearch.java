package com.dwijen.Searching;

import org.junit.Test;

public class BinarySearch {
    public int binarySearch(int[] intArray, int low, int high, int findElement){
        if(low > high){
            return -1;
        }
        int mid=(high+low)/2;
        if(intArray[mid] == findElement){
            return mid;
        }else if(intArray[mid] > findElement){
            return binarySearch(intArray, low, mid, findElement);
        }else{
            return binarySearch(intArray, mid+1, high, findElement);
        }
    }

    @Test
    public void test(){
        int[] intArray = {1,2,3,4,5,6};
        int position = binarySearch(intArray, 0, intArray.length -1, 9);
        System.out.println("position : "+(position+1));
    }
}
