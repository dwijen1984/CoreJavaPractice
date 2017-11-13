package com.dwijen.leetCode;

import org.junit.Test;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;


public class RemoveDuplidateInOrder {
    public void Solution(String strArray){
        int result = 0;
        for(char ch : strArray.toCharArray()){
             result  = result*26 + ((ch - 'A')+1);
        }
        System.out.println( "column number: "+result);

    }
    @Test
    public void test(){
        String[] input = {"a", "a", "b", "bc", "cb","da", "bc"};
        Solution("CAA");
        int[] a= {1,2,3,4,5,6};
        Solution(a);
    }

    public void Solution(int[] arr){

        int result = Arrays.stream(arr).sum();
        System.out.println(result);
    }

}
