package com.dwijen.PRACTICE;

import org.junit.Test;

import java.util.HashMap;

public class HashMapPractise {
    public class Entry{
        int key;
        int val;
        Entry next;

        public Entry(int key, int val) {
            this.key = key;
            this.val = val;
        }
    }

    int inittaila_size = 10; int size = 0;
    Entry[] entry = new Entry[inittaila_size];

    public void put(int key, int val){
        int hashVal = key%inittaila_size;
        Entry en = entry[hashVal];

        if(en == null) {
            entry[hashVal] = new Entry(key, val);
        }
        else if(en.next == null) {
            en.next = new Entry(key, val);
        }
        else{
            while(en != null){
                if(en.next == null){
                    en.next = new Entry(key, val);
                    break;
                }
                en = en.next;
            }
        }
        size++;
    }

    public int remove(int key, int val){
        int hashVal = key%inittaila_size;
        Entry en = entry[hashVal];
        if(en == null) {
            return -1;
        }else{
            if(en.val == val){
                en = en.next;
                size--;
                return val;
            }
            while(en.next != null){
                if(en.next.val == val){
                    en.next = en.next.next;
                    size--;
                    return val;
                }
                en = en.next;
            }
        }
        return -1;
    }

    @Test
    public void testHasMap(){
        HashMapPractise hs = new HashMapPractise();
        hs.put(10,1);
        hs.put(12,2);
        hs.put(12,3);
        hs.put(12,4);
        hs.remove(12, 3);
        System.out.println(hs);
    }



}
