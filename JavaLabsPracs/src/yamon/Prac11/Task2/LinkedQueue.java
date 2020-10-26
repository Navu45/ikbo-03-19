package yamon.Prac11.Task2;

/*
n >= 0
для любого i = 1...n : [i] != null
*/

import java.util.Arrays;

public class LinkedQueue extends AbstractQueue implements Queue{

    Node head = null, end = null;


    public void enqueue(Object t) {
        assert t != null;
        if (isEmpty()) {
            head = new Node(t, null);
            end = head;
        }
        else {
            end.next = new Node(t, null);
            end = end.next;
        }
        size++;
    }

    public Object element() {
        assert size() > 0;
        return head;
    }

    public Object dequeue() {
        assert size() > 0;
        Object obj = head.value;
        head = head.next;
        return obj;
    }

    public void clear() {
        head = null;
        end = null;
    }

    private class Node {
        private Object value;
        private Node next;

        public Node(Object value, Node next) {
            assert value != null;

            this.value = value;
            this.next = next;
        }
    }
}
