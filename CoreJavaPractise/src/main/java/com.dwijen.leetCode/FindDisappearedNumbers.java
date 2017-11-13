package com.dwijen.leetCode;

import org.junit.Test;

import java.util.*;
import java.util.stream.Collectors;

public class FindDisappearedNumbers {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int size = nums.length;
        Arrays.sort(nums);
        Set<Integer> lst = Arrays.stream(nums).boxed().collect(Collectors.toSet());
        List<Integer> arrList = lst.stream().collect(Collectors.toList());
        List<Integer> finalList = new ArrayList<>();
        for(int i = arrList.size() -1 ; i >= 1; i--){
            if(arrList.contains(arrList.get(i) - 1))
                continue;
            else{
                int k = arrList.get(i) - arrList.get(i-1) -1 ;
                    while(k >= 1){
                        finalList.add(arrList.get(i) - k);
                        k--;
                    }
                //finalList.add(k);
            }
        }
        return finalList;
    }


    @Test
    public void tets(){
        int[] j = {1,2,2,3,7,9,10,11};
        findDisappearedNumbers(j);
        System.out.println(Arrays.asList(findDisappearedNumbers(j)).toString());
    }
}
