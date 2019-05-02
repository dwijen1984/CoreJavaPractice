package CrackingTheCoding.LinkedList;

import org.junit.Test;

public class DeleteMiddleNodeOfLinkedList {
    /*
    Implement an algorithm to delete a node in the middle (i.e., any node but the first and last node, not necessarily the exact middle) of a singly linked list, given only access to that node.
    EXAMPLE
    Input: the node c from the linked list a - >b- >c - >d - >e- >f
    Result: nothing is returned, but the new linked list looks like a->b->d->e->f
     */

    public SingleLinkedList deleteMiddleNode(SingleLinkedList lst){
        int middlePosition = middleNode(lst);
        Node head = lst.head;int i =0;
        while(head!= null){
            if( middlePosition -1  == i ){
                head.next = head.next.next;
            }
            i++;
            head = head.next;
        }
        return lst;
    }
    public int middleNode(SingleLinkedList lst){
        Node head = lst.head;
        int length =0;
        while(head!= null){
            length++;
            head = head.next;
        }
        return length/2;
    }

    @Test
    public void TestDeleteMiddlePosition(){
        SingleLinkedList sl = new SingleLinkedList();
        sl.add(1);
        sl.add(2);
        sl.add(3);
        sl.add(4);
        sl.add(5);
        sl.add(6);

        deleteMiddleNode(sl);
        sl.printAllNode(sl);
    }
}
