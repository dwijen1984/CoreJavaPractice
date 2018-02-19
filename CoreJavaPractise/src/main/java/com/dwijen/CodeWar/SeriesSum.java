package com.dwijen.CodeWar;

import org.junit.Test;

import java.text.DecimalFormat;

public class SeriesSum {

    public static String seriesSum(int n) {
        // Happy Coding ^_^
        double n0 = 1; double n1 = 4;
        double n3= 3;
        double sum = n0+1/n1;
        if(n > 2){
            while(n>2){
                n1 = (n1+n3);
                sum = sum + 1/n1;
                n--;
            }
        }if(n == 1){
            sum =1;
        }
        String str = String.format("0.2f", String.valueOf(sum));
        /*DecimalFormat df = new DecimalFormat("##.00");
        df.format(sum);*/
        return str;
    }

    @Test
    public void test(){
        Double f = 1d;
        //System.out.println(f/4);
        System.out.println("Sum: "+seriesSum(24));
    }
}
