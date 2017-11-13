package com.dwijen.leetCode;

import org.junit.Test;

public class FindSingleNumber {
    public int solution(int[] nums) {
        int result =0;
            for(int num : nums){
                result = result ^ num;
            }
            return result;
    }

    @Test
    public void test(){
        int[] input = {6,2,2,3,4,3,4,5,6};
        System.out.println("O/P : "+solution(input));
    }
}
