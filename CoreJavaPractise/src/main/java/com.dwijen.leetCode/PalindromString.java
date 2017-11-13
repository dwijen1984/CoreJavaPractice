package com.dwijen.leetCode;

import org.junit.Test;

public class PalindromString {
    public void solution(String inputStr){
        char[] a = inputStr.toCharArray();
        boolean notaPalindrom = false;
        
        int arrayLength = a.length -1;
        if(a.length == 1 || a.length == 0){
            System.out.println("palindrom");
        }
        else{
            for(int i =0 ; i < a.length/2; i++){
                if(a[i] != a[arrayLength -i]){
                    notaPalindrom = true;
                    break;
                }
            }
            if(notaPalindrom){
                System.out.println("Not a palindrom");
            }else{
                System.out.println("palindrom");
            }
        }
    }
    @Test
    public void test(){
        solution("aaa!Iaa");
    }
}
