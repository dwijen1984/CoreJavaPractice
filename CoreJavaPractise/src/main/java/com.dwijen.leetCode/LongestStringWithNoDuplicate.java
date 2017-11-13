package com.dwijen.leetCode;

import org.junit.Test;
import sun.tools.tree.CharExpression;

import java.util.*;

public class LongestStringWithNoDuplicate {
    public String solution(String str){
        char[] charArrya = str.toCharArray();
        Map<Character, Character> map = new HashMap<Character, Character>();
        Set<Character> charSet = new HashSet<Character>();
        for(char c : charArrya){
            charSet.add(c);
        }
        Character[] arrayOfChar = charSet.toArray(new Character[charSet.size()]);
        char[] finalCharArray = new char[arrayOfChar.length];
        int i = 0;
        for(Character c : arrayOfChar){
            finalCharArray[i]= c.charValue();
            i++;
        }
        String result = String.valueOf(finalCharArray);
        return result;
    }
    @Test
    public void Test(){
        String ans = solution("aaryan");
        System.out.println(ans);
    }
}
