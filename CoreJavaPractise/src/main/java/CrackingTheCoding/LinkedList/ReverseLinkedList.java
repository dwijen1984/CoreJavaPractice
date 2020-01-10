package CrackingTheCoding.LinkedList;

import org.junit.Test;

public class ReverseLinkedList {

    public void reserveLinkedList(SingleLinkedList sl){
        Node head = sl.head;
        SingleLinkedList reverseList = new SingleLinkedList();
        while(head != null){
            reverseList.addAtEnd(head.value);
            head = head.next;
        }
        sl.printAllNode(sl);
        System.out.println("-----------");
        reverseList.printAllNode(reverseList);
    }

    @Test
    public void testReverserLinkedList(){
        SingleLinkedList sl = new SingleLinkedList();
        sl.add(4);
        sl.add(3);
        sl.add(2);
        sl.add(1);
        reserveLinkedList(sl);
    }
}
