package hackerRank;

import com.dwijen.java.practice.DesignPrimitiveDatastructure.Stack;
import jnr.ffi.annotations.In;
import org.junit.Test;

import javax.print.attribute.IntegerSyntax;
import java.util.*;

public class BalanceBrackets {
    /*
    1. opening bracket, push in stack
    2. found closing bracket
        i. stack.pop(opening) is matching with closing bracket - then balanced
     */
    public char[][] Token = {{ '{', '}' }, { '[', ']' }, { '(', ')' }};

    public boolean isBalanced(String expression){
        Stack<Character> stack = new Stack<>();
        for(char c : expression.toCharArray()){
            if(isOpen(c)){
                stack.push(c);
            }else{
                char opening = stack.pop();
                if(notEqual(opening, c)){
                    return false;
                }
            }
        }
        return true;
    }

    public boolean isOpen(char c){
        for(char[] check : Token){
            if(check[0]== c){
               return true;
            }
        }
        return false;
    }

    public boolean notEqual(char opening, char closing){
        for(char[] check : Token){
            if(check[0] == opening){
                if(check[1] == closing){
                    return false;
                }
            }
        }
        return true;
    }

    @Test
    public void test(){
        String exp = "{()[]}";
        System.out.println("result : "+isBalanced(exp));
    }

    public int getval(int val, Map<Integer, Integer> map){
         return map.get(val);
    }
}
