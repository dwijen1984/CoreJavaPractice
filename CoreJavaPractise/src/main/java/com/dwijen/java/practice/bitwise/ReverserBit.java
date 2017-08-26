package com.dwijen.java.practice.bitwise;

import org.junit.Test;

/**
 * Created by dkirtan on 8/24/17.
 */
public class ReverserBit {
    @Test
    public void test() {
        int x = 7;
        System.out.println("X: "+(Integer.highestOneBit(x) -1 ));
        System.out.println("Real Reverse :" + (~x & (Integer.highestOneBit(x) -1)));

    }
}
