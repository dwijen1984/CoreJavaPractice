package com.dwijen.PRACTICE;

import org.junit.Test;

public class SinglyLinkedList {
    public class Node{
        int val; Node next;
        Node(int val){ this.val = val;}
    }
    Node head;
    public boolean add(int val){
        if(head == null){
            head = new Node(val);
            head.next = null;
        }else{
            Node tmp = head;
            head = new Node(val);
            head.next = tmp;
        }
        return true;
    }

    public boolean remove(int val){
        if(head == null)
            return false;
        if(head.val == val){
            head = head.next;
            return true;
        }

        while(head.next != null){
            if(head.next.val == val){
                head.next = head.next.next;
                return true;
            }
            head = head.next;
        }

        return true;
    }

    public void print(){
        Node tmp = head;
        while(tmp != null){
            System.out.print(tmp.val+"-> ");
            tmp = tmp.next;
        }
    }

    @Test
    public void test(){
        SinglyLinkedList sl = new SinglyLinkedList();
        sl.add(1); sl.add(2);sl.add(3);
        sl.remove(3);
        sl.print();
    }
}
