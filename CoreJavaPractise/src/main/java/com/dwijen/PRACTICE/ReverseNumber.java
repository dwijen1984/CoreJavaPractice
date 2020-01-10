package com.dwijen.PRACTICE;

import org.junit.Test;

public class ReverseNumber {
    public int reversedInt(int input){
        int reverse = 0;
        System.out.println(input %10 != 0);
        System.out.println(input > 1);
        while(input %10 != 0 || input > 1){
            reverse = reverse * 10 + input%10;
            input = input/10;
        }
        return reverse;
    }
    @Test
    public void reverseTest(){
        System.out.println(reversedInt(3070));
    }

    @Test
    public void findIndex(){
        System.out.println(findExcelColumn("cb"));
    }

    public int findExcelColumn(String column){
        char[] chars = column.toCharArray();
        int val = 0;
        for(char c: chars){
            int index = c-'a'+1;
            val = val * 26 + index;
        }
        return val;
    }
}
