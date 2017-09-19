package com.dwijen.leetCode;

import org.junit.Test;

import java.util.*;

/**
 * Created by dkirtan on 8/28/17.
 */
public class DistributeCandies {
    public int distributeCandies(int[] candies) {
        Set<Integer> set = new HashSet<>();
        Map<Integer, Integer> mapOFItems = new TreeMap<>();

        int count = 1;
        for(int candie :candies){
            if(mapOFItems.get(candie) != null){
                mapOFItems.put(candie, count+1);
            }else{
                mapOFItems.put(candie, count);
            }
        }
        Set<Integer> s = mapOFItems.keySet();
        return (s.size() >= candies.length/2 ? candies.length/2 : s.size()/2);
    }

    @Test
    public void testCandies(){
        distributeCandies(new int[] {1,1,2,2,3,4});
    }
}
