package com.dwijen.leetCode;

import org.junit.Test;

import java.util.*;
import java.util.stream.Collectors;

public class Solution {
    public int maxProfit(int[] prices) {
        int i = 0;
        int valley = prices[0];
        int peak = prices[0];
        int maxprofit = 0;
        while (i < prices.length - 1) {
            while (i < prices.length - 1 && prices[i] >= prices[i + 1])
                i++;
            valley = prices[i];
            while (i < prices.length - 1 && prices[i] <= prices[i + 1])
                i++;
            peak = prices[i];
            maxprofit += peak - valley;
        }
        return maxprofit;
    }

    @Test
    public void test(){
        /*int[] a = {2,1,3,4,5};
        maxProfit(a);*/

        /*List<Integer> l = null;
        Iterator<Integer> i = l != null ?l.iterator() : null;
        while(i.hasNext()){
            System.out.println("test");;
        }*/
        Set<Long> l = new HashSet<>();
        l.add(1l);
        Collection<Integer> c = l.stream().map(Long::intValue).collect(Collectors.toList());
        System.out.println(c);
        Short s = 0;
        Short sq = 0;
        System.out.println(s.equals(0));
    }
    public static void main(){
        Set<Long> l = new HashSet<>();
        l.add(1l);
        Collection<Integer> c = l.stream().map(Long::intValue).collect(Collectors.toList());
        System.out.println(c);
    }
}