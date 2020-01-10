package com.dwijen.PRACTICE;

import org.junit.Test;

public class MaxUniquePossibleCoinCombination {

    public int findMaxPossibleCombination(int[] S, int T){
        int[] target = new int[T+1];
        target[0] =1;
        for(int i=0; i < S.length; i++){
            for(int j= S[i]; j<=T; j++){
                target[j] = target[j] + target[j - S[i]];
            }
        }
        return target[T];
    }
    @Test
    public void testFindMax(){
        int[] arr = {1,2,3};
        /**
         * To make 4, you put these many coins in BAG
         *  {1,1,1,1}, {1,1,2}, {2,2}, {1,3}
         */
        System.out.println(findMaxPossibleCombination(arr, 4));
    }
}
