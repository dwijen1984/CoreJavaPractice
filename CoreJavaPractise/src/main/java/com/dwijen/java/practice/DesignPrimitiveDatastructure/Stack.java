package com.dwijen.java.practice.DesignPrimitiveDatastructure;

import java.util.HashSet;
import java.util.Set;

public class Stack<T> {
    private int size ;
    private int top;
    private T[] inStack;

    public Stack(){
        this.size = 50;
        this.top = -1;
        Object[] obj= new Object[this.size];
        inStack = (T[]) obj;
    }

    public Stack(int size){
        this.size = size;
        this.top = -1;
        Object[] obj= new Object[this.size];
        inStack = (T[]) obj;
    }

    public boolean push(T value){
        if(!isFull()){
            top++;
            inStack[top] = value;
            return true;
        }
        return false;
    }

    public T pop(){
        T returnVal = null;
        if(!isEmpty()){
            returnVal = inStack[top];
            top--;
            return returnVal;
        }
        return returnVal;
    }



    public boolean isFull(){
        if(top == this.size -1){
            return true;
        }else{
            return false;
        }
    }
    public boolean isEmpty(){
        if(top == -1){
            return true;
        }else{
            return false;
        }
    }

}
