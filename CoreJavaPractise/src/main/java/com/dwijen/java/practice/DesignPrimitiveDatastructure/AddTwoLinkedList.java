package com.dwijen.java.practice.DesignPrimitiveDatastructure;

import org.junit.Test;

public class AddTwoLinkedList {
    public Node addTwoNumbers(Node l1, Node l2) {
        Node l3 = new Node();
        int reminder = 0;
        if(l1 != null || l2 != null){
            l3 = add(l1,l2, reminder);
        }
        return l3;
    }
    public Node add(Node n1, Node n2, int reminder){
        Node n3 = new Node();
        int returnReminder = reminder;
        if(n1 == null && n2 != null){
            returnReminder = haveReminder(n2.value, returnReminder);
            n3.value = (n2.value + returnReminder) %10;
            n3.next = n2.next;
            return add(null, n2.next, returnReminder);
        }if (n2 == null && n1 != null){
            returnReminder = haveReminder(n1.value, returnReminder);
            n3.value = (n1.value+returnReminder)%10;
            n3.next = n1.next;
            return add(n1.next, null, returnReminder);
        }if(n1 != null && n2 != null){
            n3.value = (n1.value + n2.value+ returnReminder)%10;
            returnReminder = haveReminder((n2.value+ n1.value), returnReminder);
            n3.next = add(n1.next, n2.next, returnReminder);
        }if(n1 == null && n2 == null){
            if(returnReminder ==1){
                return new Node(returnReminder);
            }
            return null;
        }
        return n3;
    }
    public int haveReminder(int a, int b){
        if((a + b) >= 10)
            return 1;
        return 0;
    }

    @Test
    public void test(){
        Node l1 = new Node(2);
        l1.next = new Node(4);
        l1.next.next = new Node(3);
        Node l2 = new Node(5);
        l2.next = new Node(6);
        l2.next.next = new Node(4);
        Node output = addTwoNumbers(l1, l2);
        while(output.next != null){
            System.out.print(output.value);
            output = output.next;
            if(output.next == null){
                System.out.print(output.value);
            }

        }
        //System.out.println(output);
    }
}
