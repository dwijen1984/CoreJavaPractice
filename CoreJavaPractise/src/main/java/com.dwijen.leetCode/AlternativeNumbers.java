package com.dwijen.leetCode;

import org.junit.Test;

import java.util.Arrays;

public class AlternativeNumbers {
    public int[] solution(int[] intArray) {
        int pos = 0;
        int index = 0;
        int tmp = 0;
        for (int a : intArray) {

            if (a < 0) {
                tmp = intArray[pos];
                intArray[pos] = intArray[index];
                intArray[index] = tmp;
                pos++;
            }
            index++;
        }
        int neg = 0;
        while (pos < intArray.length && neg < pos && intArray[neg] < 0) {
            tmp = intArray[neg];
            intArray[neg] = intArray[pos];
            intArray[pos] = tmp;
            neg += 2;
            pos++;
        }
        return intArray;
    }


    @Test
    public void Test() {
        int[] tobeSorted = {-1, -2, 4, -11, 7, -9};
        System.out.printf("int array :" + Arrays.toString(solution(tobeSorted)));
    }
}
