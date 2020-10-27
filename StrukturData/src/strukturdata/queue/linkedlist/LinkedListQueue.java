package queue.linkedlist;

import linkedlist.singly.Node;
import linkedlist.singly.SinglyLinkedList;
import queue.Queue;

public class LinkedListQueue extends SinglyLinkedList implements Queue {

    @Override
    public void enqueue(Object input) {
        var node = new Node(input);

        addLast(node);
    }

    @Override
    public Object dequeue() {
        var data = peek();

        removeFirst();

        return data;
    }

    public Object peek() {
        return isEmpty() ? null : head.data;
    }
}
