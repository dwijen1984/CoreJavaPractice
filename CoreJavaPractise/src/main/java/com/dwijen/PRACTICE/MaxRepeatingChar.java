package com.dwijen.PRACTICE;

import org.junit.Test;

public class MaxRepeatingChar {
    public char findMaxRepeatingChar(String str){
        char[] chars = str.toCharArray();
        int[] arr = new int[26];
        int max_occurrence = 0;
        int max_index = 0;
        for(char c : chars){
            int index = c-'a';
            arr[index]++;

            if(arr[index] >= max_occurrence){
                max_occurrence = Math.max(arr[c-'a'], max_occurrence);
                max_index = index;
            }
        }
        return (char) (max_index +'a');
    }

    @Test
    public void testFinsMaxOccurance(){
        System.out.println(findMaxRepeatingChar("aaaaabccc"));
    }
}
