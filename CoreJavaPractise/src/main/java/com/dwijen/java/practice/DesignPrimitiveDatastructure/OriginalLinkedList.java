package com.dwijen.java.practice.DesignPrimitiveDatastructure;

import org.junit.Test;

public class OriginalLinkedList {
    public Node head = null;
    public Node tail = null;
    public void add(Node node) {
        if (head == null && tail == null) {
            head = node;
            tail = node;
            return;
        }else {
            while(tail.next != null){
                tail.next = node ;
                tail = tail.next;
            }
        }
    }
    public Node get(int value ){
        Node temp = head;
        Node temp2 = null;
        if(head.value == value){
            temp = head;
            head = head.next;
            return temp ;
        }
        while(temp.next != null){
            if(temp.next.value == value){
                temp2 = temp.next;
                temp.next  = temp.next.next;
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }
    public void print(){
        Node temp = head;
            while(temp != null){
            System.out.println("Node :"+temp.value);
                temp = temp.next;
        }
    }



}
