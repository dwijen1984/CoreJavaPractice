package CrackingTheCoding.LinkedList;

import org.junit.Test;

public class SingleLinkedList{

    Node head = null;

    // This will add at the top or first
    public void add(int value){
        Node newNode= new Node(value);
        if(head == null){
            head = newNode;
            head.next = null;
        }else{
            Node temp = head;
            head = newNode;
            head.next = temp;
        }
    }
    public void addAtEnd(int value){
        Node newNode = new Node(value);
        Node tail = head;
        while(tail != null && tail.next!= null){
            tail = tail.next;
        }
        if(tail != null){
            tail.next = newNode;
        }else{
            tail = newNode;
        }

    }
    public boolean remove(int value){
        Node currentNode = head;
        while(currentNode != null){
            if(currentNode.next != null && currentNode.next.value == value){
                currentNode.next = currentNode.next.next;
                return true;
            }else if (currentNode.value == value ){
                currentNode = currentNode.next;
                return true;
            }
            currentNode = currentNode.next;
        }
        return false;
    }
    public void printAllNode(SingleLinkedList lst){
        Node temp = lst.head;
        while(temp != null){
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    @Test
    public void TestSingleLinkedList(){
        SingleLinkedList lst = new SingleLinkedList();
        lst.add(1);
        lst.add(2);
        lst.add(3);
        lst.add(4);
        lst.add(5);
        //printAllNode(lst);
        lst.addAtEnd(7);
        printAllNode(lst);
        /*lst.remove(3);
        printAllNode(lst);*/


    }


}
