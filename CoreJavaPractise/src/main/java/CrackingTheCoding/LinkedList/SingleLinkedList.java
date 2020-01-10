package CrackingTheCoding.LinkedList;

import org.junit.Test;

public class SingleLinkedList{

    Node head = null;
    Node tail = null;

    // This will add at the top or first
    public void add(int value){
        Node newNode= new Node(value);
        if(head == null){
            head = newNode;
            tail = head;
            head.next = null;
        }else{
            Node temp = head;
            head = newNode;
            head.next = temp;
            tail = temp;
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
            // This is the tricky part; if u put tail = newNode then everyTime node will be
            // initialized and store into tail and will not be used and hence lost
            head = newNode;
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
        printAllNode(lst);
        System.out.println("-----------");
        SingleLinkedList lst2 = new SingleLinkedList();
        lst2.addAtEnd(1);
        lst2.addAtEnd(2);
        lst2.addAtEnd(3);
        lst2.addAtEnd(4);
        lst2.addAtEnd(5);
        printAllNode(lst2);
        /*lst.remove(3);
        printAllNode(lst);*/


    }


}
