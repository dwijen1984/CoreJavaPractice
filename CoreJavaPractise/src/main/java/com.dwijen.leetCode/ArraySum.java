package com.dwijen.leetCode;

import org.junit.Test;

import java.util.Arrays;

/**
 * Created by dkirtan on 9/11/17.
 */
public class ArraySum {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        for(int i =0 ; i < nums.length ; i++){
            if(i%2 == 0 ){
                sum = sum+nums[i];
            }
        }
        return sum;
    }
    @Test
    public  void main(){
        int[] arr = {-3, -1, 1,4,3,2};
        System.out.println("Value"+arrayPairSum(arr));
    }
}
