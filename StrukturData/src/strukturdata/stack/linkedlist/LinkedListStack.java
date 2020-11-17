package strukturdata.stack.linkedlist;

import linkedlist.singly.Node;
import java.util.EmptyStackException;
import linkedlist.singly.SinglyLinkedList;

public class LinkedListStack extends SinglyLinkedList {

    public void push(Object input) {
        var node = new Node(input);

        addLast(node);
    }

    public Object pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }

        var data = peek();

        removeLast();

        return data;
    }

    public Object peek() {
        return isEmpty() ? null : tail.data;
    }
}
