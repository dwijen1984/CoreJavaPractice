package com.dwijen.leetCode;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class UniqueCharecter {

    public boolean isUniqueString(String str){
        Map<String, Boolean> map= new HashMap<>();
        int i =(int)str.charAt(0);
        for(char c : str.toCharArray()){

            if(map.getOrDefault(String.valueOf(c), false)){
                return false;
            }else{
                map.put(String.valueOf(c), true);
            }
        }
        return true;
    }
    @Test
    public void test(){
        System.out.println(isUniqueString("GEEK"));
    }
}
