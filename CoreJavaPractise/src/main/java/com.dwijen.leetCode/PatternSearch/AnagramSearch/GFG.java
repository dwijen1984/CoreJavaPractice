package com.dwijen.leetCode.PatternSearch.AnagramSearch;

import org.junit.Test;

public class GFG {
    public int MAX = 256;

    public boolean compare(int[] arr1, int[] arr2) {
        for(int i=0; i<MAX ; i++){
            if(arr1[i] != arr2[i]){
                return false;
            }
        }
        return true;
    }
    public void anagramSearch(String pat,String txt){
         int[] countP = new int[MAX];
         int[] countTW = new int[MAX];
         int patLength = pat.length();
         int txtLength = txt.length();
         for(int i = 0; i< patLength; i++){
             countP[pat.charAt(i)]++;
             countTW[txt.charAt(i)]++;
         }
         for(int i= patLength; i< txtLength; i++){
             if(compare(countP, countTW)){
                 System.out.println("Patter found at :"+(i-patLength));
             }
             countTW[txt.charAt(i)]++;
             countTW[txt.charAt(i-patLength)]--;
         }
        if(compare(countP, countTW)){
            System.out.println("Patter found at :"+(txtLength -patLength));
        }
    }



    /* Driver program to test above function */
    @Test
    public void test()
    {
        String txt = "AAABABAA";
        String pat = "AABA";
        anagramSearch(pat, txt);
    }
}
