package com.dwijen.leetCode;

import org.junit.Test;

public class GCD {
    public int findGCD(int a, int b){
        if(b==0 ){
            return a;
        }else{
            return findGCD(b, a%b);
        }
    }

    public int findLCM(int a, int b){
        return b*(a/findGCD(a, b));
    }

    public int findAnotherWayToGetGCD(int a, int b){
        while(b>0){
            int tmp = b;
            b = a%b;
            a = tmp;
        }
        return a;
    }
    @Test
    public void test(){
        //System.out.println(findGCD(25, 45));
        System.out.println(findAnotherWayToGetGCD(15,25));
        Double doubbble = Math.min(Double.MIN_VALUE, 0.0d);
        System.out.println("min value"+doubbble);
        System.out.println("Double min value :"+Double.MIN_VALUE);
        System.out.println("Integer min value :"+Integer.MIN_VALUE);
        //System.exit(0);
        Double d =Math.sqrt(18);
        System.out.println(d+" this is d");
    }
}
