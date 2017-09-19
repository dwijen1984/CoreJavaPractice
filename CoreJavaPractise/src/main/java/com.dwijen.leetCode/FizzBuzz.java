package com.dwijen.leetCode;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dkirtan on 8/29/17.
 */
public class FizzBuzz {

    public List<String> fizzBuzz(int n) {
        List<String> outpot = new ArrayList<>();
        if(n%3 ==0 && n!=0){
            if(n%5 ==0 && n%3 ==0 && n!=0){
                outpot.add("fizzBuzz");
            }else{
                System.out.println("Buzz");
                outpot.add("Buzz");
            }
        }else if(n%5 ==0){
            outpot.add("Buzz");
        }else{
            outpot.add(Integer.toString(n));
        }
        return outpot;
    }

    @Test
    public void test(){
        List<String> str = fizzBuzz(0);
        System.out.println(str);
    }
}
