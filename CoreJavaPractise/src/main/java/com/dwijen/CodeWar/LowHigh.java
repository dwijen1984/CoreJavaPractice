package com.dwijen.CodeWar;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class LowHigh {
    public static String HighAndLow(String numbers) {
        int high = 0 , low = 0;
        String[] strArray = numbers.split(" ");
        List<Integer> intList = new ArrayList<>();
        int j = 0;
        for(String str : strArray){
            if(j==0){
                low = Integer.valueOf(str);
                high = Integer.valueOf(str);
                j++;
            }
            if(low > Integer.valueOf(str)){
                low = Integer.valueOf(str);
            }
            if(Integer.valueOf(str) > high){
                high = Integer.valueOf(str);
            }
        }
        System.out.println("Low :"+low);
        System.out.println("High ;"+high);
        return "throw towel";
    }

    @Test
    public void test(){
        String str = "11 21 34 84 71 9";
        HighAndLow(str);
    }
}
