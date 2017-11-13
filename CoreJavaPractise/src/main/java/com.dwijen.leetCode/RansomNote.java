package com.dwijen.leetCode;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class RansomNote {
    boolean solution(String ransomNote, String magazine){
        Map<Character, Integer> mapToTest = new HashMap<>();
        for(char c : magazine.toCharArray()){
            int key = mapToTest.getOrDefault(c, 0)+1;
            mapToTest.put(c, key);
        }

        for(char c : ransomNote.toCharArray()){
            int key = mapToTest.getOrDefault(c, 0) -1;
            if(key < 0)
                return false;
            mapToTest.put(c, key);
        }
        return true;
    }
    @Test
    public void test(){
        boolean val = solution("aa", "bjbacj");
        System.out.println(val);
    }
}
