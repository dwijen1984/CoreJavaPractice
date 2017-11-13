package com.dwijen.java.practice.DesignPrimitiveDatastructure;

public class DjLinkedList {
    public Node head = null;

    public DjLinkedList(){

    }

    public void addNode(int value){
        Node newNode = new Node(value);
        if(head == null){
            head = newNode;
            head.next = null;
        }else{
          Node tmp = head;
          head = newNode;
          head.next = tmp;
        }
    }

    public boolean deleteNode(int value){
            if(head.value == value){
                head = head.next;
                return true;
            }else {
                while(true){
                    if(head.next == null || head.next.value == value){
                        break;
                    }else{
                        head = head.next;
                        head.next = head.next.next;
                    }
                }
            }
            if(head.next != null){
                head.next = head.next.next;
                return true;
            }else{
                return false;
            }
    }

    public void printAllNodes(){
        while(head != null){
            System.out.println(head.value);
            head = head.next;
        }
    }
}
