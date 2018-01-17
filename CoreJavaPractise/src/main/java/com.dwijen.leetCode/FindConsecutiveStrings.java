package com.dwijen.leetCode;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindConsecutiveStrings {
    public void getString(String str){
        int length = str.length();
        StringBuilder strBuilder = new StringBuilder();
        for(int i = 0; i < length ; i++){
            int j = 1;
            while((i < length)){
                if((i+1) < length && str.charAt(i) == str.charAt(i+1) ){
                    i = i+1;
                    j++;
                }else{
                    break;
                }

            }
            strBuilder.append(str.charAt(i)).append(j);
        }
        System.out.println(strBuilder);
    }

    @Test
    public void test(){
        getString("aaccbbb!!!bccc@@@@cccc");
    }

    public void testRepeatCharecter(String str){
        char[] charArray = str.toCharArray();
        List<Character> list = new ArrayList<>();
        for(char c : charArray){
            list.add(c);
        }
        Collections.sort(list);
        for(int i = 0 ; i < str.length(); i++){
            char temp = str.charAt(i);
            list.remove(str.charAt(i));
            if(!list.contains(temp)){
                System.out.println("Value is :"+temp);
                return;
            }
        }
    }

    @Test
    public void testCase(){
        testRepeatCharecter("iijssss");
    }
}
