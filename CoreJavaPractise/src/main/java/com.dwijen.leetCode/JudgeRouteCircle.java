package com.dwijen.leetCode;

import java.util.*;

/**
 * Created by dkirtan on 8/14/17.
 */
public class JudgeRouteCircle {

    public static boolean judgeCircle(String Moves) {
        int result = 0;
        boolean return_type = false;
        String finalMoves = Moves.toUpperCase();

        int finalMmovesLenth = finalMoves.length();
        List<Character> setChar = new ArrayList<>();
        if(finalMmovesLenth%2 ==0){
            for(int lenth = 0;lenth < finalMmovesLenth; lenth++){
                if(finalMoves.charAt(lenth) == 'R' || finalMoves.charAt(lenth) =='U'){
                    result = result+1;
                }else if(finalMoves.charAt(lenth) =='L' || finalMoves.charAt(lenth) =='D'){
                    result = result-1;
                }

                return_type = result== 0 ? true:false;
            }
        }
        return return_type;
    }

    public static void main(String args[]){
        System.out.println("OutPut >> "+judgeCircle("LDRRLRUULR"));
    }
}
