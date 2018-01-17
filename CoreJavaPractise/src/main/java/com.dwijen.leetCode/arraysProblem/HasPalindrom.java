package com.dwijen.leetCode.arraysProblem;

import com.sun.deploy.util.ArrayUtil;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class HasPalindrom {

    public void CountPalindromInLetter(String str){
        if(str.length() <=1){
            System.out.println("This has a single palindrom");
            return ;
        }
        char[] charArr = str.toCharArray();
        int numOfPalindrom = 0;
        int size = charArr.length;
        Set<String> s = new HashSet<String>();
        for(int i = 0; i< size; i++){
            for(int j = i+1; j< size; j++){
                if(charArr[i] ==charArr[j]){
                    char[] newCharArray = new char[j - i+1];
                    int k = i ; int l = 0;
                    while(k<=j){
                        newCharArray[l] = charArr[k];
                        k++; l++;
                    }
                    s.add(String.valueOf(newCharArray));

                }
            }
        }
        for(String c : s){
            if(palindromWord(c.toCharArray())){
                numOfPalindrom++;
                System.out.println("No : "+numOfPalindrom+"  Palindrom :"+String.valueOf(c));

            }
        }

        System.out.println("Total number of palindrom : "+numOfPalindrom);
    }

    public boolean palindromWord(char[] charArray){
        int arraySize = charArray.length -1;
        boolean isPalindrom = false;
        for(int i = 0 ; i< arraySize/2; i++){
            if(charArray[i] == charArray[arraySize]){
                isPalindrom = true;
            }else{
                isPalindrom = false;
            }
        }
        if(arraySize > 2){
            return isPalindrom;
        }else{
            return true;
        }
    }

    @Test
    public void test(){
        CountPalindromInLetter("bbbb");
    }
}
