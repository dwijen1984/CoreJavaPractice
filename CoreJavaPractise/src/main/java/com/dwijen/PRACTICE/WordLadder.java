package com.dwijen.PRACTICE;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class WordLadder {

    public boolean findWordLadder(List<String> dictory, String start, String end){

        LinkedList<String> queue = new LinkedList<>();
        queue.add(start);
        while(!queue.isEmpty()) {

            char[] chars = queue.remove().toCharArray();
            for (int i = 0; i < chars.length; i++) {
                char tmp = chars[i];
                for (char c = 'a'; c <= 'z'; c++) {
                    chars[i] = c;
                    String str = new String(chars);
                    if(str.equals(end)){
                        System.out.println(end);
                        return true;
                    }
                    if (dictory.contains(str)) {
                        System.out.print(str+"-->");
                        queue.add(str);
                        dictory.remove(str);
                    }
                }
                chars[i] = tmp;
            }
        }
        return false;
    }
    @Test
    public void test(){
        String[] strs = {"hot","dot","dog","lot","log"};
        List<String> strList = new ArrayList<>();
        for(String str: strs){
            strList.add(str);
        }
        System.out.println(findWordLadder(strList, "hit", "cog"));
    }
}
