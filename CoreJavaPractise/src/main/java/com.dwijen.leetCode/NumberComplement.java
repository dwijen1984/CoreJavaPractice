package com.dwijen.leetCode;

import org.junit.Test;

/**
 * Created by dkirtan on 8/28/17.
 */
public class NumberComplement {

    public int findComplement(int num) {
        return ~num & ((Integer.highestOneBit(num) << 1) - 1);
    }
    @Test
    public void testComplement(){
        int x = 9;
        System.out.println("x :"+x);
        System.out.println("~x :"+findComplement(x));
    }
}
