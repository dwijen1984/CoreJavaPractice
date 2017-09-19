import org.junit.Test;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by dkirtan on 9/15/17.
 */
public class HackerRank {
    @Test
    public void testIT(){
        int[] a = {1,3,4,6,5,8,7,10};
        //findNumber(a, 17);
        int[] aaa = oddNumbers(2,5);
        for (int i : aaa) {
            System.out.println(i);
        }
    }

    static String findNumber(int[] arr, int k) {
        List<Integer> lst = new ArrayList<>();
        for (int i : arr) {
            lst.add(i);
        }
        Collections.sort(lst);
        Optional<Integer> a = lst.stream().filter(x -> x==k).findAny();
        System.out.println(a.isPresent());
        if(a.isPresent()){
            return "YES";
        }else{
            return "NO";
        }
    }
    static int[] oddNumbers(int l, int r) {

        int len = 0;
        for(int i =l ; i <=r; i++){
            if(i%2 != 0){
                len++;
            }
        }
        int[] arr = new int[len];
        for(int m =l,k=0 ; m <=r; m++){
            if(m%2 != 0){
                arr[k]=m;
                k++;
            }
        }

        return arr;
    }

}
