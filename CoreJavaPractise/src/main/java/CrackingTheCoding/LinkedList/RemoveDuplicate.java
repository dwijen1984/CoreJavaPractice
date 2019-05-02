package CrackingTheCoding.LinkedList;

import org.junit.Test;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

/*
For example if the linked list is 12->11->12->21->41->43->21 then removeDuplicates() should convert the list to 12->11->21->41->43.
 */
public class RemoveDuplicate {
    public void removeduplicateUsingJava8(List<Integer> lstval){
        List<Integer> lst = lstval;
        List<Integer> ls = lst.stream().distinct().collect(Collectors.toList());

        ls.stream().forEach(x-> System.out.println(x));
    }
    public void removeDuplicate(SingleLinkedList lst){
        Node ptr1 = lst.head;
        Node ptr2;
        while(ptr1!= null & ptr1.next != null){
            ptr2 = ptr1;
            while(ptr2.next != null){
                if(ptr1.value == ptr2.next.value){
                    ptr2.next = ptr2.next.next;
                }else{
                    ptr2 = ptr2.next;
                }
            }

        ptr1 = ptr1.next;
        }
    }

    @Test
    public void testRemoveDuplicate(){
        SingleLinkedList sl = new SingleLinkedList();
        sl.add(12);
        sl.add(11);
        sl.add(12);
        sl.add(21);
        sl.add(41);
        sl.add(43);
        sl.add(21);
        //sl.printAllNode(sl);
        removeDuplicate(sl);
        sl.printAllNode(sl);
    }

    @Test
    public void testRemoveduplicateUsingJava8(){
        List<Integer> sl = new LinkedList<>();
        sl.add(12);
        sl.add(11);
        sl.add(12);
        sl.add(21);
        sl.add(41);
        sl.add(43);
        sl.add(21);
        removeduplicateUsingJava8(sl);
    }
}
