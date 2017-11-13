package com.dwijen.leetCode;

import org.junit.Test;


public class FindPrimeNumbers {
    public void solution(int range){
        boolean noPrime;
        int count = 0;

        for(int i =2; i <= range; i++){
            noPrime = false;
            for(int j = 2; j <= Math.sqrt(i); j++){
                if(i%j ==0){
                    noPrime= true;
                }
            }
            if(!noPrime){
                count++;
                //System.out.print(i + "--- ");
                System.out.println(count + " ");
            }
        }
    }
    @Test
    public void test(){
        solution(2);
    }
}
