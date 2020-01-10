package com.dwijen.PRACTICE;

import java.util.HashMap;
import java.util.Map;

public class LRUCache {
    int capacity;
    Map<Integer, Node> cachedKeys = new HashMap<>();
    DoublyLinkedList list;

    LRUCache(int capacity) {
        this.capacity = capacity;
        this.list = new DoublyLinkedList();
    }

    public int get(int key) {
        if (!cachedKeys.containsKey(key)) {
            return -1;
        }

        Node target = cachedKeys.get(key);
        this.list.moveToStart(target);

        return target.value;
    }

    public void put(int key, int value) {

        if (cachedKeys.size() > this.capacity) {
            return;
        }

        Node target = cachedKeys.get(key);
        if (target != null) {
            this.list.moveToStart(target);
            target.value = value;

            return;
        }

        if (cachedKeys.size() == this.capacity) {
            Node last = this.list.removeLast();
            if (last != null) {
                this.cachedKeys.remove(last.key);
            }

        }

        this.cachedKeys.put(key, this.list.add(key, value));
    }

    class Node {
        int key;
        int value;
        Node next;
        Node previous;

        Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    class DoublyLinkedList {
        Node head;
        Node tail;

        DoublyLinkedList() {
            head = new Node(-1, -1);
            tail = new Node(-1, -1);
            head.next = tail;
            tail.previous = head;
        }

        public void moveToStart(Node node) {
            node.previous.next = node.next;
            node.next.previous = node.previous;

            node.next = head.next;
            node.next.previous = node;
            node.previous = head;
            head.next = node;
        }

        public Node getLastNode() {
            return tail.previous;
        }

        public Node add(int key, int value) {
            Node node = new Node(key, value);
            node.next = head.next;
            node.previous = head;
            head.next.previous = node;
            head.next = node;

            return node;
        }

        public void remove(Node node) {

            if (node == head || node == tail) {
                return;
            }

            node.next.previous = node.previous;
            node.previous.next = node.next;

        }

        public Node removeLast() {
            Node node = tail.previous;

            if (node == head) {
                return null;
            }

            tail.previous = node.previous;
            node.previous.next = tail;

            return node;
        }

        public String toString() {
            String dll = "";

            Node current = head.next;
            while (current != tail) {
                dll += " <-[" + current.previous.key + "< " + current.key + ":" + current.value + " >" + current.next.key + "]-> ";
                current = current.next;
            }

            return dll;
        }
    }
}
