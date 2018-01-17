package com.dwijen.leetCode;


import org.junit.Test;

public class Paranthesse {
    public void testCloser(String str){
        java.util.Stack<Character> stack = new java.util.Stack<>();
        for(int i = 0 ; i < str.length() ; i++){
            if(str.charAt(i) == '{' || str.charAt(i) == '(' || str.charAt(i) == '['){
                stack.push(str.charAt(i));
            }else if(str.charAt(i) == '}'){
                if(stack.peek() == '{'){
                    stack.pop();
                }
            }
            else if(str.charAt(i) == ')'){
                if(stack.peek() == '('){
                    stack.pop();
                }
            }
            else if(str.charAt(i) == ']'){
                if(stack.peek() == '['){
                    stack.pop();
                }
            }
        }
        if(stack.empty()){
            System.out.println("Correctly Implemented..");
        }else{
            System.out.println("NOT Correctly Implemented..");
        }
    }
    @Test
    public void test(){
        testCloser("{({[]}({}))}");
    }

}
