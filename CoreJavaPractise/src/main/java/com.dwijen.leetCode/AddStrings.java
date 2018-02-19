package com.dwijen.leetCode;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

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
        int result = Integer.parseInt("1");
        System.out.println(result);

        String str = "Hi How are You..!!";
        str = str.replace(" ", "ABC");
        System.out.println(str);
    }

    @Test
    public void testMin(){
        //int[] arr = {1,3, -4, 5, -9};
        List<Integer> arr = Arrays.asList(1, -2, -5, 4, 7);
        Predicate<Integer> p = new Predicate<Integer>(){
            int min = 0;
            @Override
            public boolean test(Integer integer) {
                min = (min==0) ? min = integer : min;
                if(integer < min){
                    min=integer;
                    return true;
                }
                return false;
            }
        };
        arr.stream().filter(p).collect(Collectors.toList());
    }
}
