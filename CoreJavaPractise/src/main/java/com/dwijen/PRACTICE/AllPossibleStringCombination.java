package com.dwijen.PRACTICE;

import org.junit.Test;

public class AllPossibleStringCombination {

    public void printAllCombination(String perm, String word) {
        if (word.isEmpty()) {
            System.out.println(perm);
        } else {
            for (int i = 0; i < word.length(); i++) {
                printAllCombination(perm + word.charAt(i), word.substring(0, i) + word.substring(i + 1, word.length()));
            }

        }
    }

    @Test
    public void testComb(){
            printAllCombination("", "abc");
    }
}
