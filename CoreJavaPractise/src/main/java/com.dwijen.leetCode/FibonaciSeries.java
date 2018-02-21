package com.dwijen.leetCode;

import org.junit.Test;

import java.util.ArrayList;

public class FibonaciSeries {
    public void solution(int seriesSize){
        int n0=0, n1 = 1, n3=0;

        ArrayList<Integer> series = new ArrayList<>();
        while(seriesSize >0){
            n3 = n0+n1;
            series.add(n3);
            n0= n1;
            n1 = n3;
            seriesSize--;
        }
        System.out.println(series.toString());
    }
    @Test
    public void test(){
        //solution(10);
        //findLength(123456789);
        System.out.println(RecursiveFibonaciSeries(5));
    }

    public void findLength(int n){
        if(n > 0 ){
            int i = (int)Math.pow(2, 32) ;
            int j = (int)Math.pow(2, -32);
            int length = (int)Math.log10(n)+1;
            System.out.println("length :" + length);
            System.out.println("Max size :"+Integer.MAX_VALUE);
            System.out.println("Max size :"+Integer.MIN_VALUE);
        }
    }

    public static int chk(Double d1, Double d2){
        return (int)(d1*d2);
    }
    public int RecursiveFibonaciSeries(int series){
        if(series == 1){
            return 1;
        }else if (series == 0){
            return 1;
        }else{
            return (RecursiveFibonaciSeries(series -1) + RecursiveFibonaciSeries(series-2));
        }
    }

}
