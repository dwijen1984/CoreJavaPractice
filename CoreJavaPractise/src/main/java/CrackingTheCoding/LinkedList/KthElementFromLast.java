package CrackingTheCoding.LinkedList;

import org.junit.Test;

public class KthElementFromLast {
/*
Given a Linked List and a number n, write a function that returns the value at the n’th node from end of the Linked List.
1) Calculate the length of Linked List. Let the length be len.
2) Print the (len – n + 1)th node from the begining of the Linked List.
 */
    public int calculateKthFromLast(SingleLinkedList lst, int distanceFromLast){
        int totalLength = measureDistance(lst);
        int distanceToReach = totalLength - distanceFromLast +1 ;
        Node head = lst.head;
        while(distanceToReach >0){
            if(distanceToReach == 1)
                return head.value;
            else {
                distanceToReach--;
                head = head.next;
            }
        }
        return -1;
    }

    public int measureDistance(SingleLinkedList lst){
        int i = 0;
        Node head = lst.head;
        while(head != null){
            i++;
            head= head.next;
        }
        return i;
    }

    @Test
    public void testReturnKthElementFormLast(){
        SingleLinkedList sl = new SingleLinkedList();
        sl.add(1);
        sl.add(2);
        sl.add(3);
        sl.add(4);
        sl.add(5);
        System.out.println(calculateKthFromLast(sl, 3));
    }
}
