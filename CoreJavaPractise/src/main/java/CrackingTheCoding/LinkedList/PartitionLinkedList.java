package CrackingTheCoding.LinkedList;

import org.junit.Test;

public class PartitionLinkedList {
    /*
    Partition: Write code to partition a linked list around a value x, such that all nodes less than x come before all nodes greater than or equal to x. Ifxis contained within the list, the values of x only need to be after the elements less than x (see below). The partition element x can appear anywhere in the "right partition"; it does not need to appear between the left and right partitions.
    EXAMPLE
    Input: 3 -> 5 -> 8 -> 5 -> 10 -> 2 -> 1[partition=5] Output: 3 -> 1 -> 2 -> 10 -> 5 -> 5 -> 8
     */

    public void partition(SingleLinkedList sl, int pivot){
        SingleLinkedList newSl = new SingleLinkedList();
        Node top = sl.head;
        while(top != null){
            if(top.value<= pivot){
              newSl.add(top.value);
            }else if(top.value > pivot){
                newSl.addAtEnd(top.value);
            }
            top = top.next;
        }
        newSl.printAllNode(newSl);
    }

    /* Divided in two parts
    1. all values less than pivot add to 1st LinkedList top
    2. all values equal tp pivot add to the 1st LinkedList bottom
    3. all values more than pivot add to the second list top

    Finally join 1st list and second list

    */
    public void partitionWithMultiple(SingleLinkedList sl, int pivot){
        SingleLinkedList newSl = new SingleLinkedList();
        SingleLinkedList newSlWithLow = new SingleLinkedList();
        Node top = sl.head;
        while(top != null){
            if(top.value < pivot){
                newSlWithLow.add(top.value);
            }else if (top.value == pivot){
                newSlWithLow.addAtEnd(top.value);
            }
            else if(top.value > pivot){
                newSl.add(top.value);
            }
            top = top.next;
        }
        // This method joins the first and second list
        if(newSlWithLow != null && newSl != null){
            Node middle=newSlWithLow.head;
            while(middle!= null && middle.next != null ){
                middle = middle.next;
            }
            // Assumes that the fiestList is not empty;  you can add null check here also;
            middle.next = newSl.head;

        }
        //newSl.printAllNode(newSl);
        newSlWithLow.printAllNode(newSlWithLow);
    }



    @Test
    public void testLinkedListPartition(){
        SingleLinkedList sl = new SingleLinkedList();
        sl.add(6);
        sl.add(9);
        sl.add(4);
        sl.add(6);
        sl.add(5);
        sl.add(3);
        sl.add(7);

        //partition(sl, 6);
        partitionWithMultiple(sl, 6);
    }
}
