package com.dwijen.leetCode;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;
import org.junit.Test;

import java.util.*;

public class CourseProblem {
    /*
[1,2] , [3,1], [2,3]

Here course 1 is dependent on 2
Here course 2 is dependent on 3
Here course 3 is dependent on 1

So, finally its a cyclic dependency and kind of dead-lock
Here you have to find that only. Solution is O(n2)
 */
    public boolean canFinish(int numCourses, int[][] prerequisites){
        Multimap<Integer, Integer> map= ArrayListMultimap.create();
        for(int[] pre :prerequisites){
            map.put(pre[0], pre[1]);
        }
        for(int i : map.keySet()){
            boolean b = isdone(map, i);
            if(!b){
                return false;
            }
        }
        return true;
    }
    public boolean isdone(Multimap<Integer, Integer> map, int key){
        Collection<Integer> value = map.get(key);
        List<Integer> list = new ArrayList<>();
        int keyNote = key;
        while(map.get(keyNote) != null){
            //keyNote = map.get(keyNote);
            list.add(keyNote);
            if(list.contains(key))
                return false;
        }

        return true;
    }
    @Test
    public void test2(){
        int[][] intArray = {{0,1}, {3,1}, {1,3}, {3,2}};
        String s = canFinish(4, intArray) ? "Yes":"No";
        System.out.println("Is Possible :"+s);
    }
}
