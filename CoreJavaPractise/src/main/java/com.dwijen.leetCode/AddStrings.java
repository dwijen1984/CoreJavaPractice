package com.dwijen.leetCode;

import org.junit.Test;

public class AddStrings {

    public String solution(String num1, String num2) {

        int result1 =0;
        int result2 =0;
        for(char car : num1.toCharArray()){
            result1 = result1*10 +(car - '1'+1);
        }
        for(char car : num2.toCharArray()){
            result2 = result2*10 +(car - '1'+1);
        }
        String finalResult = String.valueOf(result1+result2);
        System.out.println(finalResult);
        return finalResult;
    }

    @Test
    public void test(){
        solution("0", "0");
    }
}
