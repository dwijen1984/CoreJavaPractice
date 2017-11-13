package com.dwijen.leetCode;

import jnr.ffi.annotations.In;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class FindTheDifference {

    public char solution(String s, String t){
        char finalChar = 0;
        Map<Character, Integer> countLetters = new HashMap<>();
        for(char sChar : s.toCharArray()){
            int count = countLetters.getOrDefault(sChar, 0) +1;
            countLetters.put(sChar, count);
        }

        for(char tChar : t.toCharArray()){
            int count = countLetters.getOrDefault(tChar, 0) -1;
            countLetters.put(tChar, count);
            if(count < 0){
                finalChar = tChar;
            }
        }
        return finalChar;
    }

    @Test
    public void test(){
        char c = solution("a", "aa");
        System.out.println("the diff char is :"+c);

        // This is to check the size of an Integer
        int i = 1222222335;
        int size = (int)Math.log10(i)+1;
        System.out.println(String.valueOf(i).length());
        System.out.println("size: "+size);
    }
}
