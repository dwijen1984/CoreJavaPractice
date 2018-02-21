package com.dwijen.java.practice.DesignPrimitiveDatastructure;

public class Queue<T> {
    private int size ;
    private int length;
    private int top;
    private int rear;
    private T[] inQueue;

    public Queue(){
        this.size = 50;
        this.top = -1;
        this.rear =-1;
        Object[] obj= new Object[this.size];
        inQueue = (T[]) obj;
    }

    public Queue(int size){
        this.size = size;
        this.top = -1;
        this.rear =-1;
        Object[] obj= new Object[this.size];
        inQueue = (T[]) obj;
    }

    public boolean add(T value){
        if(!isFull()){
            length++;
            //top = 0;
            // this is for cyclic use
            // one the front and rear are same it will add elements again form 0th position
            rear = (rear+1)%size;
            inQueue[rear] = value;
            return true;
        }
        return false;
    }

    public T remove(){
        T returnVal = null;
        if(!isEmpty()){
            length--;
            top = (top + 1) % size;
            returnVal = inQueue[top];


            return returnVal;
        }
        return returnVal;
    }



    public boolean isFull(){
        if(length == this.size){
            return true;
        }else{
            return false;
        }
    }
    public boolean isEmpty(){
        if(length == 0){
            return true;
        }else{
            return false;
        }
    }


}
