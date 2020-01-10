package com.dwijen.PRACTICE;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class LongestNonRepeatingChars {

    public int findLongestNonRepeatingChars(char[] chars){
        Set<Character> charSet = new HashSet<>();
        int i=0; int j =0;
        int maxLength = 0;
        while(i< chars.length && j < chars.length){
            if(!charSet.contains(chars[i])){
                charSet.add(chars[i]);
                i++;
            }else{
                charSet.remove(chars[j]);
                j++;
            }
            maxLength = Math.max(i -j , maxLength);
        }
        return maxLength;
    }

    @Test
    public void FindLongestNonRepeatingCharsTest(){
        String str = "maa";
        System.out.println(findLongestNonRepeatingChars(str.toCharArray()));
    }
}
