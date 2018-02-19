package com.dwijen.leetCode;

import org.jetbrains.annotations.NotNull;
import org.junit.Test;

import java.util.*;
import java.util.stream.Collectors;

public class TopFive {

    public int findTopFive(int[] intarray){

        Map<Integer, countObject> mapCount = new HashMap<Integer, countObject>();

        for(int i : intarray){
            countObject countZero  = new countObject(0);
            countObject value = mapCount.getOrDefault(i, countZero);
            value.setCount(value.getCount() +1);
            mapCount.put(i, value);
        }
        List<Integer> l = new ArrayList<>();
/*        for(int max : mapCount.values()){
           l.add(max);
        }*/
        Collections.sort(l);
        return l.get(1);
    }

    @Test
    public void test(){
        int[] a = {1,2,1,1,1,1,3,4,5,6,2,3,2,1,3,3,3};
        findTopFive(a);
    }

    class countObject implements Comparable{
        int count;
        public countObject(int count){
            this.count = count;
        }


        public int getCount() {
            return count;
        }

        public void setCount(int count) {
            this.count = count;
        }

        @Override
        public int compareTo(@NotNull Object o) {
            return 0;
        }
    }
}
