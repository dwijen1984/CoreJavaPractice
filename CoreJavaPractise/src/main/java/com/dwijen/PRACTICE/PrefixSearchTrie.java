package com.dwijen.PRACTICE;

import org.junit.Test;

public class PrefixSearchTrie {
    public static class Trie{
        Trie[] childern = new Trie[26];
        boolean isEnd = false;

        public Trie() {
            for(int i =0 ;i< 26; i++){
                childern[i] = null;
            }
        }
    }
    private static Trie head  = new Trie();

    public void insert(String str){
        char[] chars = str.toCharArray();
        Trie  pCrawl = head;
        for(char c : chars){
            int index = c -'a';
            pCrawl.childern[index] = new Trie();
            pCrawl = pCrawl.childern[index];
        }
        pCrawl.isEnd = true;
    }
    public boolean isPresent(String str){
        char[] chars = str.toCharArray();
        Trie  pCrawl = head;
        for(char c : chars){
            int index = c -'a';
            if(pCrawl.childern[index] == null || pCrawl.isEnd){
                return false;
            }
            pCrawl = pCrawl.childern[index];
        }
        return true;
    }

    public boolean isOnlyChild(Trie node){
        Trie[] children = node.childern;
        int count =0;
        for(Trie t : children){
            if(t != null)
                count++;
        }
        return count > 1 ? false : false;
    }

    @Test
    public void test(){
        insert("abcde");
        boolean s = isPresent("abd");
        System.out.println(s);
    }
}
