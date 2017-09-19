package com.dwijen.leetCode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by dkirtan on 8/29/17.
 */
public class MergeArray {

        public static void main(String[] args) {
            int[] arr1 = {2,9,14};
            int[] arr2 = {13,18,-1,-1,-1};

            mergeArrays(arr1,arr2);
        }

        static void mergeArrays(int[] arr1, int [] arr2) {
            int[] bigArray, shortArray;
            if(arr1.length > arr2.length){
                bigArray = arr1;shortArray = arr2;
            }else{
                bigArray = arr2;shortArray = arr1;
            }

            int longArrayLen =    bigArray.length;
            int shortArrayLen =   shortArray.length;

            //for(int i=longArrayLen-1 ; i<shortArrayLen-1 ; i--){
            int j=0;
            for(int i=longArrayLen-1 ; i>=shortArrayLen-1 ; i--){
                    bigArray[i] = shortArray[j];
                    j++;

            }

            List<Integer> lst = new ArrayList<Integer>();
            for(int i :bigArray){
                lst.add(i);
            }

            Collections.sort(lst);
            System.out.println(lst);
        }
    }

