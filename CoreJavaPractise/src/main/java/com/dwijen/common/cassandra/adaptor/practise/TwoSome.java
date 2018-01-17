package com.dwijen.common.cassandra.adaptor.practise;

import java.util.*;

/**
 * Created by dkirtan on 6/23/17.
 */
public class TwoSome {
    public static int[] twoSum(int[] nums, int target) {
        //java.util.Arrays.sort(nums);
 //       Arrays.stream(nums).forEach(System.out::println);
        int length = nums.length  -1;
        int primaryIndex = 0;
        int[] output = new int[nums.length];
        for(int i =0; i < length ; i++){
            for(int j = length; j>i; j--){
                if(nums[i] + nums[j] == target){
                    System.out.println(i+" , "+j);
                    output[primaryIndex] = i;
                    primaryIndex++;
                    output[primaryIndex] = j;
                    break;
                }
                else{
                    continue;
                }
            }
        }
        return output;
    }

    public static int[] twoSum_2(int[] numbers, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < numbers.length; i++) {
            if (map.containsKey(target - numbers[i])) {
                result[1] = i ;
                result[0] = map.get(target - numbers[i]);
                return result;
            }
            map.put(numbers[i], i );
        }
        return result;
    }

    public static void main(String[] args){
        int[] arays = {1,2,3,3};
        int target = 6;
        int[] outPut = twoSum_2(arays, target);
        //int[] outPut = twoSum(arays, target);
        Arrays.stream(outPut).forEach(x->System.out.print(x));

    }
}
